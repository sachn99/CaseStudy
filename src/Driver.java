
public class Driver {

	

	    public static void main(String[] args) {
	    	DoubleLinkedListImp doubleLinkedList = new DoubleLinkedListImp();
	        doubleLinkedList.addNodeFirst(3);
	        doubleLinkedList.addNodeFirst(9);
	        doubleLinkedList.addNodeFirst(40);
	        doubleLinkedList.addNodeFirst(17);
	        doubleLinkedList.addNodeFirst(91);
	        doubleLinkedList.addNodeLast(4);
	        doubleLinkedList.addNodeByIndex(1, 33);
	        System.out.println("Print the list");
	        doubleLinkedList.traverse();
	        System.out.println("Deleting head");
	        doubleLinkedList.removeFirstNode();
	        System.out.println("Print the list after deleting head.");
	        doubleLinkedList.traverse();

	        System.out.println("Deleting tail");
	        doubleLinkedList.removeLastNode();
	        System.out.println("Print the list after deleting tail.");
	        doubleLinkedList.traverse();

	        System.out.println("Deleting from position 3");
	        doubleLinkedList.removeNodeByIndex(9);
	        System.out.println("Print the list after deleting at position 3.");
	        doubleLinkedList.traverse();
	        if( doubleLinkedList.findNode(9)!=-1) {
	        	System.out.println("Node is at index: "+doubleLinkedList.findNode(9));}
	        else System.out.println("Node is not present");

	    }
}
