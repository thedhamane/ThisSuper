import java.util.List;

public class Student{
    private int rollNo;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marksList=" + marksList +
                '}';
    }

    private List<Integer> marksList;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarksList() {
        return marksList;
    }

    public void setMarksList(List<Integer> marksList) {
        this.marksList = marksList;
    }
}
