//  Written by Lian Liao
import java.util.*;

public class SJFScheduler extends BasicScheduler {

	public SJFScheduler()
	{
		//using a heap with least lines at top.
		readyQ = new PriorityQueue<BasicPCB>(100, (a,b) -> a.getTotalLines() - b.getTotalLines());
	}
}