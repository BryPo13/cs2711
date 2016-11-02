
public class Test1 {
	public static void main(String args[]){
		IntBag bag = new IntBag();
		int[] a = {1,5,8,8,7,7};
		for(int i = 0; i< a.length; i++){
		bag.addItem(a[i]);
		}
		bag.printBag();
		bag.removeOneItem(7);
		System.out.println("Item count of 7 is: " + bag.itemCount(7));
		bag.removeOneItem(7);
		System.out.println("Item count of 7 is: " + bag.itemCount(7));
		bag.removeAllItem(8);
		bag.printBag();
		bag.removeAllItem(1);
		bag.printBag();
		bag.removeAllItem(1);
	
		bag.printBag();
		System.out.println("Item count of 7 is: " + bag.itemCount(7));
	
	}
}
