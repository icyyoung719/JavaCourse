package homework.ch11_13.p4;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class NullIterator implements ComponentIterator {
    public NullIterator() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Component next() {
        return null;
    }
}
