import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UnitTests {

    @Test
    public void testGetRoot(){
        BinaryTree binaryTree = new BinaryTree<>();
        BinaryTreeNode node = new BinaryTreeNode<>(1);
        binaryTree.root = node;

        assertEquals(binaryTree.getRoot(), node);
    }
    @Test
    public void testSetRoot(){
        BinaryTree binaryTree = new BinaryTree<>();
        BinaryTreeNode node = new BinaryTreeNode<>(1);
        binaryTree.setRoot(node);

        assertEquals(binaryTree.getRoot(), node);
    }
    @Test
    public void testIsEmpty(){
        BinaryTree binaryTree = new BinaryTree<>();

        assertEquals(binaryTree.isEmpty(), true);
    }

    @Test
    public void testSize(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));

        assertEquals(binaryTree.size(binaryTree.root), 7);
    }
    @Test
    public void testContains(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));

        assertEquals(binaryTree.contains(binaryTree.root, 3), true);
    }
    @Test
    public void testInOrder(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));
        ArrayList<Integer> result = new ArrayList<>();
        result.add(4);
        result.add(2);
        result.add(5);
        result.add(1);
        result.add(6);
        result.add(3);
        result.add(7);

        assertEquals(binaryTree.inOrder(binaryTree.root), result);
    }
    @Test
    public void testPreOrder(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(4);
        result.add(5);
        result.add(3);
        result.add(6);
        result.add(7);

        assertEquals(binaryTree.preOrder(binaryTree.root), result);
    }
    @Test
    public void testPostOrder(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));
        ArrayList<Integer> result = new ArrayList<>();
        result.add(4);
        result.add(5);
        result.add(2);
        result.add(6);
        result.add(7);
        result.add(3);
        result.add(1);

        assertEquals(binaryTree.postOrder(binaryTree.root), result);
    }
    @Test
    public void testLevelOrder(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(6);
        result.add(7);

        assertEquals(binaryTree.levelOrder(binaryTree.root), result);
    }
    @Test
    public void testHeight(){
        BinaryTree binaryTree = new BinaryTree<>();

        binaryTree.root = new BinaryTreeNode<>(1);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(2));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(3));
        binaryTree.root.getLeftChild().setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.getLeftChild().setRightChild(new BinaryTreeNode<>(5));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(6));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(7));

        assertEquals(binaryTree.height(binaryTree.root), 3);
    }

    @Test
    public void testInsert(){
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);

        binaryTree.insert(binaryTree.getRoot(),4);
        binaryTree.insert(binaryTree.getRoot(),8);
        binaryTree.insert(binaryTree.getRoot(),3);
        binaryTree.insert(binaryTree.getRoot(),5);
        binaryTree.insert(binaryTree.getRoot(),7);
        binaryTree.insert(binaryTree.getRoot(),9);

        assertEquals(binaryTree.height(binaryTree.root), 3);
    }
    @Test
    public void testFindMin(){
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);

        binaryTree.insert(binaryTree.getRoot(),4);
        binaryTree.insert(binaryTree.getRoot(),8);
        binaryTree.insert(binaryTree.getRoot(),3);
        binaryTree.insert(binaryTree.getRoot(),5);
        binaryTree.insert(binaryTree.getRoot(),7);
        binaryTree.insert(binaryTree.getRoot(),9);

        assertEquals(binaryTree.findMin(binaryTree.root), 3);
    }
    @Test
    public void testFindMax(){
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);

        binaryTree.insert(binaryTree.getRoot(),4);
        binaryTree.insert(binaryTree.getRoot(),8);
        binaryTree.insert(binaryTree.getRoot(),3);
        binaryTree.insert(binaryTree.getRoot(),5);
        binaryTree.insert(binaryTree.getRoot(),7);
        binaryTree.insert(binaryTree.getRoot(),9);

        assertEquals(binaryTree.findMax(binaryTree.root), 9);
    }
    @Test
    public void testRemoveElement(){
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);

        binaryTree.insert(binaryTree.getRoot(),4);
        binaryTree.insert(binaryTree.getRoot(),8);
        binaryTree.insert(binaryTree.getRoot(),3);
        binaryTree.insert(binaryTree.getRoot(),5);
        binaryTree.insert(binaryTree.getRoot(),7);
        binaryTree.insert(binaryTree.getRoot(),9);

        assertEquals(binaryTree.height(binaryTree.root), 3);
    }
    @Test
    public void testReBalance(){
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        BinarySearchTree binaryTree = new BinarySearchTree<>();

        binaryTree.root = new BinaryTreeNode<>(6);

        binaryTree.root.setLeftChild(new BinaryTreeNode<>(4));
        binaryTree.root.setRightChild(new BinaryTreeNode<>(8));
        binaryTree.root.getRightChild().setLeftChild(new BinaryTreeNode<>(7));
        binaryTree.root.getRightChild().setRightChild(new BinaryTreeNode<>(9));
        binaryTree.reBalance(binaryTree.inOrder(binaryTree.root), 0, binaryTree.size(binaryTree.root) - 1);


        assertEquals(binaryTree.height(binaryTree.root), 3);
    }

}
