package eg.edu.alexu.csd.datastructure.queue.cs34_cs40;

public class QueueLinkedBased implements IQueue, ILinkedBased {

	public class Node {
		
		private Object value;
		private Node next;
		
		public Node (Object v , Node n) {
			value = v;
			next = n;
		}
		
		public Object getValue() {
			return value;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setValue(Object v) {
			value= v;
		}
		
		public void setNext(Node n) {
			next = n;
		}
	}
	
	private int size;
	private Node head;
	private Node tail;
	
	public QueueLinkedBased() {
		size = 0;
	}

	@Override
	public void enqueue(Object item) {
		Node node = new Node (item,null);
		if (isEmpty()) {
			head = node;
		}
		else {
			tail.setNext(node);
		}
		tail = node;
		size ++;
	}

	@Override
	public Object dequeue(){
		if (isEmpty()) {
			return null;
		}
		else {
			Object temp = head.getValue();
			head = head.getNext();
			size --;
			if (isEmpty()) {
				tail = null;
			}
			return temp;
		}
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public int size() {
		return size;
	}

}
