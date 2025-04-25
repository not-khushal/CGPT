package assignment18;

public class Q3 {
    public class Person{
        String name;
        int age;
        String city;

        Person(String name, int age, String city){
            this.name = name;
            this.age = age;
            this.city = city;
        }
        Person(Person prevDetails){
            this.name = prevDetails.name;
            this.age = prevDetails.age;
            this.city = prevDetails.city;
        }
        public void displayDetails(){
            System.out.println("Name of Person : " + name);
            System.out.println("Age of Person : " + age);
            System.out.println("City of Person : " + city);
        }
    }
    public static void main(String[] args){
        Q3 q3 = new Q3();
        Person p1 = q3.new Person("Khushal", 23, "Bokaro");
        System.out.println("Original Details (constructor)");
        p1.displayDetails();
        Person p2 = q3.new Person(p1);
        System.out.println("Copied Details (copy constructor)");
        p2.displayDetails();
    }

}
