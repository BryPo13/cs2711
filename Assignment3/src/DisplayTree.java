import java.util.Stack;

public class DisplayTree {
	
	static class Node<E>{
		
		private E element; 
		private Node<E> leftChild;
		private Node<E> rightChild;
		
		
		/***************************
		 * @param e element
		 * @param l  left child
		 * @param r  right child
		 **************************/
		public Node(E e,Node<E> l,Node<E> r){
			element = e;
			leftChild = l;
			rightChild = r;
		}
		
		
	
		/****************************
		 * 
		 * @return element of node
		 * 
		 ***************************/
		public E getElement(){
			return element;
		}
		
		
		
		/****************************
		 * @return left  child of node
		 ***************************/
		public Node<E> getLeftChild(){
			return leftChild;
		}
		
		
		/****************************
		 * @return right child of node
		 ***************************/
		public Node<E> getRightChild(){
			return rightChild;
		}
		
	
		/******************************************************
		 * @param e  sets the element in the node
		 *****************************************************/
		public void setElement (E e){
			element = e;
		}
		
		
		/******************************************************
		 * @param l sets the refrence to the node of the left child
		 **********************************************************/
		public void setLeftChild(Node<E> l){
			leftChild = l;
		}
		
		
		/******************************************************
		 * @param r sets the refrence to the node of the right child
		 *****************************************************/
		public void setRightChild(Node<E> r){
			rightChild = r;
		}

	}
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args){
	
		String expression = "(((1+2)+(3*4))-((5+6)+(7*8)))";      //string to turn into binary tree
		Stack<Node> opStack = new Stack<Node>();				// stack to hold operators
		Stack<Node> numStack = new Stack<Node>();				// stack to hold numbers
		Node<Character> node = null;
		
		
        int x = 0;
        while (x < expression.length()) {						// itterate over the length of the string 
        	char y = expression.charAt(x);
        	if(y == '(' ){
        		x++;
        	}
        	else if(y == '+' || y == '-' || y == '*' || y == '/'){   // if char is an operator pop onto the opStack
        		node = new Node<Character>(y, null,null);
        		opStack.push(node);
        		x++;
        	}
        	else if( y == ')'){										// if char is ")" we need to create a mini tree out of the elements
        		if(!opStack.isEmpty()){								//currently on the two stacks
        		opStack.peek().setRightChild(numStack.pop());
        		opStack.peek().setLeftChild(numStack.pop());
        		numStack.push(opStack.pop());
        		}
        		x++;
        	}
        	else{ node = new Node<Character>(y, null,null);
        		 numStack.push(node);
        		 x++;
        	}
        		
        }
        
        /*******************************************
         * Print Preorder, Inorder, Postorder traversials to show structure of the tree
         *****************************/
        System.out.print("Preorder Traversal  ");
        printPreOrder(numStack.peek());
        
        System.out.println();
        System.out.println();
        System.out.print("Inorder Traversal  ");
        printInOrder(numStack.peek());
        
        System.out.println();
        System.out.println();
        System.out.print("Postorder Traversal  ");
        printPostOrder(numStack.peek());
        
        
    }




	private static void printPreOrder(Node n) {
		if( n == null){return;}
		System.out.print(n.element+" , ");
		printPreOrder(n.leftChild);
		printPreOrder(n.rightChild);
		
	}

	private static void printInOrder(Node n) {
		if( n == null){return;}
		printInOrder(n.leftChild);
		System.out.print(n.element+" , ");
		printInOrder(n.rightChild);
		
	}

	private static void printPostOrder(Node n) {
		if( n == null){return;}
		printPostOrder(n.leftChild);
		printPostOrder(n.rightChild);
		System.out.print(n.element+" , ");
		
	}
				
}
	


