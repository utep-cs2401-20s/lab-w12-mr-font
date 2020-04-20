import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTest {

    @org.junit.jupiter.api.Test
    void insertTest1() {
    //This test will see if the method works with a test array that has elements from 1 to 100.
    //Vary simple base case.
    //
    //Array length: 10
    //Range 1 to 100
    //
    //Insert value: 15
    //
    //Result: The method passed, with the given array and value

        int[] array1 = {12,78,49,70,82,11,73,13,37,44};
        int[] array1Plus15 = {12,78,49,70,82,11,73,13,37,44,15};
        myBinarySearchTreeNode test1 = new myBinarySearchTreeNode(array1);
        myBinarySearchTreeNode test1Exp = new myBinarySearchTreeNode(array1Plus15);
        test1.print();
        test1Exp.print();
        test1.insert(15);
        assertEquals(test1Exp.myValue, test1.myValue);
        assertEquals(test1Exp.right.myValue, test1.right.myValue);
        assertEquals(test1Exp.left.myValue, test1.left.myValue);
        assertEquals(test1Exp.left.myValue, test1.left.myValue);
        assertEquals(test1Exp.right.myValue, test1.right.myValue);
        assertEquals(test1Exp.left.myValue, test1.left.myValue);

    }

    @org.junit.jupiter.api.Test
    void insertTest2() {
        //This test will see if the method works with a test array that has elements from -100 to 100.
        //
        //
        //Array length: 10
        //Range -100 to 100
        //
        //Insert value: 42
        //
        //Result: The method passed, with the given array and value

        int[] array2 = {33,-67,-94,-34,-29,-16,48,51,54,9};
        int[] array2Plus42 = {33,-67,-94,-34,-29,-16,48,51,54,9,42};
        myBinarySearchTreeNode test2 = new myBinarySearchTreeNode(array2);
        myBinarySearchTreeNode test2Exp = new myBinarySearchTreeNode(array2Plus42);
        test2.print();
        test2Exp.print();
        test2.insert(42);
        test2.print();
        assertEquals(test2Exp.myValue, test2.myValue);
        assertEquals(test2Exp.right.myValue, test2.right.myValue);
        assertEquals(test2Exp.left.myValue, test2.left.myValue);


    }

    @org.junit.jupiter.api.Test
    void height() {
    }

    @org.junit.jupiter.api.Test
    void depth() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }
}