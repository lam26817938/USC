/*
 * Psuedocode for implementation of a group chat server in java
 * By Srihari Nelakuditi for CSCE 416
 */

// Package for I/O related stuff
import java.io.*;

// Package for socket related stuff
import java.net.*;

// Package for list related stuff
import java.util.*;

/*
 * This class does all the group chat server's job
 *
 * It consists of parent thread (code inside main method) which accepts
 * new client connections and then spawns a thread per connection
 *
 * Each child thread (code inside run method) reads messages
 * from its socket and relays the message to the all active connections
 *
 * Since a thread is being created with this class object,
 * this class declaration includes "implements Runnable"
 */
public class GroupChatServer implements Runnable
{
	// Each instance has a separate socket
	private Socket clientSock;
	private static String name;
	// The class keeps track of active clients
	private static List<PrintWriter> clientList=new ArrayList<PrintWriter>();

	// Constructor sets the socket for the child thread to process
	public GroupChatServer(Socket sock)
	{
		clientSock = sock;
	}

	// Add the given client to the active clients list
	// Since all threads share this, we use "synchronized" to make it atomic
	public static synchronized boolean addClient(PrintWriter toClientWriter)
	{
		return(clientList.add(toClientWriter));
	}

	// Remove the given client from the active clients list
	// Since all threads share this, we use "synchronized" to make it atomic
	public static synchronized boolean removeClient(PrintWriter toClientWriter)
	{
		return(clientList.remove(toClientWriter));
	}

	// Relay the given message to all the active clients
	// Since all threads share this, we use "synchronized" to make it atomic
	public static synchronized void relayMessage(
			PrintWriter fromClientWriter, String mesg)
	{
		for (PrintWriter client: clientList){
			if (!client.equals(fromClientWriter))
				client.println(mesg);
		}
		// Iterate through the client list and
		// relay message to each client (but not the sender)
	}

	// The child thread starts here
	public void run()
	{
		// Read from the client and relay to other clients
		String n=name;
		try {
			// Prepare to read from socket
			BufferedReader reader = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
			// Get the client name
			
			// Prepare to write to socket with auto flush on
			PrintWriter writer =new PrintWriter(clientSock.getOutputStream(), true);
			// Add this client to the active client list
			addClient(writer);
			// Keep doing till client sends EOF
			relayMessage(writer, name + " just join the room!" );
			while (true) {
				// Read a line from the client
				String msg = reader.readLine();
				// If we get null, it means client quit, break out of loop
				if (msg == null || msg == ""){
                    System.out.println("bye");
                    break;
				}
				// Else, relay the line to all active clients
			
				relayMessage(writer, name + ": " + msg);
			}
			// Done with the client, remove it from client list
			removeClient(writer);
            writer.close();
		}
		catch (Exception e) {
			System.out.println(n+" disconnect");
			//System.exit(1);
		}
	}

	/*
	 * The group chat server program starts from here.
	 * This main thread accepts new clients and spawns a thread for each client
	 * Each child thread does the stuff under the run() method
	 */
	public static void main(String args[])
	{
		// Server needs a port to listen on
		if (args.length != 1) {
			System.out.println("usage: java GroupChatServer <server port>");
			System.exit(1);
		}

		// Be prepared to catch socket related exceptions
		Socket as=null;
		try {
			// Create a server socket with the given port
			ServerSocket So =new ServerSocket(Integer.parseInt(args[0]));
			// Keep accepting/serving new clients
			while (true) {
				// Wait to accept another client
				System.out.println("Waiting for a client ...");
                as = So.accept();
				BufferedReader justforname = new BufferedReader(
					new InputStreamReader(as.getInputStream()));
				name = justforname.readLine();
                System.out.println("Connected to a client named: "+name);
				// Spawn a thread to read/relay messages from this client
				Thread child = new Thread(new GroupChatServer(as));
                child.start();
			}
		}
		catch(Exception e) {
			System.out.println(e);
			//System.exit(1);
		}
	}
}