package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private final int EMPTY = -1;
    private Node last;
    private int i;
    /**
     * dodawanie kolejnego węzła na koniec listy
     * */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }
    /**
     * metoda zwraca true jeżeli lista jest pusta
     * */
    public boolean isEmpty() {
        return last == null;
    }
    /**
     * metoda zwraca true jeżeli lista nie jest pusta
     * */
    public boolean isFull() {
        return last != null;
    }
    /**
     * metoda zwraca ostatni element
     * */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }
    /**
     * metoda zwraca ostatni element
     * oraz usuwa go
     * */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
