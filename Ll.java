package ds;
import java.util.*;
public class List1
{
	int data;
	List1 next;
	public List1(int data,List1 n) {
		// TODO Auto-generated constructor stub
		this.data=data;
		next=n;
	}
	public void setData() {
		 this.data=data;
	}
	public int getData() {
		return data;
	}
	public void setNext(List1 node) {
		this.next = node;
	}
	public List1 getNext() {
		return this.next;
	}
	public String toString() {
	// TODO Auto-generated method stub
		return super.toString();
	}
}
public class Ll 
{
	Ll start;
	Ll end;
	public Ll() {
		// TODO Auto-generated constructor stub\
		start=null;
		end=null;
		int length=0;
	}
	private int length=0;
	List1 head;
	public List1 getHead() {
		return head;
	}
	public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to get size of list  */
    public int getSize()
    {
        return length;
    }
	public void insertAtBegining(int data) {
		List1 ndata=new List1(data, null);
		if(start==null)
		{
			start=ndata;
			end=start;
		}
		length++;
	}
	public void insertAtEnd(List1 node)
	{
		if(head==null)
			head=node;
		else
		{
			List1 P,Q;
			for (P = head; (Q = P.getNext())!=null; P=Q) {
				P.setNext(node);
			}
		length++;
		}
	}
	public void insert(int data,int position)
	{
		if(position<0)
			position=0;
		if(position>length)
		{
			position=length;
					
		}
		if(head==null)
			head=new List1(data);
		else if(position==0)
		{
			List1 temp=new List1(data);
			temp.next=head;
			head=temp;
		}
		else
		{
			List1 temp=head;
			for (int i = 0; i < position; i++) {
				temp=head.getNext();
			}
			List1 newNode=new List1(data);
			newNode.next=temp.next;
			temp.setNext(newNode);
			
		}
		length+=1;
	}
	public void print(List1 node)
	{
		node=head;
		while(node!=null)
		{
			System.out.println(node.getData());
			node=node.getNext();
		}
	}


public static void main(String[] args) 
{
 Ll l=new Ll();	
 l.insert(12, 0);
 l.insert(112, 1);
 l.insert(2, 2);
 l.insert(121, 3);
 l.insert(312, 4);
 l.insert(212, 5);
 l.insert(123, 6);
 l.print(null);
}
}

