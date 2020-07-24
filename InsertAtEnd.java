public class Main
{

	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
  public static Main insertAtEnd(Main list , int data)
	{
		Node new_n=new Node(data);
		if(list.head==null)
		{
			list.head=new_n;
		}
		else
		{
			Node n1=list.head;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next=new_n;
		}
		return list;
	}
	static void printlist(Main list)
	{
		Node n2=list.head;
		while(n2.next!=null)
		{
			System.out.println(n2.data);
			n2=n2.next;
		}
	}
	public static void main(String[] args) 
	{
		Main list=new Main();
		list=insertAtEnd(list,1);
		list=insertAtEnd(list,2);
		list=insertAtEnd(list,3);
		list=insertAtEnd(list,4);
		list=insertAtEnd(list,5);
		list=insertAtEnd(list,6);
		list=insertAtEnd(list,7);
		list=insertAtEnd(list,8);
		list=insertAtEnd(list,9);
		list=insertAtEnd(list,10);
		printlist(list);
	}
}
