package alex.zhurylo.queue;

public interface Queue {

    boolean add(String name);

    boolean remove() ;

    boolean isEmpty();

    String element();

    void reverseOrder();

    void removeAll();

    void shuffle();
}
