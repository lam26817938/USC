//  Written by Lian Liao
import java.util.*;

public class SRTFScheduler extends BasicScheduler{
	
	public SRTFScheduler()
	{
		// using a heap  with least lines remaining at top.	
		readyQ = new PriorityQueue<BasicPCB>(100, aa );
		
	}
	Comparator<BasicPCB> aa = new Comparator<>() {
		public int compare(BasicPCB a, BasicPCB b) {
			return (a.getTotalLines()-a.getProgramCounter()) - (b.getTotalLines() - b.getProgramCounter());
		}
	};
	public void addProcess(BasicPCB p)
	{
		// here is same
		totalProcesses++;
		readyQ.add(p);
		
		//SRTF is preemptive
		if (runningProcess != null)
			readyQ.add(runningProcess);
		
		dispatch();
	}
}