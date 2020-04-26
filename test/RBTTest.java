import static org.junit.jupiter.api.Assertions.*;

class RBTTest {

    @org.junit.jupiter.api.Test
    void add() {
        iMap<String, String> dictionary = new RedBlackTree<String, String>();
        dictionary.add("homework","tarea");
        dictionary.add("word","palabra");
        dictionary.add("water","agua");
        dictionary.add("chair","silla");
        dictionary.add("table","mesa");

        assertEquals(dictionary.getValue("water"),"agua");
    }

    @org.junit.jupiter.api.Test
    void getValue() {

        iMap<String, String> dictionary = new RedBlackTree<String, String>();
        dictionary.add("homework","tarea");
        dictionary.add("word","palabra");
        dictionary.add("water","agua");
        dictionary.add("chair","silla");
        dictionary.add("table","mesa");

        assertEquals(dictionary.getValue("chair"),"silla");
    }
}

