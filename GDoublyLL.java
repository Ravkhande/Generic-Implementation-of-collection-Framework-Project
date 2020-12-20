package GenericCollection.Doubly;           // Nested packages
import java.lang.*;
import java.util.*;

class Node<T>
{
	public T data;
	public Node next;
	public Node prev;

	public Node(T value)
	{
		data=value;
		next=null;
		prev=null;

	}
}


public class GDoublyLL<T>
{
	public Node Head;

	public GDoublyLL()
	{
		Head=null;
	}

	public <T>void InsertFirst(T no)
	{
		Node newn=new Node(no);

		if(Head==null)         // if LL is empty
		{
			Head=newn;
		}
		else         // if LL is not empty
		{
			newn.next=Head;
		    Head.prev=newn;
		    Head=newn;

		}
	}

	public <T>void InsertLast(T no)
	{
		Node newn=new Node(no);

		if(Head==null)         // if LL is empty
		{
			Head=newn;
		}
		else         // if LL is not empty
		{
			Node temp=Head;

			while(temp.next!=null)
			{
				temp=temp.next;
			}

			temp.next=newn;
			newn.prev=temp;
			newn.next=null;

		}
}

		public void Display()
		{
			Node temp=Head;

			while(temp!=null)
			{
				System.out.print("|"+temp.data+"|<->");
				temp=temp.next;
			}

			System.out.println();

		}

		public int Count()
		{
			int iCnt=0;
			Node temp=Head;

			while(temp!=null)
			{
				iCnt++;
				temp=temp.next;
			}

			return iCnt;
		}


		public void DeleteFirst()
		{
			if(Head==null)         // if LL is empty
			{
				return;
			}
			else if(Head.next==null)       // if LL has only one node
			{
				Head=null;

			}
			else     // if LL has more number of node
			{
				Head=Head.next;
			}
		}


		public void DeleteLast()
		{
			if(Head==null)         // if LL is empty
			{
				return;
			}
			else if(Head.next==null)       // if LL has only one node
			{
				Head=null;

			}
			else     // if LL has more number of node
			{
				Node temp=Head;

				while(temp.next.next!=null)
				{
					temp=temp.next;
				}

				temp.next=null;
			}
		}

		public <T>void InsertAtPos(T no,int pos)
		{
			int size=this.Count();

			if((pos<=0) || (pos>size+1))
			{
				return;
			}
			else if(pos==1)
			{
				this.InsertFirst(no);
			}
			else if(pos==size+1)
			{
				this.InsertLast(no);
			}
			else
			{
				Node temp=Head;
				Node newn=new Node(no);

				for(int i=0;i<pos-1;i++)
				{
					temp=temp.next;
				}

				newn.next=temp.next;
				temp.next.prev=newn;
				newn.prev=temp;
				temp.next=newn;

			}
		}


		public <T>void DeleteAtPos(int pos)
		{
			int size=this.Count();

			if((pos<=0) || (pos>size))
			{
				return;
			}
			else if(pos==1)
			{
				this.DeleteFirst();
			}
			else if(pos==size)
			{
				this.DeleteLast();
			}
			else
			{
				Node temp=Head;

				for(int i=0;i<pos-1;i++)
				{
					temp=temp.next;
				}

				temp.next=temp.next.next;
			}
		}


}