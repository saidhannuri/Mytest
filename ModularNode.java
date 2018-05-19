package ds;

public class ModularNode extends LinkedList {

	public void ModNode(Node head,int k,int length)
	{
		Node mod=null;
		int m=length%k;
		for (int i = 0;head!=null; head=head.next) 
		{
			if(m==0)
			{
				mod=head;
			}
			else 
			{
				if(i<length-m)
				{
					mod=head;
				}
			}
			i++;
		}
		System.out.println(mod.data);
	}
	public void ModFromEnd(Node head,int k,int length)
	{
		Node mod=null;
		int m=length%k;
		for (int i = 0;head!=null; head=head.next) 
		{
			if(m==0&&i<=m)
			{
				mod=head;
			}
			else 
			{
				if(i < m)
				{
					mod=head;
				}
			}
			i++;
		}
		System.out.println(mod.data);
	}
	public static void main(String[] args) {
		LinkedList l3=new LinkedList();
		for (int i = 1; i <=10 ; i++)
		{
			l3.append(i);
		}
		ModularNode m=new ModularNode();
		m.ModNode(head, 3, 10);
		m.ModFromEnd(head, 3, 10);
	}
}

