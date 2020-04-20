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
        //This test will see if the height method works with a test array that has elements from 1 to 100.
        //Base case
        //
        //Array length: 10
        //Range 1 to 100
        //
        //height: 4
        //
        //Result: The method passed, with the given array and value

        int[] arrayHeight = {76,12,23,66,97,55,1,21,98,69};
        myBinarySearchTreeNode test3 = new myBinarySearchTreeNode(arrayHeight);
        test3.print();
        assertEquals(4, test3.height());
    }

    @org.junit.jupiter.api.Test
    void depth1() {

        //This test will see if the height method works with a test array that has elements from 1 to 100.
        //Base case
        //
        //Array length: 10
        //Range 1 to 100
        //
        //Search value: 64
        //
        //Result: The method failed, with the given array and value. Still working to figure out what is wrong with
        // the method

        int[] arrayDepth = {70,30,91,33,64,36,15,57,75,50};
        myBinarySearchTreeNode test4 = new myBinarySearchTreeNode(arrayDepth);
        test4.print();
        assertEquals(3, test4.depth(64));

    }

    @org.junit.jupiter.api.Test
    void size1() {
        //This test will see if the height method works with a test array that has elements from 1 to 100.
        //In the case there is a set of dup values, 42 and 42, and so the size should be 9
        //
        //Array length: 10
        //Range 1 to 100
        //
        //Size value: 9
        //
        //Result: The method passed, with the given array and value. Additionally the correct error mesage was printed
        //by the method

        int[] arraySize = {62,28,42,67,36,43,75,2,63,42};
        myBinarySearchTreeNode test5 = new myBinarySearchTreeNode(arraySize);
        test5.print();
        assertEquals(9, test5.size());
    }
}