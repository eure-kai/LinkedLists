

public class LinkedList<T> implements List<T> {


    public class Node {

        private T data;
        private Node following;

        public Node(T d) {
            data = d;
        }

        public void setNext(Node n) {
            following = n;
        }

        public Node getNext() {
            return following;
        }

        public T getData() {
            return data;
        }

    }


    public Node head;


    public int getLength() {
        if (head == null) return 0;

        else {
            int count = 1;
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
                count++;
            }

            return count;
        }
    }

    public boolean isEmpty() {
        return (this.getLength() == 0);
    }




    public void insertFront(T data) {
        Node newBox = new Node(data);
        newBox.setNext(head);
        head = newBox;
    }


    public void insertBack(T data) {
        Node newBox = new Node(data);

        if (head == null) head = newBox;

        else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(newBox);
        }
    }



    public void removeFront() {
        Node temp = head.getNext();
        head.setNext(null);
        head = temp;
    }


    public void removeBack() {
        Node temp = head;

        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(null);
    }




    public T get(int index) {

        if (index == 0) {
            return head.getData();

        } else {
            Node temp = head;

            for (int i = 0; i < index; i++) {
                if (temp.getNext() != null) {
                    temp = temp.getNext();


                } else {
                    throw new IndexOutOfBoundsException();
                }

            }

            return temp.getData();

        }
    }



    public void clearAll() {

        while (head.getNext() != null) {
            Node temp = head.getNext();
            head.setNext(null);
            head = temp;
        }

        head = null;

    }



    public String toString() {

        String word;
        Node temp = head;

        StringBuilder wordBuilder = new StringBuilder("[");


        if (this.getLength() == 0) return "[]";

        while (temp.getNext() != null) {
            wordBuilder.append(temp.getData()).append(", ");
            temp = temp.getNext();
        }

        word = wordBuilder.toString();
        word += temp.getData() + "]";

        return word;

    }


}
