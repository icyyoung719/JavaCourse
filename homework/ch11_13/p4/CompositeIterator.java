package homework.ch11_13.p4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class CompositeIterator implements ComponentIterator {
    protected List<ComponentIterator> iterators = new ArrayList<>();

    public CompositeIterator(ComponentIterator iterator) {
        iterators.add(iterator);
    }

    @Override
    public boolean hasNext() {
        if (iterators.size() > 0) {
            ComponentIterator it = iterators.get(0); //取出队列里的第一个迭代器
            if (!it.hasNext()) {  //如果这个迭代器已经迭代完毕
                iterators.remove(0); //从列表里删除这个迭代器
                return hasNext(); //递归调用hasNext
            } else {
                return true;
            }
        } else {
            return false;  //当迭代器列表为空，说明所有元素迭代完毕
        }
    }

    @Override
    public Component next() {
        if (hasNext()) {
            //取出队列里的第一个迭代器
            ComponentIterator it = iterators.get(0);
            //从这个迭代器取出下一个组件
            Component c = it.next();
            iterators.add(c.createIterator());
            return c;
        }
        return null;
    }

//    public static void main(String[] args) {
//        ComponentList a = new ComponentList();
//        CompositeComponent b = new CompositeComponent(3, "c", 10);
//        b.add(new AtomicComponent(4, "d", 20));
//        b.add(new AtomicComponent(5, "f", 80));
//        a.add(b);
//        a.remove(b);
//        a.add(b);
//        a.add(b);
//        System.out.println("a over");
//        CompositeIterator compositeIterator = new CompositeIterator(a);//error
//        System.out.println(compositeIterator.next());
//        while (compositeIterator.hasNext()) {
//            System.out.println(compositeIterator.next());
//        }
//    }
}
