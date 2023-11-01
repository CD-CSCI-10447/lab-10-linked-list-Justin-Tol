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
    public void isEmptyTest01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        Boolean actual = linkedList.isEmpty();
        Assertions.assertTrue(actual);
    }

    @Test
    public void isEmptyTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test");
        Boolean actual = linkedList.isEmpty();
        Assertions.assertFalse(actual);
    }

    @Test
    public void insertAfterTest01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("First");
        Boolean actual = linkedList.insertAfter("First", "Second");
        System.out.println(linkedList.toString());
        Assertions.assertTrue(actual);
    }

    @Test
    public void insertAfterTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        Boolean actual = linkedList.insertAfter("First", "Second");
        Assertions.assertFalse(actual);
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

    @Test
    public void insertAtEndTest01(){
        // given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 00");
        linkedList.insertAtEnd("Test 02");
        // when

        String expected = "Test 00,Test 01,Test 02";
        String actual = linkedList.toString();
        // then
        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void insertAtEndTest02(){
        // given
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtEnd("Test 02");
        // when

        String expected = "Test 02";
        String actual = linkedList.toString();
        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void deleteTest01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 00");
        linkedList.insertAtEnd("Test 02");
        linkedList.delete("Test 01");

        //String expected = "Test 00,Test02";
        boolean actual = linkedList.delete("Test 01");

        Assertions.assertFalse(actual);
    }

    @Test
    public void deleteTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        //String expected = "";
        boolean actual = linkedList.delete("Test 5r");

        Assertions.assertFalse(actual);
    }

    @Test
    public void deleteAtEndTest01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 00");
        linkedList.insertAtEnd("Test 02");
        linkedList.deleteAtEnd();

        boolean actual = linkedList.deleteAtEnd();

        Assertions.assertTrue(actual);
    }

    @Test
    public void deleteAtEndTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.deleteAtEnd();

        boolean actual = linkedList.deleteAtEnd();

        Assertions.assertFalse(actual);
    }

    @Test
    public void deleteAtHead01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("123");
        linkedList.insertAtHead("456");
        linkedList.insertAtHead("789");
        linkedList.deleteAtHead();

        boolean actual = linkedList.deleteAtEnd();

        Assertions.assertTrue(actual);
    }

    @Test
    public void deleteAtHead02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        boolean actual = linkedList.deleteAtHead();

        Assertions.assertFalse(actual);
    }

    @Test
    public void containsTest01(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 00");
        linkedList.insertAtEnd("Test 02");
        linkedList.contains("Test 01");

        boolean actual = linkedList.contains("Test 02");

        Assertions.assertTrue(actual);
    }

    @Test
    public void containsTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 00");
        linkedList.insertAtEnd("Test 02");
        linkedList.contains("Winner 01");

        boolean actual = linkedList.contains("Winner 02");

        Assertions.assertFalse(actual);
    }
}

    /*
    @Test
    public void insertAfterTest02(){
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtHead("Test 01");
        linkedList.insertAtHead("Test 02");
        linkedList.insertAfter("Test 02", "MiddleTest");
        linkedList.insertAfter("MiddleTest", "AfterMiddleTest");
        String expected = "Test 02,MiddleTest,AfterMiddleTest,Test 01";
        String actual = linkedList.toString();
        System.out.println(linkedList);

        Assertions.assertEquals(expected, actual);
    }

     */
