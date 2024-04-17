package homework.ch11_13.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class Course implements Cloneable {
    private String courseName;
    private List<Person> students;
    private Person teacher;

    public Course(String courseName, Person teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void register(Person student) {
        if (!(students.contains(student))) {
            students.add(student);
        }
    }

    public String getCourseName() {return courseName;}

    public List<Person> getStudents() {return students;}

    public Person getTeacher() {return teacher;}

    public void unregister(Person student) {students.remove(student);}

    public int getNumberOfStudent() {return students.size();}

    @Override
    public Object clone() {
        try {
            Course newCourse = (Course) super.clone();
            newCourse.courseName = new String(courseName);
            newCourse.teacher = (Faculty) teacher.clone();
            newCourse.students = new ArrayList<>();
            for (Person student : this.students) {
                newCourse.students.add((Student) student.clone()); // 假设Student类也有clone方法
            }
            return newCourse;
        } catch (Exception e) {
            System.out.println("Error when clone course " + courseName);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' + '\n' +
                "   students=" + students + '\n' +
                "   teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Course course) {
            return (this.getNumberOfStudent() == course.getNumberOfStudent()) && (students.containsAll(course.getStudents())) && (teacher.equals(course.getTeacher())) && Objects.equals(courseName, course.getCourseName());
        }
        return false;
    }

}
