package DataSerializationforBackup;
import java.io.Serializable;
public class Employee implements Serializable, Backupable {
	private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}
