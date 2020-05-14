package model;

import java.util.ArrayList;
import java.util.Random;


public class Race {

	private ArrayList<Long> arrayList;
	private NodeLinkedList head;
	private NodeABB root;
	private Circle circleOne;
	private Circle circleTwo;
	
	public Race() {
		arrayList = new ArrayList<Long>();
	}
	
	public void addArrayList(int number) {
		for(int i=0;i<number;i++) {
			Random r = new Random();
			long n = r.nextLong();
			arrayList.add(n);
		}
		
	}
	public void addValueLinkedListIterative(int number) {
		for(int i=0;i<number;i++) {
			if(head==null) {
				Random r = new Random();
				long l = r.nextLong();
				NodeLinkedList n = new NodeLinkedList(l);
				head = n;
			}else {
				Random r = new Random();
				long l = r.nextLong();
				NodeLinkedList n = new NodeLinkedList(l);
				NodeLinkedList current = head; 
				while(current.getNextNode()!=null) {
					current=current.getNextNode();
				}
				current.setNextNode(n);
				n.setPrevNode(current);
			}
			
		}
	}
	public void insertLinkedListRecursive(int number) {
		if(number>0) {
			if(head==null) {
				Random r = new Random();
				long l = r.nextLong();
				NodeLinkedList n = new NodeLinkedList(l);
				head=n;
				number--;
			}
				NodeLinkedList current = head;
				addLinkedListRecursive(current,number);
			
		}
		
	}
	public void addLinkedListRecursive(NodeLinkedList current,int number) {
		
		if(current.getNextNode()==null) {
			Random r = new Random();
			long l = r.nextLong();
			NodeLinkedList n = new NodeLinkedList(l);
			current.setNextNode(n);
			n.setPrevNode(current);
			number--;
			insertLinkedListRecursive(number);
		}else {
			current=current.getNextNode();
			addLinkedListRecursive(current,number);
		}
	}
	public void addABBIterative(int number) {
		for(int i=0; i<number;i++) {
			System.out.println(i);
			Random r = new Random();
			long l = r.nextLong();
			System.out.println(l+"long");
			NodeABB n = new NodeABB(l);
			if(root==null) {
				root = n;
				System.out.println(n.getValue()+"root");
			}else {
				NodeABB current = root;
				NodeABB ex = null;
				while(current!=null) {	 
					    ex=current;
					    if(l<current.getValue()) {
					    	current=current.getLeft();
					    }else {
					    	current=current.getRight();
					    }
					    if(ex==null){
					    	ex=n;
					    }else if(l<ex.getValue()) {
					    	ex.setLeft(n);
					    }else {
					    	ex.setRight(n);
					    }
					}
				}
		}
	}
	public void addABBRecursive(int number) {
		if(number>0) {
			if(root==null) {
				Random r = new Random();
				long l = r.nextLong();
				NodeABB n = new NodeABB(l);
				root = n;
				System.out.println(l+"root");
				number--;
			}
				NodeABB current = root;
				insertABBRecursive(current,number);
			
		}
	}
	
	public void insertABBRecursive(NodeABB current,int number) {
		Random r = new Random();
		long l = r.nextLong();
		NodeABB n = new NodeABB(l);
		if(current.getValue()<l) {
			if(current.getLeft()==null) {
				current.setLeft(n);
				n.setFather(current);
				number--;
				System.out.println(n.getValue()+"tree");
				addABBRecursive(number);
			}else {
				current=current.getLeft();
				insertABBRecursive(current,number);
			}
		}else {
			if(current.getRight()==null) {
				current.setRight(n);
				n.setFather(current);
				number--;
				System.out.println(n.getValue()+"tree");
				addABBRecursive(number);
			}else {
				current=current.getRight();
				insertABBRecursive(current,number);
			}
		}
	}
	public void consultValueArrayListIterative(int n) {
		boolean exist=false;
		addArrayList(n);
		for(int i=0;i<n;i++) {	
			Random r = new Random();
			long l = r.nextLong();
				for(int j=0;j<arrayList.size();i++) {
					if(arrayList.get(j)==l) {
						exist=true;
					}
				}
		}
	}
	public void consultValueLinkedListIterative(int n) {
		addValueLinkedListIterative(n);
		boolean exist=false;
		NodeLinkedList current = head;
		for(int i=0;i<n;i++) {
			Random r = new Random();
			long l = r.nextLong();
			if(current.getValue()==l) {
				exist=true;
			}
			while(current.getNextNode()!=null) {
				current=current.getNextNode();
				if(current.getValue()==l) {
					exist=true;
				}
			}
		}
	}
	public void consultValueLinkedListRecursive(int n) {
		addValueLinkedListIterative(n);
		searchValueLinkedListRecursive(n);
	}
	public void searchValueLinkedListRecursive(int n) {
		if(n>0) {
		Random r = new Random();
		long l = r.nextLong();
		n--;
		searchValueLinkedListRecursive( n, l);
		}
	}
	public void searchValueLinkedListRecursive(int n,long l) {
		boolean exist=false;
		NodeLinkedList current = head;
		if(current!=null) {
			if(current.getValue()==l) {
				exist=true;
				searchValueLinkedListRecursive(n);
			}else {
				current=current.getNextNode();
				searchValueLinkedListRecursive(n, l);
			}
		}
	}
	public void consultValueABBIterative(int n) {
		addABBRecursive(n);
		boolean exist = false;
		NodeABB current = root;
		for(int i=0;i<n;i++) {
			Random r = new Random();
			long l = r.nextLong();
			while(current!=null) {
				if(current.getValue()==l) {
					exist=true;
				}else if(current.getValue()<l) {
					if(current.getLeft().getValue()==l) {
						exist=true;
					}else {
						current=current.getLeft();
					}
				}else if(current.getRight().getValue()==l) {
					exist=true;
				}else {
					current=current.getRight();
				}
				
			}
		}
	}
	public void consultValueABBRecursive(int n) {
		 addABBRecursive(n);
		 searchValueABBRecursive( n);
	}
	public void searchValueABBRecursive(int n) {
		boolean exist=false;
		Random r = new Random();
		long l = r.nextLong();
		if(n>0) {
			if(root!=null) {
				if(root.getValue()==l) {
					exist=true;
				}else {
					searchValueABBRecursive(n,l,root);
				}
			}
		}
	}
	public void searchValueABBRecursive(int n,long l,NodeABB current) {
		boolean exist;
		if(current.getValue()==l) {
			exist=true;
			n--;
			searchValueABBRecursive(n);
		}else if(current.getValue()<l && current.getLeft()!=null) {
			searchValueABBRecursive(n,l,current.getLeft());
		}else if(current.getValue()>l && current.getRight()!=null){
			searchValueABBRecursive(n,l,current.getRight());
		}else {
			exist=false;
			n--;
			searchValueABBRecursive(n);
			
		}
	}
	
