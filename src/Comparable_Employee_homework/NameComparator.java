package Comparable_Employee_homework;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    public int compare(Employee empl1, Employee empl2){
        return empl1.getName().compareTo(empl2.getName());
    }
}



