package homework.ch11_13.p3;

/**
 * @Description main函数的入口
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class CourseTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person teacher = new Faculty("TeacherName", 65, 0000, "professor",
                "www.teacher.email.com");
        Course javaCourse = new Course("Java Language Programming", teacher);
        Person student1 = new Student("aaa", 20, 2017101, "CS", "CS1704");
        Person student2 = new Student("bbb", 21, 2017202, "CS", "CS1705");
        Person student3 = new Student("ccc", 22, 2017303, "CS", "CS1706");
        javaCourse.register(student1);
        javaCourse.register(student2);
        javaCourse.register(student3);
        System.out.println(javaCourse);
        javaCourse.unregister(student3);
        System.out.println(javaCourse);

        Course javaCourse2 = (Course) javaCourse.clone();
        System.out.println(javaCourse.equals(javaCourse2));
        System.out.println(javaCourse.getCourseName() != javaCourse2.getCourseName());
        System.out.println(javaCourse.getTeacher() != javaCourse2.getTeacher());
        System.out.println(javaCourse.getStudents() != javaCourse2.getStudents());
        System.out.println(javaCourse2);
    }
}
