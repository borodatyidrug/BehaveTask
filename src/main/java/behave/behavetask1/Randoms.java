package behave.behavetask1;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    
    protected Random r;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        r = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return r.nextInt(min, max + 1); // т.к. верхняя граница исключена из генерации
            }
        };
    }
    
}
