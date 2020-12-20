

// Generic Implementation of Collection Framework
import GenericCollection.Singly.GSinglyLL;
import GenericCollection.Doubly.GDoublyLL;
import GenericCollection.SinglyC.GSinglyCLL;
import GenericCollection.DoublyC.GDoublyCLL;

import java.lang.*;
import java.util.*;


class GenericCF
{
	public static void main(String args[])
	{
	 GSinglyLL<Integer>obj=new GSinglyLL<Integer>();
	 GDoublyLL<Integer>dobj=new GDoublyLL<Integer>();
	 GSinglyCLL<Integer>cobj=new GSinglyCLL<Integer>();
	 GDoublyCLL<Integer>dcobj=new GDoublyCLL<Integer>();

       	Scanner sobj=new Scanner(System.in);
		int choice=1;
		Integer value=0;

		System.out.println("Enter which Collection Framework you required");
		System.out.println("_____________________________________________");
		System.out.println("1 : Generic Implementation of Collection framework for SinglyLL");
		System.out.println("2 : Generic Implementation of Collection framework for DoublyLL");
		System.out.println("3 : Generic Implementation of Collection framework for Singly circular LL");
		System.out.println("4 : Generic Implementation of Collection framework for Doubly circular LL");
		System.out.println("_______________________________________________");

		int cf=sobj.nextInt();

        switch(cf)
        {
          case 1:
		while(choice!=0)
		{
		
			System.out.println("Generic Implementation of Collection framework for SinglyLL");
			System.out.println("___________________________________________________________");

			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Delete First");
			System.out.println("4 : Delete Last");
			System.out.println("5 : Display");
			System.out.println("6 : Count");
			System.out.println("7 : InsertAtPos");
			System.out.println("8 : DeleteAtPos");
			System.out.println("0 : Exit");

			System.out.println("__________________________________________________________");

            System.out.println("Enter your choice");
			choice =sobj.nextInt();

			switch(choice)
			{
				case 1:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				obj.InsertFirst(value);
				break;

				case 2:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				obj.InsertLast(value);
				break;

				case 3:

				obj.DeleteFirst();
				break;

				case 4:
				obj.DeleteLast();
				break;

				case 5:
				obj.Display();
				break;

				case 6:
				System.out.println("Number of nodes are :"+ obj.count());
				break;

				case 7:
				System.out.println("Enter the value");
				Integer data=sobj.nextInt();

				System.out.println("Enter the position");
				Integer iPos=sobj.nextInt();

				obj.InsertAtPos(data,iPos);
				break;

				case 8:
				System.out.println("Enter the position");
				Integer iPos1=sobj.nextInt();

				obj.DeleteAtPos(iPos1);
				break;


			}

		}

		break;

		case 2:

		while(choice!=0)
		{
			
			System.out.println("Generic Implementation of Collection framework for DoublyLL");
	       	System.out.println("_________________________________________________________");

			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Delete First");
			System.out.println("4 : Delete Last");
			System.out.println("5 : Display");
			System.out.println("6 : Count");
			System.out.println("7 : InsertAtPos");
			System.out.println("8 : DeleteAtPos");
			System.out.println("0 : Exit");

			System.out.println("__________________________________________________________");

            System.out.println("Enter your choice");
			choice =sobj.nextInt();

			switch(choice)
			{
				case 1:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				dobj.InsertFirst(value);
				break;

				case 2:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				dobj.InsertLast(value);
				break;

				case 3:

				dobj.DeleteFirst();
				break;

				case 4:
				dobj.DeleteLast();
				break;

				case 5:
				dobj.Display();
				break;

				case 6:
				System.out.println("Number of nodes are :"+ dobj.Count());
				break;

				case 7:
				System.out.println("Enter the value");
				Integer data=sobj.nextInt();

				System.out.println("Enter the position");
				Integer iPos=sobj.nextInt();

				dobj.InsertAtPos(data,iPos);
				break;

				case 8:
				System.out.println("Enter the position");
				Integer iPos1=sobj.nextInt();

				dobj.DeleteAtPos(iPos1);
				break;


			}

		}

		break;

		case 3:
		while(choice!=0)
		{
			
			System.out.println("Generic Implementation of Collection framework for Singly circular LL");
			System.out.println("___________________________________________________________");

			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Delete First");
			System.out.println("4 : Delete Last");
			System.out.println("5 : Display");
			System.out.println("6 : Count");
			System.out.println("7 : InsertAtPos");
			System.out.println("8 : DeleteAtPos");
			System.out.println("0 : Exit");

			System.out.println("__________________________________________________________");

            System.out.println("Enter your choice");
			choice =sobj.nextInt();

			switch(choice)
			{
				case 1:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				cobj.InsertFirst(value);
				break;

				case 2:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				cobj.InsertLast(value);
				break;

				case 3:

				cobj.DeleteFirst();
				break;

				case 4:
				cobj.DeleteLast();
				break;

				case 5:
				cobj.Display();
				break;

				case 6:
				System.out.println("Number of nodes are :"+ cobj.Count());
				break;

				case 7:
				System.out.println("Enter the value");
				Integer data=sobj.nextInt();

				System.out.println("Enter the position");
				Integer iPos=sobj.nextInt();

				cobj.InsertAtPos(data,iPos);
				break;

				case 8:
				System.out.println("Enter the position");
				Integer iPos1=sobj.nextInt();

				cobj.DeleteAtPos(iPos1);
				break;


			}

		}

		break;

		case 4:
		
		while(choice!=0)
		{
			
			System.out.println("Generic Implementation of Collection framework for Doubly circular LL");
		    System.out.println("_________________________________________________________");
     
			System.out.println("1 : Insert First");
			System.out.println("2 : Insert Last");
			System.out.println("3 : Delete First");
			System.out.println("4 : Delete Last");
			System.out.println("5 : Display");
			System.out.println("6 : Count");
			System.out.println("7 : InsertAtPos");
			System.out.println("8 : DeleteAtPos");
			System.out.println("0 : Exit");

			System.out.println("__________________________________________________________");

            System.out.println("Enter your choice");
			choice =sobj.nextInt();

			switch(choice)
			{
				case 1:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				dcobj.InsertFirst(value);
				break;

				case 2:
				System.out.println("Enter the value");
				value=sobj.nextInt();
				dcobj.InsertLast(value);
				break;

				case 3:

				dcobj.DeleteFirst();
				break;

				case 4:
				dcobj.DeleteLast();
				break;

				case 5:
				dcobj.Display();
				break;

				case 6:
				System.out.println("Number of nodes are :"+ dcobj.Count());
				break;

				case 7:
				System.out.println("Enter the value");
				Integer data=sobj.nextInt();

				System.out.println("Enter the position");
				Integer iPos=sobj.nextInt();

				dcobj.InsertAtPos(data,iPos);
				break;

				case 8:
				System.out.println("Enter the position");
				Integer iPos1=sobj.nextInt();

				dcobj.DeleteAtPos(iPos1);
				break;


			}

		}

       break;
	}
		System.out.println("Thank you for using Generic Implementation of Collection framework in java");
		obj.Head=null;
		
	}
}