package main;

public class OneWayLinkedList<E> {

    private class Element{
        private E value;
        private E next;

        Element(E data) {
            this.value = data;
        }

        public E getValue() {
            return value;
        }

        public E getNext() {
            return next;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public void setNext(E next) {
            this.next = next;
        }
    }

    Element head = null;

    public OneWayLinkedList() {

    }
}
