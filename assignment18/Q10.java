package assignment18;


public class Q10 {
    public static class Student {
        public String rollNo;
        protected String name;
        private double cgpa;
        
        public double getCgpa() {
            return cgpa;
        }
        
        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }
        public void displayDetails(){
            System.out.println("Student Roll Number: " + rollNo);
            System.out.println("Student Name : " + name);
            System.out.println("Student CGPA : " + cgpa);
        }
    }
    
    public class PostgraduateStudent extends Student {
        public PostgraduateStudent(String rollNo, String name, double cgpa) {
            this.rollNo = rollNo;
            this.name = name;
            setCgpa(cgpa);
        }
    }

    public static void main(String[] main){
        Q10 q10 = new Q10();
        Student s1 = q10.new PostgraduateStudent("RA145", "Khushal", 9.3);
        s1.displayDetails();
    }
}
