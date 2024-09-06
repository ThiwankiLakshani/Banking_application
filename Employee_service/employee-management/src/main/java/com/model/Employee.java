import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.Auto)
    private int id;
    private String name;
    private int age;
    private String state;
    private String type;
    private int salary;

    public Employee() {
        return id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public String getState(){
        return State;
    }

    public void setState(int State){
        this.State = State;
    }

    public String getType(){
        return Type;
    }

    public void setType(int Type){
        this.Type = Type;
    }

    public int getSalary(){
        return Salary;
    }

    public void setSalary(int Salary){
        this.Salary = Salary;
    }



}
