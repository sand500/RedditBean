package helpers;

public class LinkedNode<T> {
	private LinkedNode<T> next;
	private T data;
	
	public LinkedNode(T data, LinkedNode<T> next) {
		this.next = next;
		this.data = data;
	}
	
	public LinkedNode<T> getNext() {
		return next;
	}
	
	public void setNext(LinkedNode<T> next) {
		this.next = next;
	}
	
	public T getData() {
		return data;
	}
}
