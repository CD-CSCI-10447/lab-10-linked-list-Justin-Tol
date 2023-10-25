package edu.desu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NodeTest {
    @Test
    public void getDataTest01(){
        // Given
        Node<Integer> firstNode = new Node<>(7);

        // When
        Integer expected = 7;
        Integer actual = firstNode.getData();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDataTest01(){
        // Given
        Node<Integer> firstNode = new Node<>(7);

        // When
        Integer expected = 2;
        firstNode.setData(2);
        Integer actual = firstNode.getData();

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void hasNextTest01(){
        Node<Integer> node = new Node<>(19);

        Boolean actual = node.hasNext();

        Assertions.assertFalse(actual);
    }

    @Test
    public void setNextTest02(){
        Node<Integer> node = new Node<>(19);
        Node<Integer> nextNode = new Node<>(20);
        node.setNextNode(nextNode);
        Boolean actual = node.hasNext();

        Assertions.assertTrue(actual);
    }

    @Test
    public void getNextTest01(){
        Node<Integer> node = new Node<>(19);
        Node<Integer> nextNode = new Node<>(20);
        node.setNextNode(nextNode);
        Integer expected =20;
        Integer actual = node.getNextNode().getData();

        Assertions.assertEquals(expected, actual);
    }


}
