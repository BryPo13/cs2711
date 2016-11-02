
public class LeakyStack<E> {
	public static final int MAX = 1000;			 	// array capacity
	private E[] elements; 							// array for elements
	private int t = -1;  							// index of top element
	private int b = 0;								// index of bottom element
	private int size = 0;							// current size of stack
	
	public LeakyStack() {this(MAX);}	
													// default constructor
	public LeakyStack(int max){						//given constructor 
		elements = (E[]) new Object[max];
	}
	public int size(){ return(size);}
	
	public boolean isEmpty(){ return (size == 0);}
	
	public void push(E e){
		if (size() == elements.length){				// when stack is full
			elements[b] = e;
			if(b+1 > elements.length){
				t = b;
				b = 0;
			}
			t = b;
			b++;
		}
		else{
		elements[++t] = e;
		size++;
		}
	}
	
	public E top(){
		if(isEmpty()) 
			return null;
		return elements[t];
	}
	
	public E pop(){
		if(isEmpty()) return null;
		E result = elements[t];
		elements[t] = null;
		if(t == 0){
			t = elements.length-1;
			size--;
		}
		else{
		t--;
		size--;
		}
		return result;
	}
	
}
