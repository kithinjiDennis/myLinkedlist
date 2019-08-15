
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is my LinkedList Object
		myLinkedList list= new myLinkedList();
		
		//Appending the value 10 my Element
		list.insert(10);
		
		//remove from tail
		list.removeTail(list);
		
		//delete by target value
		
		list.deletebytargetValue(list, 6);

	}

}
