package homework.ch11_13.p4;

import java.util.Iterator;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class Test {
    public static void main(String[] args) {
        Component computer = ComponentFactory.create();
        System.out.println("id:" + computer.getId() + ",name:" + computer.getName() + ",price:" + computer.getPrice());
        ComponentIterator it = computer.createIterator();
        while (it.hasNext()) {
            Component c = it.next();
            //注意这里不能打印c.toString(), toString()方法会递归调用子组件的toString()
            System.out.println("id: " + c.getId() + ", name: " +
                    c.getName() + ", price:" + c.getPrice());

        }
    }
}