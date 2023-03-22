package Comparable_Employee_homework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    public int compare(Employee emp1, Employee emp2){
        return emp1.getAge() - emp2.getAge();
    }
}
