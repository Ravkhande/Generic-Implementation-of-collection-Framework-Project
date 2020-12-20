
package GenericCollection.Singly;
import java.lang.*;
import java.util.*;

class Node<T>
{
 public T data;
 public Node next;       // Reference of Node class

 public Node(T value)
 {
 	data=value;
 	next=null;
 }

}

public class GSinglyLL<T>
{
	public Node Head;

	public GSinglyLL()
	{
		Head=null;
	}

     public <T>void InsertFirst(T no)
     {
     	Node newn=new Node(no);
     	if(Head==null)
     	{
     		Head=newn;
     	}
     	else
     	{
     		newn.next=Head;
     		Head=newn;
     	}

     }

     public <T>void InsertLast(T no)
     {
     	Node newn=new Node(no);
     	if(Head==null)
     	{
     		Head=newn;
     	}
     	else
     	{
     		Node temp=Head;
     		while(temp.next!=null)
     		{ 	
     			temp=temp.next;

     		}

     		temp.next=newn;
     		
     		
     	}

     }

     public void Display()
     {
     	Node temp=Head;
     	while(temp!=null)
     	{
     		System.out.print("|"+temp.data+"|->");
     		temp=temp.next;

     	}
     	System.out.println();
     }


     public int count()
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
   	if(Head==null)
   	{
   		return;
   	}
   	else
   	{
   		Head=Head.next;
   	}

   }

    public void DeleteLast()
   {
   	if(Head==null)      // if LL is empty
   	{
   		return;
   	}
   	else if(Head.next==null)        // if LL has one node
   	{
   		Head=null;
   		
   	}
   	else
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
   	int size=0;

   	size=this.count();

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
   	int size=0;

   	size=this.count();

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

   		for(int i=1;i<pos-1;i++)
   		{
   			temp=temp.next;

   		}

   		 temp.next=temp.next.next;
   		
   	}

   }



}