package com.company;

public class Node {
    private Node next;
    private Node previous;
    private Toys data;


    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {

        this.next = next;
    }

    public Node getPrevious() {

        return previous;
    }

    public void setPrevious(Node previous) {

        this.previous = previous;
    }

    public Toys getData() {

        return data;
    }

    public void setData(Toys data) {
        this.data = data;
    }
}
