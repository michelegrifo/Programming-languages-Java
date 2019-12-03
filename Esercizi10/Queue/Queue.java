package Queue;
import java.util.*;
import java.io.*;


public interface Queue<E>{
    void enqueue(E element);

    E dequeue() throws NoSuchElementException;

    E top() throws NoSuchElementException;

    void clear();

    int size();

    boolean isEmpty();

}