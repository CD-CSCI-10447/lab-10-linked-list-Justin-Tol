package edu.desu;

public class SinglyLinkedList<T> {

    private Node<T> headNode;

    public SinglyLinkedList(){
    }

    public void insertAtHead(T data){
        Node<T> previousNode = headNode;
        Node<T> node = new Node<>(data);
        node.setNextNode(previousNode);
        this.headNode = node;
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
