package homework.ch11_13.p4;

import java.util.Objects;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public abstract class Component {
    protected int id;
    protected String name;
    protected double price;

    public Component(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Component() {
        id = 0;
        name = null;
        price = 0.0;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ",name:" + name +
                ",price:" + getPrice() + "\n";
    }

    public abstract double calcPrice();

    public abstract void add(Component component);

    public abstract ComponentIterator createIterator();

    public abstract void remove(Component component);

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return calcPrice();}

    public void setPrice(double price) {this.price = price;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;//地址相等
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Component component) {
            return (id == component.getId()) && Objects.equals(name, component.getName()) && (price == component.getPrice());
        }
        return false;
    }
}
