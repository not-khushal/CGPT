package assignment17;

public class Q6 {
    public class Students{
        private String name;
        private String id;
        private int marks;

        public Students(String name, String id, int marks){
            this.name = name;
            this.id = id;
            this.marks = marks;
        }
        public String gradeStatus(int marks){
            String grade = "";
            if(marks>90){
                grade = "A";
            }
            else if(marks>80 && marks<90){
                grade = "B";
            }
            else if(marks>70 && marks<80){
                grade = "C";
            }
            else if(marks>60 && marks<70){
                grade = "D";
            }
            else{
                grade = "F";
            }
            return grade;
        }
        public void displayDetails(){
            System.out.println("Student Name : " + name);
            System.out.println("Student ID : " + id);
            System.out.println("Student Marks : " + marks);
            System.out.println("Student Grades : " + gradeStatus(marks));
        }
    }

    public static void main(String[] args){
        Q6 q6 = new Q6();
        Students stud1 = q6.new Students("Khushal", "RA145", 93);
        Students stud2 = q6.new Students("Arya", "RA146", 78);
        Students stud3 = q6.new Students("Bran", "RA158", 87);

        stud1.displayDetails();
        stud2.displayDetails();
        stud3.displayDetails();
    }

}
