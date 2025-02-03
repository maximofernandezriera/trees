/*
 * Binary Tree interface
 */
 public class Test {
    public static void main(String args[]) {
        try {
            // First, create nodes. For instance, as follows: 
            BTree<String> colorGreen = new DummyTree<String>("color=GREEN");
            BTree<String> sizeBig = new DummyTree<String>("size=BIG");
            // ...
            
            // Then connect nodes. For instance, as follows:
            colorGreen.insert(sizeBig, BTree.LEFT);
            // ...
        
            // Print the tree and its size and height
        
        } catch(Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
