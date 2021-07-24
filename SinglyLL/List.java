
public interface List<T>  {

    //returns the length of the list
    int getLength();

    //returns true if the is empty
    boolean isEmpty();

    //inserts a new node at the front
    void insertFront(T t);

    //inserts a new node at the back
    void insertBack(T t);

    //removes the first node
    void removeFront();

    //removes the last node
    void removeBack();

    //returns the data (of type "T") at the given index. Throws an IndexOutofBounds exception if the given index isn't in the list
    T get(int index);

    //deletes everything in the list
    void clearAll();

    String toString();
}
