package alex.zhurylo.view;

import alex.zhurylo.queue.Queue;
import alex.zhurylo.queue.SimpleStack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new SimpleStack();

        queue.add("Masha");
        queue.add("Sasha");
        queue.add("Pasha");

        System.out.println(queue.toString());
        queue.shuffle();
        System.out.println(queue.toString());

    }
}
