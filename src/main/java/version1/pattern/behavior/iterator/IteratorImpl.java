package version1.pattern.behavior.iterator;

import java.util.List;

public class IteratorImpl<T> implements Iterator<T> {
    private List<T> list;
    private int position;

    public IteratorImpl(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        return list.get(position++);
    }
}
