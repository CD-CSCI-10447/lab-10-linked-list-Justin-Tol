package edu.desu;

public class SinglyLinkedList<T> {

    private Node<T> headNode;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public boolean delete(T data) {
        if (headNode == null){
            return false;
        }

        Node<T> node = new Node<>(data);
        Node<T> mainNode = headNode;
        while (mainNode.getNextNode() != null) {
            if (mainNode.getNextNode() == node) {
                mainNode.setNextNode(mainNode.getNextNode());
                return true;
            }
            mainNode = mainNode.getNextNode();
        }
        return false;
    }

    public boolean deleteAtEnd() {
        if (headNode == null){
            return false;
        }

        if (headNode.getNextNode() == null) {
            headNode = null;
            return true;
        }

        Node<T> node = headNode;
        while (node.getNextNode() != null) {
            node = node.getNextNode();
        }
        node.setNextNode(null);
        return true;
    }

    public boolean deleteAtHead() {
        if (headNode == null) {
            return false;
        }

        headNode = headNode.getNextNode();
        return true;
    }

    public boolean insertAfter(T previous, T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> lastNode = new Node<>(previous);
        Node<T> mainNode = headNode;
        while (mainNode != null) {
            if (mainNode.getData() == previous) {
                newNode.setNextNode(mainNode.getNextNode());
                lastNode.setNextNode(newNode);
                this.headNode = lastNode;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void insertAtHead(T data){
        Node<T> previousNode = headNode;
        Node<T> node = new Node<>(data);
        node.setNextNode(previousNode);
        this.headNode = node;
    }

    public void insertAtEnd(T data){
        if(headNode == null){
            insertAtHead(data);
            return;
        }
        Node<T> currentNode = headNode;
        while(currentNode.hasNext()){
            Node<T> nextNode = currentNode.getNextNode();
            currentNode = nextNode;
        }
        currentNode.setNextNode(new Node<>(data));
    }

    public boolean contains(T data) {
        Node<T> node = headNode;
        while (node != null){
            if (node.getData() == data) {
                return true;
            }
            node = node.getNextNode();
        }
        return false;
    }

    public String toString(){
        String data = "";
        Node<T> node = headNode;
        while(node != null){
            data += node.getData().toString();
            if(node.hasNext()){
                data += ",";
            }
            node = node.getNextNode();
        }
        return data;
    }
}
