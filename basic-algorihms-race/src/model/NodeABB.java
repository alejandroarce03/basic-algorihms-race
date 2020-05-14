package model;

public class NodeABB {

	private NodeABB right;
	private NodeABB left;
	private NodeABB father;
	private long value;
	
	public NodeABB(long v) {
		value=v;
	}

	public NodeABB getRight() {
		return right;
	}

	public void setRight(NodeABB right) {
		this.right = right;
	}

	public NodeABB getLeft() {
		return left;
	}

	public void setLeft(NodeABB left) {
		this.left = left;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
	public void setFather(NodeABB father) {
		this.father =father;
	}
	
	public NodeABB getFather() {
		return father;
	}
}
