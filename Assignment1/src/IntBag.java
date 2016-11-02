/***********************************************************************
				MEMORIAL UNIVERSITY OF NEWFOUNDLAND
			        Faculty of Computer Science
				       Computer Science 2711
				       
	 Assignment #1   	Name: Bryan Power   Student Number: 200675957
                       	Due: 2016.09.23 @ 09:00
***********************************************************************/

public class IntBag {
	public IntBag(){}
	private static class Node{
		private Integer item;
		private Node next;
		public Node(Integer item, Node next){
			this.item = item;
			this.next = next;
		}
		
		public int getItem() {return item;}
		
		public Node getNext(){ return next;}
		
		public void setNext(Node next){this.next = next;}
	}
	
	private Node head = null;
	private Node tail = null;
	private int size = 0;
	
	public void addItem(Integer item){
		head = new Node( item, head);
		if (isEmpty())
			tail = head;
		size++;
	}
	
	public void removeOneItem(Integer item){
		Node temp1 = head;
		Node temp2 = head.getNext();
		
		if(head.getItem() == item){
			head.setNext(null);
			head = temp2;
			size--;
		}
		else{
			
			while(temp2.getItem()!= item){
				if(temp2 == null) return;
				temp1 = temp2;
				temp2 = temp2.next;
			}
			temp1.setNext(temp2.getNext());
			temp2.setNext(null);	
			size--;
		}
	}
	
	public void removeAllItem(Integer item){
		Node temp1 = head;
		Node temp2 = head.getNext();
		
		
		while(temp2 != null){
			
			if(head.getItem() == item){
				head.setNext(null);
				head = temp2;
				temp1 = temp2;
				temp2 = temp2.getNext();
				size--;
			}
			else
			if(temp2.getItem() == item){
				temp1.setNext(temp2.getNext());
				temp2.setNext(null);
				temp2 = temp1.getNext();
				size--;
			}
			else{
			temp1 = temp2;
			temp2 = temp2.next;
			}
		}		
	}
		
	
	
	public Integer itemCount(Integer item){
		int count =0 ;
		Node temp1 = head;
		
		if(isEmpty()) return count;
		
		while(temp1 != null){
			if (temp1.getItem() == item) count++;
			temp1 = temp1.getNext();
		}
		
		return count;
	}
	
	public boolean inBag(Integer item){
	return (itemCount(item) > 0);	
	}
	
	public void printBag(){
		Node temp1 = head;
		if(isEmpty()) System.out.println("The Bag is empty");
		else{
			System.out.println("The bag contains these items:");
			
			while(temp1 != null){
				System.out.println(temp1.getItem());
				temp1 = temp1.getNext();
			}
		}
		
	}

	
	public int getSize() {return size;}
	
	public boolean isEmpty(){return size == 0;}
	
	public Node getHead() {return head;}
	
	public void setHead(Node head) {this.head = head;}
	
	public Node getTail() {return tail;}
	
	public void setTail(Node tail) {this.tail = tail;}
		
}
