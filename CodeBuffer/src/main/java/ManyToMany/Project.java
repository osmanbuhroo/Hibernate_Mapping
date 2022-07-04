package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity

public class Project {
    @Id
    private int PrjectId;
    private  String ProjectName;
    @ManyToMany(mappedBy = "project")
    private List<Employee> employee;

    public Project() {
    }

    public Project(int prjectId, String projectName, List<Employee> employee) {
        PrjectId = prjectId;
        ProjectName = projectName;
        this.employee = employee;
    }

    public int getPrjectId() {
        return PrjectId;
    }

    public void setPrjectId(int prjectId) {
        PrjectId = prjectId;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
