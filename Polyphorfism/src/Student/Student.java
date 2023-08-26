package Student;

import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    private String collegeName;
    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getStudentId() == student.getStudentId() && Objects.equals(studentName, student.studentName) && Objects.equals(collegeName, student.collegeName) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId(), studentName, collegeName, address);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(int studentId, String studentName, String colllegeName, String address){
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = colllegeName;
        this.address=address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
