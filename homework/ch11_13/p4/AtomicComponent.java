package homework.ch11_13.p4;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class AtomicComponent extends Component {
    public AtomicComponent(int id, String name, double price) {
        super(id, name, price);
    }

    public AtomicComponent() {
        super();
    }

    @Override
    public double calcPrice() {
        return price;
    }

    @Override
    public void add(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ComponentIterator createIterator() {
        return new NullIterator();
    }

    @Override
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
