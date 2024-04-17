package homework.ch11_13.p3;

import java.util.Objects;

/**
 * @Description
 * @Author icyyoung
 * @Date 2024/4/15
 */

public class Faculty extends Person {
    private int facultyId;
    private String title;
    private String email;

    public Faculty() {
        super();
        facultyId = 0;
        title = null;
        email = null;
    }

    public Faculty(String name, int age, int facultyId, String title, String email) {
        super(name, age);
        this.facultyId = facultyId;
        this.title = title;
        this.email = email;
    }

    public int getFacultyId() {return facultyId;}

    public void setFacultyId(int facultyId) {this.facultyId = facultyId;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "Faculty{" +
                super.toString() +
                " facultyId=" + facultyId +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Faculty faculty) {
            return (super.equals(obj)) && (facultyId == faculty.getFacultyId()) && Objects.equals(title, faculty.getTitle()) && Objects.equals(email, faculty.getEmail());
        }
        return false;
    }

    @Override
    public Object clone() {
        Faculty newFaculty = (Faculty) super.clone();
        newFaculty.facultyId = facultyId;
        newFaculty.title = new String(title);
        newFaculty.email = new String(email);
        return newFaculty;
    }
}
