
public class mainx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree theTree = new Tree(); 
		long startTime = System.currentTimeMillis();
		theTree.insert(27, 2.0);
		long endTime = System.currentTimeMillis();
		System.err.println("Insert Time : "+(endTime - startTime));
		theTree.insert(63, 1.0);
		
		theTree.insert(13, 3.5);
		theTree.insert(51, 4.7);
		theTree.insert(80, 5.7);
		
		System.out.println("Delete for Key 80");
		long startTime2 = System.currentTimeMillis();
		theTree.delete(80);
		long endTime2 = System.currentTimeMillis();
		System.err.println("Delete Time : "+(endTime2 - startTime2));

		long startTime3 = System.currentTimeMillis();
		theTree.find(80);
		long endTime3 = System.currentTimeMillis();
		System.err.println("Search Time : "+(endTime3 - startTime3));
		
		theTree.insert(70, 6.0);
		theTree.insert(92, 7.0);
		theTree.insert(82, 8.0);
		theTree.insert(26, 9.0);
		theTree.insert(33, 10.0);
		theTree.insert(58, 11.0);
		theTree.insert(57, 12.0);
		theTree.insert(60, 13.0);
		theTree.inOrder(theTree.getRoot()); 
		System.out.println("Search for 57");
		Node nd = theTree.find(57);
		if(nd == null) {
			System.out.println(" Not Found");
		}else {
			System.out.println(" Found Display Node");
			nd.displayNode();
		}
		
		theTree.insert(50, 56.0);
		theTree.insert(30, 24.0);
		theTree.insert(20, 13.5);
		theTree.insert(40, 15.7);
		theTree.insert(60, 4.0);
		theTree.inOrder(theTree.getRoot());
		System.out.println(); 
		theTree.preOrder(theTree.getRoot());
		System.out.println();
		theTree.preOrder(theTree.getRoot());
		System.out.println();
		
		
	}

}
