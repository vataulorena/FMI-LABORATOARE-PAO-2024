package Lab3.task7;

import java.util.ArrayList;
import java.util.Collection;

public class UniqueList<T> extends ArrayList<T> {

    public UniqueList() {
        super();
    }

    public UniqueList(Collection<? extends T> c) {
        super(c);
    }

    @Override
    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }
        return super.add(element);
    }

    @Override
    public void add(int index, T element) {
        if (!contains(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T element : c) {
            if (!contains(element)) {
                if (add(element)) {
                    modified = true;
                }
            }
        }
        return modified;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        boolean modified = false;
        for (T element : c) {
            if (!contains(element)) {
                add(index++, element);
                modified = true;
            }
        }
        return modified;
    }
}
