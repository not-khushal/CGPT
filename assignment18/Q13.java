package assignment18;

public class Q13 {
    public static class Employee{
        public double empID;
        protected String department;
        private double salary;

        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }
        public void displayDetails(){
            System.out.println("EMP ID : " + empID);
            System.out.println("EMP DEPT : " + department);
            System.out.println("EMP SALARY : " + salary);
        }
    }
    public class Manager extends Employee{
        public Manager(double empID, String department, double salary){
            this.empID = empID;
            this.department = department;
            setSalary(salary);
        }
    }
    public static void main(String[] args){
        Q13 q13 = new Q13();
        Employee emp1 = q13.new Manager(145, "Sales", 750000);
        emp1.displayDetails();
    }
}
