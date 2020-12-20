
package GenericCollection.SinglyC;
import java.lang.*;
import java.util.*;


class Node<T>
{

	public T data;
	public Node next;

	public Node(T value)
	{
         data=value;
         next=null; 
	}

}

public class GSinglyCLL<T>
{
	public Node Head;
	public Node Tail;

	public GSinglyCLL()
	{
		Head=null;
		Tail=null;
	}

	public <T>void InsertFirst(T iValue)
	{
		Node newn=new Node(iValue);

		if(Head==null && Tail==null)       // if LL is empty
		{
			Head=newn;
			Tail=newn;
		}
		else
		{
             newn.next=Head;
             Head=newn;

		}

		Tail.next=Head;
	}


	public <T>void InsertLast(T iValue)
	{
		Node newn=new Node(iValue);

		if(Head==null && Tail==null)       // if LL is empty
		{
			Head=newn;
			Tail=newn;
		}
		else
		{
              Tail.next=newn;
              Tail=newn;
		}

		Tail.next=Head;
	}


	public void Display()
	{
		Node temp=Head;

		do
		{
			System.out.print("|"+temp.data+"|->");
			temp=temp.next;

		}while(temp!=Tail.next);

		System.out.println();

	}
   
    public int Count()
	{
		int iCnt=0;
		Node temp=Head;

		do
		{
		    iCnt++;
			temp=temp.next;

		}while(temp!=Tail.next);

		return iCnt;

	}


	public void DeleteFirst()
	{
		if((Head==null) && (Tail==null))       // if LL is empty
		{
			return;
		}
		else if(Head.next==Tail)       // if LL has one node
		{
			Head=null;
			Tail=null;
		}
		else      // if LL has more number of nodes
		{
			Head=Head.next;

		}

		Tail.next=Head;
	}

    
    public void DeleteLast()
	{
		if((Head==null) && (Tail==null))       // if LL is empty
		{
			return;
		}
		else if(Head.next==Tail)       // if LL has one node
		{
			Head=null;
			Tail=null;
		}
		else      // if LL has more number of nodes
		{
			Node temp=Head;

			while(temp.next.next!=Head)
			{
				temp=temp.next;
			}

			temp.next=null;
			Tail=temp;

		}

		Tail.next=Head;

	}

	public <T>void InsertAtPos(T iValue,int pos)
	{
		int size=this.Count();

		if((pos<=0) || (pos>=size+1))
		{
			return;
		}
		else if(pos==1)
		{
			this.InsertFirst(iValue);
		}
		else if(pos==size+1)
		{
			this.InsertLast(iValue);
		}
		else
		{
			Node temp=Head;
			Node newn=new Node(iValue);

			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}

			newn.next=temp.next;
			temp.next=newn;
		}
	}

	public void DeleteAtPos(int pos)
	{
		int size=this.Count();

		if((pos<=0) || (pos>=size))
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

			for(int i=1;i<pos-1;i++)
			{
				temp=temp.next;
			}

			temp.next=temp.next.next;

		}
	}


}