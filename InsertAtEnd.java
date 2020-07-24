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
  public static Main insertAtBeg(Main list , int data)
	{
		Node data1=new Node(data);
		if(list.head==null)
		{
			list.head=data1;
		}
		else
		{
			Node temp=list.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=data1;
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
		list=insertAtBeg(list,1);
		list=insertAtBeg(list,2);
		list=insertAtBeg(list,3);
		list=insertAtBeg(list,4);
		list=insertAtBeg(list,5);
		list=insertAtBeg(list,6);
		list=insertAtBeg(list,7);
		list=insertAtBeg(list,8);
		list=insertAtBeg(list,9);
		list=insertAtBeg(list,10);
		printlist(list);
	}
}
