package ds;

public class LinkedList {
	static Node head;
	int length=0;
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		// TODO Auto-generated constructor stub
		this.data=data;
		next=null;
	}
}
public void inserAtStart(int data)
{
	Node newNode=new Node(data);
	newNode.next=head;
	head=newNode;
	length++;
}
public void append(int data)
{
	Node newNode=new Node(data);
	if(head==null)
	{
		head=new Node(data);
		return;
	}
	newNode.next=null;
	Node last=head;
	while(last.next!=null)
	{
		last=last.next;
	}
	last.next=newNode;
	length++;
	return;
			
}
public void print()
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data + " ");
		temp=temp.next;
	}
}
public int nthFromEnd(Node temp,int nth)
{
	int m,n=length;
	//System.out.println(n);
	m=n-nth-1;
	//System.out.println(m);
	Node temp2=head;
	for (int i = 0; i< m; i++) {
		temp2=temp2.next;
	}
	return temp2.data;
}
Node reverse(Node node)
{
	
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    node = prev;
    while (node != null) {
        System.out.print(node.data + " ");
        node = node.next;
    }
    return node;
}
public void palindrome(Node node)
{
	
	int size=0;
	Node temp=head;
	Node head2=node;
	while(head2!=null)
	{
		size++;
		head2=head2.next;
	}
	int m=size/2;
	for (int i = 0; i < m; i++) 
	{
	 temp=temp.next;	
	}
	Node temp2=reverse(temp);
	while (temp2 != null) {
        System.out.print(temp2.data + " ");
        temp2 = temp2.next;
    }
}
public Node reversePair(Node head)
{
	Node temp;
	if(head==null || head.next==null)
		return null;
	else
	{
		temp=head.next;
		head.next=temp.next;
		temp.next=head;
		head=temp;
	}
	head.next.next=reversePair(head.next.next);
	Node temp2=head;
	while(temp2!=null)
	{
		System.out.print(temp2.data + " ");
        temp2 = temp2.next;
	}
	return head;
}
public static void main(String[] args) 
{
	LinkedList l=new LinkedList();
	LinkedList l2=new LinkedList();
	l.inserAtStart(20);
	l.append(40);
	l.append(10);
	l.append(22);
	l.append(24);
	l.inserAtStart(2);
	l.inserAtStart(4);
	l.print();
	
	System.out.println("nth node from end is --> "+l.nthFromEnd(null, 3));
	l.reverse(head);
	System.out.println("reverse pair");
	l2.append(1);
	l2.append(2);
	l2.append(3);
	l2.append(4);
	l2.reversePair(head);
	//l.palindrome(head);
}
}

