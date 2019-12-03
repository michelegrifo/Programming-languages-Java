import java.util.*;
public interface Stack<E>{
    void push(E element);

    E pop() throws NoSuchElementException;

    E top() throws NoSuchElementException;

    void clear();

    int size();

    boolean isEmpty();

}