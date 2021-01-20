
public interface DoubleLinkedList {


	<T> void addNodeFirst(T data);
	<T> void addNodeLast(T data);
	<T> void removeFirstNode();
	<T> void removeLastNode();
	<T> void addNodeByIndex(int index, T data);
	<T> void removeNodeByIndex(int index);
	<T> int findNode(T data);
}
