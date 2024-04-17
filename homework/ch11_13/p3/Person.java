package homework.ch11_13.p3;

import java.util.Objects;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person() {
        name = "default name";
        age = 0;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Person per) {
            return (per.getAge() == age) && Objects.equals(name, per.getName());
        }
        return false;
    }

    @Override
    public Object clone() {
        try {
            Person newPerson = (Person) super.clone();
            newPerson.name = new String(name);
            newPerson.age = age;
            return newPerson;
        } catch (Exception e) {
            System.out.println("Error when clone person " + name);
        }
        return null;
    }
    //test main for Person
//    public static void main(String[] args){
//        Person me =new Person("yange",20);
//        Person he =new Person();
//        he=(Person) me.clone();
//        me.setAge(10);
//        me.setName("yangege");
//        System.out.println(me.toString());
//        System.out.println(he.toString());
//    }
}
