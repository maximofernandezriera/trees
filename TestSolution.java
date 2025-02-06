public class TestSolution {
    public static void main(String args[]) {
        try {
            // Creamos los nodos que representan cada pregunta o fruto
            BTree<String> colorGreen   = new DummyTree<String>("color=GREEN?");
            BTree<String> sizeBig      = new DummyTree<String>("size=BIG?");
            BTree<String> watermelon   = new DummyTree<String>("Watermelon");
            BTree<String> sizeMedium   = new DummyTree<String>("size=MEDIUM?");
            BTree<String> apple        = new DummyTree<String>("Apple");
            BTree<String> grape        = new DummyTree<String>("Grape");

            BTree<String> colorYellow  = new DummyTree<String>("color=YELLOW?");
            BTree<String> shapeRound   = new DummyTree<String>("shape=ROUND?");
            BTree<String> lemon        = new DummyTree<String>("Lemon");
            BTree<String> banana       = new DummyTree<String>("Banana");
            BTree<String> sizeSmall    = new DummyTree<String>("size=SMALL?");
            BTree<String> tasteSweet   = new DummyTree<String>("taste=SWEET?");
            BTree<String> cherry       = new DummyTree<String>("Cherry");
            BTree<String> berry        = new DummyTree<String>("Berry");
            BTree<String> orange       = new DummyTree<String>("Orange");

            // Enlazamos los nodos para formar el árbol de decisión
            // Raíz: "color=GREEN?"
            colorGreen.insert(sizeBig, BTree.LEFT);       // Si es "GREEN?" → tamaño grande
            colorGreen.insert(colorYellow, BTree.RIGHT);  // Si NO es "GREEN?" → preguntamos si es "YELLOW?"

            // Subárbol "size=BIG?"
            sizeBig.insert(watermelon, BTree.LEFT);       // Si es grande → Watermelon
            sizeBig.insert(sizeMedium, BTree.RIGHT);      // Si NO es grande → preguntamos si es mediano

            // Subárbol "size=MEDIUM?"
            sizeMedium.insert(apple, BTree.LEFT);         // Si es mediano → Apple
            sizeMedium.insert(grape, BTree.RIGHT);        // Si NO es mediano → Grape

            // Subárbol "color=YELLOW?"
            colorYellow.insert(shapeRound, BTree.LEFT);   // Si es amarillo → preguntamos si es redondo
            colorYellow.insert(sizeSmall, BTree.RIGHT);   // Si NO es amarillo → preguntamos si es pequeño

            // Subárbol "shape=ROUND?"
            shapeRound.insert(lemon, BTree.LEFT);         // Si es redondo → Lemon
            shapeRound.insert(banana, BTree.RIGHT);       // Si NO es redondo → Banana

            // Subárbol "size=SMALL?"
            sizeSmall.insert(tasteSweet, BTree.LEFT);     // Si es pequeño → preguntamos si es dulce
            sizeSmall.insert(orange, BTree.RIGHT);        // Si NO es pequeño → Orange

            // Subárbol "taste=SWEET?"
            tasteSweet.insert(cherry, BTree.LEFT);        // Si es dulce → Cherry
            tasteSweet.insert(berry, BTree.RIGHT);        // Si NO es dulce → Berry

            // Un ejemplo
            System.out.println("Size: " + colorGreen.size());
            System.out.println("Height: " + colorGreen.height());

        } catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
