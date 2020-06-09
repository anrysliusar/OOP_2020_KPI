package com.company;


import java.util.*;

public class MySet implements Set<Toys> {
    private Node head;
    private Node tail;
    private int size = 0;


    public MySet() {
    }

    public MySet(Toys toys) {
        add(toys);
    }

    public MySet(Collection<Toys> toys) {
        addAll(toys);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object obj) {
        Iterator<Toys> iterator = this.iterator();
        if (obj instanceof Toys) {
            for (int i = 0; i < size; i++) {
                if ((iterator.next()).equals(obj)) return true;
            }
        }
        return false;

    }


    @Override
    public Object[] toArray() {
        Toys[] arrToys = new Toys[size];
        Iterator<Toys> iterator = this.iterator();
        for (int i = 0; i < size; i++) {
            arrToys[i] = iterator.next();
        }
        return arrToys;
    }

    @Override
    public <T> T[] toArray(T[] a) {

        return a;
    }


    @Override
    public boolean add(Toys toys) {
        Node node = new Node();
        node.setData(toys);

        if (head == null) {
            head = node;


        } else if (!this.contains(node.getData())) {
            tail.setNext(node);
            node.setPrevious(tail);
        } else {
            return false;
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object obj) {
//        Iterator<Toys> iterator = this.iterator();
        if (this.contains(obj)){

            Node posNode = head;

            while (!posNode.getData().equals(obj)){
                 posNode = posNode.getNext();
            }
            if (posNode.getPrevious() == null){
                posNode.getNext().setPrevious(null);
            } else if (posNode.getNext() == null){
                posNode.getPrevious().setNext(null);
            } else {
                posNode.getPrevious().setNext(posNode.getNext());
                posNode.getNext().setPrevious(posNode.getPrevious());
            }
            size--;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object obj : c) {
            if (!contains(obj)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Toys> c) {
        int sizeBefOper = size;
        c.forEach(this::add);
        return sizeBefOper != size;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for (Object obj : c) {
            if(!this.contains(obj)){
                this.remove(obj);
            }
        }

        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        int sizeBefOper = size;
        c.forEach(this::remove);
        return sizeBefOper != size;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<Toys> iterator() {
        return new Iterator<Toys>() {
            private Node currNode = head;
            @Override
            public boolean hasNext() {
                return currNode != null;
            }
            @Override
            public Toys next() {
                Node nextNode = currNode;
                if (currNode != null) {
                    currNode = currNode.getNext();
                } else {
                    throw new NoSuchElementException();
                }
                return nextNode.getData();
            }
        };
    }
}