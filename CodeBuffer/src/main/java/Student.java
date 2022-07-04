import javax.persistence.*;

@Entity
@Table(name = "Student_Details")
public class Student {
    @Id
    private Long StudentID;
    @Transient
    private String StudentName;
    private String Address;
    private long Contact;
    @Embedded
    private Address address;


    public Student() {
    }

    public Long getStudentID() {
        return StudentID;
    }

    public void setStudentID(Long studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getContact() {
        return Contact;
    }

    public void setContact(long contact) {
        Contact = contact;
    }

    public Student(Long studentID, String studentName, String address, long contact, Address address1) {
        StudentID = studentID;
        StudentName = studentName;
        Address = address;
        Contact = contact;
        this.address = address1;

    }
}
