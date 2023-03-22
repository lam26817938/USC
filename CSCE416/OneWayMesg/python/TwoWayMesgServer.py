# Implementation of a one way message server in python
# By Srihari Nelakuditi for CSCE 416

# Import socket related methods
from socket import *

# Import argv related methods
from sys import *


# Server needs the port number to listen on
if len(argv) != 2:
    print('usage:', argv[0], '<port>')
    exit()

# Get the port on which server should listen */
serverPort = int(argv[1])

# Create the server socket
serverSock = socket(AF_INET, SOCK_STREAM)

# Bind the socket to the given port
serverSock.bind(('', serverPort))

# Set the server for listening */
serverSock.listen()

# Wait to receive a connection request
print('Waiting for a client ...')
clientSock, clientAddr = serverSock.accept()
print('Connected to a client at', clientAddr)

# No other clients, close the server socket
serverSock.close()

# Make a file stream out of client socket
#clientSockFile = clientSock.makefile()

# Keep serving the client
while True:
    # Read a message from the client

    message = clientSock.recv(1024).decode()

    # If no message ==> client closed the connection
    if not message:
        break
    print('Client:', message, end='\n')
    try:
        line=input()
    except: break
    if not line: clientSock.send(' '.encode())
    clientSock.send(line.encode())
    
    # Display the line
print('Client closed connection')
     #   clientSockFile.close()
clientSock.close()
