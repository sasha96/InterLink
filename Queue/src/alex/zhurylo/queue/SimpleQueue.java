package alex.zhurylo.queue;

import alex.zhurylo.exception.QueueFailedException;

import java.util.Arrays;

public class SimpleQueue extends AbstractQueue implements Queue {

    @Override
    public boolean remove() throws QueueFailedException {
        if (arrName.length<1){
            throw new QueueFailedException("Queue is empty.Nothing to remove.");
        }
        arrName[0] = null;
        for (int a = 1; a < arrName.length; a++) {
            arrName[a - 1] = arrName[a];
        }
        return false;
    }

    @Override
    public String toString() {
        return "SimpleQueue{" +
                "arrName=" + Arrays.toString(arrName) +
                '}';
    }
}

