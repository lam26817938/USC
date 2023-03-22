//  Written by Lian Liao
import java.util.*;

public class RRScheduler extends BasicScheduler {

	private int Quantum, Counter;
	
	public RRScheduler(int q) {
		//Just add counter and quantum.
		readyQ = new LinkedList<BasicPCB>();
		Counter = 0;
		Quantum = q;
	}
	
	public void tick()
	{
		//here is same
		tickCount++;
		updateRunningProcess();
		
		//add new process after every quantum
		Counter++;
		if (Counter > Quantum) {
			readyQ.add(runningProcess);
			Counter = 0;
			dispatch();
		}
		
	}
	
}