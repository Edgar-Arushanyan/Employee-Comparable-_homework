package Comparable_Employee_homework;

import java.util.Arrays;

public class Main {
    /*
   * Создать класс Employee c полями id, name, age, salary.
    Сделать его Comparable по id
    Создать дополнительные возможности сортировки по: salary, age, name а также по ageAndThenName,
    т.е. если возраст одинаковый, то сортировать по имени.
    Создать в классе Main список сотрудников и отсортировать его всеми этими способами
     */
    public static void main(String[] args) {


        Employee empl1 = new Employee(11, "Mike", 30,2500);
        Employee empl2 = new Employee(25, "Rick", 27,1900);
        Employee empl3 = new Employee(14, "Jack", 30,3200);

        Employee[] employees = {empl1,empl2,empl3};


        System.out.println("----------------------By Id...---------------------");
        Arrays.sort(employees);
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("---------------------By Name ---------------------  ");
        Arrays.sort(employees, new NameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("--------------------By Salary ----------------------");
        Arrays.sort(employees, new SalaryComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("--------------------By Age ----------------------");
        Arrays.sort(employees, new AgeComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("------------------ ageAndThenName -----------------");
        Arrays.sort(employees, new ageAndThenNameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

    }
    /*
    ----------------------By Id...---------------------
    id=11, name='Mike', age=30, salary=2500
    id=14, name='Jack', age=30, salary=3200
    id=25, name='Rick', age=27, salary=1900
    ---------------------By Name ---------------------
    id=14, name='Jack', age=30, salary=3200
    id=11, name='Mike', age=30, salary=2500
    id=25, name='Rick', age=27, salary=1900
    --------------------By Salary ----------------------
    id=25, name='Rick', age=27, salary=1900
    id=11, name='Mike', age=30, salary=2500
    id=14, name='Jack', age=30, salary=3200
    --------------------By Age ----------------------
    id=25, name='Rick', age=27, salary=1900
    id=11, name='Mike', age=30, salary=2500
    id=14, name='Jack', age=30, salary=3200
    ------------------ ageAndThenName -----------------
    id=25, name='Rick', age=27, salary=1900
    id=14, name='Jack', age=30, salary=3200
    id=11, name='Mike', age=30, salary=2500

     */
}