	public void deleteValueArrayListIterative(int n ) {
		addArrayList(n);
		for(int i=0;i<n;i++) {
			Random r = new Random();
			long l = r.nextLong();
			for(long j=0;j<arrayList.size();j++) {
				if(l==arrayList.get((int) j)) {
					arrayList.remove(j);
				}
			}
		}
	}
	public void deleteValueArrayListRecursive(int n) {
		addArrayList(n);
		removeValueArrayListRecursive(n);
	}
	public void removeValueArrayListRecursive(int n) {
		Random r = new Random();
		long l = r.nextLong();
		removeValueArrayListRecursive(n,l);
		removeValueArrayListRecursive(n);
		
	}
	public void removeValueArrayListRecursive(int n,long l) {
		if(n>0) {
			if(l==arrayList.get(n)) {
			arrayList.remove(n);
			}
			n--;
			removeValueArrayListRecursive(n, l);
		}
	}
	
	public void deleteValueLinkedListIterative(int n) {
		addValueLinkedListIterative(n);
		NodeLinkedList prev = null;
		NodeLinkedList current = head;
		for(int i=0;i<n;i++) {
			Random r = new Random();
			long l = r.nextLong();
			if(current!=null) {
				if(current.getValue()==l) {
					head = current.getNextNode();
				}else {
					while(current.getNextNode()!=null) {
						prev=current;
						current=current.getNextNode();
						if(current.getValue()==l) {
							prev.setNextNode(current.getNextNode());
							current.getNextNode().setPrevNode(prev);
						}
					  }
					if(current.getValue()==l) {
						prev.setNextNode(null);
						current.setPrevNode(null);
					}
				}
			}
		}
	}
	
	public void deleteValueLinkedListRecursive(int n) {
		addValueLinkedListIterative(n);
		removeValueLinkedListRecursive(n);
	}
	public void removeValueLinkedListRecursive(int n) {
		if(n>0) {
		Random r = new Random();
		long l = r.nextLong();
		removeValueLinkedListRecursive(head,null, l,n);
		}
	}
	public void removeValueLinkedListRecursive(NodeLinkedList current,NodeLinkedList prev,long l,int n) {
		 
		if(current!=null) {
			if(current.getValue()==l && current==head) {
				head=current.getNextNode();
			}else if(current.getValue()==l) {
				prev.setNextNode(current.getNextNode());
				current.getNextNode().setPrevNode(prev);
				removeValueLinkedListRecursive(n--);
			}else {
				prev=current;
				current=current.getNextNode();
				removeValueLinkedListRecursive(current,prev,l,n);
			}
		}else {
			removeValueLinkedListRecursive(n--);
		}
		
	}
	public void deleteValueABBRecursive(int n) {
		addABBRecursive(n);
		removeValueABBRecursive(n);
	}
	public void removeValueABBRecursive( int n) {
		if(n>0) {
			Random r = new Random();
			long l = r.nextLong();
			removeValueABBRecursive(n,root,l);
		}
	}
	public void removeValueABBRecursive(int n,NodeABB current,long l) {
	}
	
	public void moveCircles() {
		
	}
	public void addCircles(double r1,double r2) {
		circleOne = new Circle(r1);
		circleTwo = new Circle(r2);
	}
	
}
