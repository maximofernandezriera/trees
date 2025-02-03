import Trees.*;

public class TestSolution {

    public static void main(String[] args) {

        try {
            // Create leaf nodes (trees)
            BTree watermelon = new DummyTree("Watermelon");
            BTree apple = new DummyTree("Apple");
            BTree grape = new DummyTree("Grape");
            BTree lemon = new DummyTree("Lemon");
            BTree banana = new DummyTree("Banana");
            BTree cherry = new DummyTree("Cherry");
            BTree berry = new DummyTree("Berry");
            BTree orange = new DummyTree("Orange");

            // Create internal nodes and connect them
            BTree sizeMedium = new DummyTree("size is MEDIUM", apple, grape);
            BTree shapeRound = new DummyTree("shape is ROUND", lemon, banana);
            BTree tasteSweet = new DummyTree("taste is SWEET", cherry, berry);
            
            BTree sizeBig = new DummyTree("size is BIG", watermelon, sizeMedium);
            BTree colorYellow = new DummyTree("color is YELLOW", shapeRound, tasteSweet, orange, null);
           

            // Create the root node and connect the final tree
            BTree root = new DummyTree("color is GREEN", sizeBig, colorYellow);

            // Print the tree
            System.out.println("Tree Structure:");
            root.print();

            // Get tree properties
            System.out.println("\nTree Size: " + root.size());
            System.out.println("Tree Height: " + root.height());

        } catch (BTreeException e) {
            System.out.println(e.getMessage());
        }
    }
}
