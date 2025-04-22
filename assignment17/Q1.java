//Program to Display Employee Details
//Problem Statement:
//Write a program to create an Employee class with
//attributes name, id, and salary. Add a method to display the details.

package assignment17;
public class Q1 {

    public class Employee{
        private String name;
        private String id;
        private double salary;

        public Employee(String name, String id, double salary){
            this.name = name;
            this.id = id;
            this.salary = salary;
        }


        public void displayDetails(){
            System.out.println("Employee name : " + name);
            System.out.println("Employee id : " + id);
            System.out.println("Employee salary : " + salary);
        }
    }
    public static void main(String[] args){
        Q1 q1 = new Q1();
        Employee employee1 = q1.new Employee("Khushal", "RA145", 10000);
        Employee employee2 = q1.new Employee("Robert", "RA21187", 20000);

        System.out.println("---Employee 1 details---");
        employee1.displayDetails();
        System.out.println("---Employee 2 details---");
        employee2.displayDetails();

    }}
