
public class MyLinkedList {
	
	Node head;//reference to represent the head node
	
	
	/**
	 * method used to insert element at the end position where input
	 *  is only data passing by end user
	 * 
	 */
	
	public void insert(int inputdata){
		
		//declare the new node for each new element
		
		Node node = new Node();
		
	node.data=inputdata;//asssign the value
	node.next=null;//bcz of first element or head node
	
	//check for whether the element is head or not ,if head then head==null 
	
	   if(head ==null){
		     head=node;
	   }
	   else{
		   //traverse through the head element to end element after which you want to put your next element
		   
		   Node n = head;
		   
		   while(n.next!=null){//bcz last element next.node ==null
			   
			   n=n.next;//jump to next element
			   
		   }
		   
		   //now cursor at the end position after while loop execution
		   
	     	n.next =node;
	   }
		
	}
	/**
	 * show all the element put into the LinkedList
	 * 
	 */
	
	public void show(){
		
		//traverse from head->end element
		
		Node node=head;
		
		while(node.next!=null){
			
			System.out.print(node.data+",");
			//jump to next element
			node = node.next;
		}
		
		//print for the last element
		System.out.println(node.data);
	}
	 

}
