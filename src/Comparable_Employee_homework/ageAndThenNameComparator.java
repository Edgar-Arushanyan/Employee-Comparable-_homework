package Comparable_Employee_homework;

import java.util.Comparator;

public class ageAndThenNameComparator implements Comparator<Employee> {

    public int compare(Employee empl1, Employee empl2){

        if (empl1.getAge() == empl2.getAge()){
            return empl1.getName().compareTo(empl2.getName());
        }
        return empl1.getAge() - empl2.getAge();
    }


}
