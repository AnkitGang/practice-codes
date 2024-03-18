package Double_LinkedList;

public class DoubleNode<T> {
	public T val;
	public DoubleNode<T> next;
	public DoubleNode<T> prev;
	public DoubleNode<T> child;
	
	public DoubleNode(T val) {
		this.val = val;
		next = null;
		prev = null;
		child = null;
	}
}
