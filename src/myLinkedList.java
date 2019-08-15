
public class myLinkedList {
	//head is null this is my first node
	node Head;
	
	//This is my public method
	//This Appends an element/node into the linkedlist
	
	public void insert(int data)
	{
		node element=new node();
		element.data=data;
		element.next=null;
		
		//append at the first node if the list is empty
		if(Head==null)
		{
			Head=element;
		}
		//else append at last position by traveling to last position
		else
		{
			node n=Head;
			
			//travell until n is null
			while(n.next!=null)
			{
				n=n.next;
			}
			
			n.next=element;
		}
	}
	
	public void removeTail(myLinkedList list)
	{
		node element=list.Head;
		
		//travel until next element is null
		while(element!=null)
		{
			element=element.next;
		}
		
		//remove last element
		element.next=null;
		
		
		
		
	}

	//This Method deletes all elements that are greater that the targetValue in myLinkedList
	public void deletebytargetValue(myLinkedList list,int value)
	{
		
		node element=list.Head,previous_node=null;
		
		if(element!=null && element.data > value )
		{
			//if value was found assign head the next value
			list.Head=element.next;
		}
		 
		while (element != null && element.data != value) { 
	            // If element does not hold the value 
	            // continue to next node 
			 previous_node = element; 
			 element = element.next; 
	      }
		  
		   // If the the value was present, it should be at element current 
	        // Therefore the element shall not be null 
	        if (element != null) { 
	            // Since the value is at current element 
	            // Unlink current element  from linked list 
	        	previous_node.next = element.next; 
	  
	            // Display the message 
	            System.out.println(value + " found and deleted"); 
	        }
		
	}
}
