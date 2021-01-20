import java.util.LinkedList;
import java.util.List;

public class Node<T> {

	T data;
	Node<T> previous;
	Node<T> next;

	public Node(T data){
        this.data = data;
        previous = null;
        next = null;
    }

	
}
