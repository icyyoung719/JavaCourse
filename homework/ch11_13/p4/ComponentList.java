package homework.ch11_13.p4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class ComponentList extends ArrayList<Component> implements ComponentIterator {
    private int position;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public ComponentList() {
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < size();
    }

    @Override
    public Component next() {
        if (hasNext()) {
            Component c = get(position);
            position++;
            return c;
        } else {
            return null;
        }
    }

    public ComponentIterator createIterator() {
        return this;
    }
}
