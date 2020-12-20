
package GenericCollection.DoublyC;

import java.lang.*;
import java.util.*;

class Node<T>
{
	public T data;
	public Node next;
	public Node prev;

	public Node(T iNo)
	{
		data=iNo;
		next=null;
		prev=null;
	}

}

public class GDoublyCLL<T>
{
      public Node Head;
      public Node Tail;

      public GDoublyCLL()
      {
      	    Head=null;
      	    Tail=null;
      }

      public <T>void InsertFirst(T value)
      {
      	Node newn=new Node(value);

      	  if((Head==null) && (Tail==null))      // if LL is empty
      	  {
      	  	Head=newn;
      	  	Tail=newn;
      	  }
      	  else
      	  {
      	  	newn.next=Head;
      	  	newn.prev=Tail;
      	  	Head=newn;
      	  }

      	  Head.prev=Tail;
      	  Tail.next=Head;
      }

      public <T>void InsertLast(T value)
      {
      	Node newn=new Node(value);

      	  if((Head==null) && (Tail==null))      // if LL is empty
      	  {
      	  	Head=newn;
      	  	Tail=newn;
      	  }
      	  else
      	  {
      	        Tail.next=newn;
      	        newn.prev=Tail;
      	        Tail=newn;
      	  }

      	  Head.prev=Tail;
      	  Tail.next=Head;
      }


      public void Display()
      {
      	Node temp=Head;

      	do
      	{
      		System.out.print("|"+temp.data+"|<->");
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
      	if((Head==null) && (Tail==null))      // if LL is empty
      	{
      		return;
      	}
      	else if(Head.next==Tail)     // if LL contain only node
      	{
      		Head=null;
      	}
      	else    // if LL contain more than one node
      	{
      		Head=Head.next;

      	}

      	Head.prev=Tail;
      	Tail.next=Head;
      }


      public void DeleteLast()
      {
      	if((Head==null) && (Tail==null))      // if LL is empty
      	{
      		return;
      	}
      	else if(Head.next==Tail)     // if LL contain only node
      	{
      		Head=null;
      	}
      	else    // if LL contain more than one node
      	{
      		Tail=Tail.prev;

      	}
      	Tail.next=Head;
      	Head.prev=Tail;
      }

      public <T>void InsertAtPos(T value,int pos)
      {
      	int size=this.Count();

      	if((pos<=0) || (pos>=size+1))
      	{
      		return;
      	}
      	else if(pos==1)
      	{
      		this.InsertFirst(value);
      	}
      	else if(pos==size+1)
      	{
      		this.InsertLast(value);
      	}
      	else
      	{
      		Node temp=Head;
      		Node newn=new Node(value);

      		for(int i=1;i<pos-1;i++)
      		{
      			temp=temp.next;
      		}

      		newn.next=temp.next;
      		newn.prev=temp;
      		temp.next=newn;
      		temp.next.prev=newn;

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
      	      temp.next.prev=temp;

      	}

      }


}