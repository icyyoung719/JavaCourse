package homework.ch11_13.p4;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class CompositeComponent extends Component {
    protected ComponentList children;

    public CompositeComponent(int id, String name, double price) {
        super(id, name, price);
        children = new ComponentList();
    }

    public CompositeComponent() {
        super();
        children = new ComponentList();
    }

    @Override
    public double calcPrice() {
        double totalPrice = 0;
        for (Component component : children) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void add(Component component) throws UnsupportedOperationException {
        children.add(component);
    }

    @Override
    public ComponentIterator createIterator() {

        return new CompositeIterator(children);
    }

    @Override
    public double getPrice() {
        return this.calcPrice();
    }

    @Override
    public void remove(Component component) throws UnsupportedOperationException {
        if (children.size() > 0) {
            ComponentIterator it = children;
            while (it.hasNext()) {
                Component c = it.next();
                if (c.getId() == component.getId()) {
                    children.remove(c);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder childrenToString = new StringBuilder(super.toString());
        childrenToString.append("\nsub-component of ").append(getName()).append(":\n");
        for (Component component : children) {
            childrenToString.append(component.toString());
        }
        return childrenToString.toString();
    }
//public class CompositeComponent extends Component {
//    protected ComponentList children = new ComponentList();
//
//    public CompositeComponent() {
//    }
//
//    public CompositeComponent(int id, String name, double price) {
//        super(id, name, price);
//    }
//
//    @Override
//    public void add(Component component) throws UnsupportedOperationException {
//        children.add(component);
//    }
//
//    @Override
//    public double calcPrice() {
//        double price = 0;
//        for (Component c : this.children) {
//            price += c.getPrice();
//        }
//        return price;
//    }
//
//    @Override
//    public ComponentIterator createIterator() {
//        return new CompositeIterator(children);
//    }
//
//    @Override
//    public void remove(Component component) throws UnsupportedOperationException {
//        children.remove(component);
//        this.price -= component.getPrice();
//    }
//
//    @Override
//    public double getPrice() {
//        return this.calcPrice();
//    }
//
//    @Override
//    public String toString() {
//        String str = super.toString();
//        String str1 = "";
//        for (Component c : children) {
//            str1 += c.toString();
//        }
//        return str + "sub-components of " + this.getName() + ": \n" + str1;
//    }

//    public static void main(String[] args) {
//        CompositeComponent component = new CompositeComponent(0, "aaa", 10.0);
//        AtomicComponent a = new AtomicComponent(1, "bbb", 20.0);
//        AtomicComponent b = new AtomicComponent(2, "bbb", 20.0);
//        AtomicComponent c = new AtomicComponent(2, "ccc", 20.0);
//        Component[] list = {a, b, c};
//        component.testAdd(component, list);
//    }


//    public static void main(String[] args) {
//        int id = 0;
//        Component mainFrame = new CompositeComponent(id++, "Main frame", 0.0);
//        //创建硬盘对象
//        Component hardDisk = new AtomicComponent(id++, "Hard disk", 1000);
//        //创建电源对象
//        Component powerSupplier = new AtomicComponent(id++, "Power supplier", 500);
//        mainFrame.add(hardDisk);
//        mainFrame.add(powerSupplier);
//        //创建主板对象
//        Component mainBoard = new CompositeComponent(id++, "Main board", 0.0);
//        //创建CPU对象
//        Component cpu = new AtomicComponent(id++, "CPU", 1500.0);
//        //创建显卡对象
//        Component videoCard = new AtomicComponent(id++, "Video card", 900);
//        //创建网卡对象
//        Component networkCard = new AtomicComponent(id++, "Network card", 100);
//        mainBoard.add(cpu);         //cpu加入主板
//        mainBoard.add(videoCard);   //videoCard加入主板
//        mainBoard.add(networkCard); //networkCard加入主板
//        mainFrame.add(mainBoard);   //mainBoard加入主机
//        System.out.println(mainFrame);
//
//        mainFrame.remove(cpu);
//        System.out.println(mainFrame);

//    }
}
