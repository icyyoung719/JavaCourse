package homework.ch11_13.p3;

import java.util.Objects;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class Student extends Person implements Cloneable {
    private int studentId;
    private String department;
    private String classNo;

    public Student() {
        super();
        this.studentId = 0;
        this.department = null;
        this.classNo = null;
    }

    public Student(String name, int age, int studentId, String department, String classNo) {
        super(name, age);
        this.studentId = studentId;
        this.department = department;
        this.classNo = classNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "studentId=" + studentId +
                ", department='" + department + '\'' +
                ", classNo='" + classNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Student student) {
            return (super.equals(obj)) && (studentId == student.getStudentId()) && Objects.equals(department, student.getDepartment()) && Objects.equals(classNo, student.getClassNo());
        }
        return false;
    }

    @Override
    public Object clone() {
        Student newStudent = (Student) super.clone();
        newStudent.studentId = studentId;
        newStudent.classNo = new String(classNo);
        newStudent.department = new String(department);
        return newStudent;
    }
}
