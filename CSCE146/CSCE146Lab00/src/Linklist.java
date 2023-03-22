/*
 * Written by Lian Liao
 */
public class Linklist <T>{
	private class ListNode{
		T data;
		ListNode link;
		public ListNode(T aData, ListNode alink){
			data = aData;
			link = alink;
		}
	}
	private ListNode head;
	private ListNode current;
	private ListNode previous;
	private int size;
	public Linklist() {
		head = current = null;
	}
	public void add(T aData) {
		ListNode newNode = new ListNode(aData, null);
		if(head == null) {
			head = current = newNode;
			this.size = 1;
			return;
		}
		ListNode temp = head;
		while(temp.link != null)
			temp = temp.link;
		temp.link = newNode;
		this.size++;
	}
	public void print() {
		ListNode temp = head;
		while(temp != null) {
			String p = temp.data.toString();
			System.out.println("Game: " + p.substring(0, p.indexOf("\t")) + " Console: " + p.substring(p.indexOf("\t") + 1));
			temp = temp.link;
		}
	}
	public boolean hasMore() {
		return current != null;
	}
	public void reset() {
		current = head = null;
		previous = null;
	}
	public void re() {
		current = head;
		previous = null;
	}
	public T getCurrent() {
		if(current == null)
			return null;
		return current.data;
	}
	public void setCurrent(T aData) {
		if(current == null || aData == null)
			return;
		current.data = aData;
	}
	public void addAfterCurrent(T aData) {
		if(current == null)
			return;
		ListNode newNode = new ListNode(aData, current.link);
		current.link = newNode;
		this.size++;
	}
	public void removeCurrent() {
		if(current == head) {
			head = head.link;
			current = head;
		}
		else {
			previous.link = current.link;
			current = current.link;
		}
		if(this.size > 0)
			size--;
	}
	public int getSize() {
		return this.size;
	}
	public void gotoNext() {
		if(current == null) 
			return;
			current = current.link;
	}
	public T getAt(int index) {
		if(index < 0 || index >= size)
			return null;
		ListNode temp = head;
		for(int i=0;i<index;i++)
			temp = temp.link;
		return temp.data;
	}
	public void setAt(int index, T aData) {
		if(index < 0 || index >= size || aData == null)
			return;
		ListNode temp = head;
		for(int i=0;i<index;i++)
			temp = temp.link;
		temp.data = aData;
	}
	public T match(String g, String c) {
		String p = current.data.toString().toLowerCase();
		if(g.equals("*") && c.equals("*")) {
			if(current != null)
				return current.data;
		}else if(g.equals("*")) {
			if(current != null && p.substring(p.indexOf("\t")+1).contains(c.toLowerCase()))
				return current.data;
		}else if(c.equals("*")) {
			if(current != null && p.substring(0,p.indexOf("\t")).contains(g.toLowerCase()))
				return current.data;
		}else {
			if(current != null && p.substring(0,p.indexOf("\t")).contains(g.toLowerCase()) && p.substring(p.indexOf("\t")+1).contains(c.toLowerCase()))
				return current.data;
		}
		return null;
	}
}
