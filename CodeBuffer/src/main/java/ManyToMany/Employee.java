package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity

public class Employee {
    @Id
    private   int EmpId;
    private   String Name;
    @ManyToMany
    private List<Project> project;

    public Employee() {
    }

    public Employee(int empId, String name, List<Project> project) {
        EmpId = empId;
        Name = name;
        this.project = project;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
