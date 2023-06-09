package Comparable_Employee_homework;

public class Employee implements Comparable<Employee>{

    private   int id;
    private   String name;
    private   int  age;
    private   int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int compareTo(Employee employee){
        return this.id - employee.getId();
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary
                ;
    }
}
