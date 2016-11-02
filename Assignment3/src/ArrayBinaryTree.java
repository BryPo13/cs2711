
public class ArrayBinaryTree<E> {
	
	private final int MAX = 100;
	int size = 0;
	
	@SuppressWarnings("unchecked")
	protected E[] tree =(E[]) new Object[MAX];
	
	protected Integer parent(int j) { return (j - 1) / 2; }
	protected Integer left(int j) { return (j*2) + 1; }
	protected Integer right(int j) { return (j * 2) + 2; }
	protected boolean hasLeft(int j) { return (tree[left(j)] != null);}
	protected boolean hasRight(int j) { return (tree[right(j)] != null); }

	
	
	}
	
	