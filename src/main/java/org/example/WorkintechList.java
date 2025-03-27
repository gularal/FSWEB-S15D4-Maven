package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class WorkintechList extends ArrayList {
    @Override
    public boolean add(Object o) {
        if (!this.contains(o)) {
            boolean added = super.add(o);
            sort();
            return added;
        }
        return false;
    }

    public void sort() {
        Object firstItem = this.get(0);

        if (firstItem instanceof Number) {
            sort(Comparator.comparingInt(a -> ((Number) a).intValue()));
        } else if (firstItem instanceof String) {
            sort(Comparator.comparing(a -> ((String) a)));
        }
    }

    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        sort();
        return removed;
    }
}