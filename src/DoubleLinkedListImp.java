import java.util.NoSuchElementException;

public class DoubleLinkedListImp<T> implements DoubleLinkedList {

	Node<T> head, tail = null;
	int size;

	@Override
	public <T> void addNodeFirst(T data) {
		// TODO Auto-generated method stub
		Node nodeToBeInserted = new Node(data);
		if (head == null) {
			tail = nodeToBeInserted;
		} else {
			head.previous = nodeToBeInserted;
		}
		nodeToBeInserted.next = head;
		head = nodeToBeInserted;
		size++;
	}

	@Override
	public <T> void addNodeLast(T data) {
		// TODO Auto-generated method stub
		Node nodeToBeInserted = new Node(data);
		tail.next = nodeToBeInserted;
		nodeToBeInserted.previous = tail;
		this.tail = nodeToBeInserted;
		size++;
	}

	@Override
	public <T> void addNodeByIndex(int index, T data) {
		// TODO Auto-generated method stub
		checkPositionIndex(index);
		Node nodeToBeInserted = new Node(data);
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		nodeToBeInserted.previous = temp;
		nodeToBeInserted.next = temp.next;
		temp.next = nodeToBeInserted;
		nodeToBeInserted.next.previous = nodeToBeInserted;
		size++;
	}

	@Override
	public void removeFirstNode() {
		// TODO Auto-generated method stub
		if (size == 0)
			throw new NoSuchElementException();
		Node tmp = head;
		head = head.next;
		head.previous = null;
		size--;
		System.out.println("deleted: " + tmp.data);
	}

	public void removeLastNode() {
		// TODO Auto-generated method stub
		if (size == 0)
			throw new NoSuchElementException();
		Node tmp = tail;
		tail = tail.previous;
		tail.next = null;
		size--;
		System.out.println("deleted: " + tmp.data);

	}

	@Override
	public void removeNodeByIndex(int index) {
		// TODO Auto-generated method stub
		checkElementIndex(index);
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.previous.next = temp.next;
		temp.next.previous = temp.previous;
		size--;
	}

	@Override
	public <T> int findNode(T data) {
		// TODO Auto-generated method stub
		Node temp = head;
		int pos = 0;
		while (temp.data != data && temp.next != null) {
			pos++;
			temp = temp.next;
		}
		if (temp.data != data)
			return -1;

		return (pos + 1);
	}

	public void traverse() {
		StringBuilder result = new StringBuilder("[");
		Node temp = head;
		while (temp.next != null) {
			result.append(temp.data + ", ");
			temp = temp.next;
		}
		result.append(temp.data + "]");
		System.out.println(result.toString());
	}

	private boolean isPositionIndex(int index) {
		return index >= 0 && index <= size;
	}

	private String outOfBoundsMsg(int index) {
		return "Index: " + index + ", Size: " + size;
	}

	private void checkPositionIndex(int index) {
		if (!isPositionIndex(index))
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}

	private void checkElementIndex(int index) {
		if (!isElementIndex(index))
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}
	private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
	public int size() {
		return size;
	}
}
