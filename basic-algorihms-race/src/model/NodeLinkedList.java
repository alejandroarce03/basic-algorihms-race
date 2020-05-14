package model;

public class NodeLinkedList {

	private NodeLinkedList nextNode;
	private NodeLinkedList prevNode;
	private long value;
	
	public NodeLinkedList(long v) {
		value=v;
	}

	public NodeLinkedList getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeLinkedList nextNode) {
		this.nextNode = nextNode;
	}

	public NodeLinkedList getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(NodeLinkedList prevNode) {
		this.prevNode = prevNode;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
}
