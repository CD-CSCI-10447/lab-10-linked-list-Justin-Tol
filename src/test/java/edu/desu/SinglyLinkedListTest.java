package edu.desu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    @Test
    public void insertAtHeadTest01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test");

        String expected = "Test";
        String actual = linkedList.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insertAtHeadTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 02");
        String expected = "Test 02,Test 01";
        String actual = linkedList.toString();

        Assertions.assertEquals(expected, actual);
    }
}
