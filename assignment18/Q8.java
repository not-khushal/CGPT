package assignment18;

public class Q8 {
    public static class Course {
        String courseName;
        String duration;
        int fee;
        static String instituteName;

        Course(String courseName, String duration, int fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
            instituteName = "Reyansh College";
        }

        void displayCourseDetails() {
            System.out.println("Course Name : " + courseName);
            System.out.println("Course Duration : " + duration);
            System.out.println("Course Fee : " + fee);

        }

        public static void updateInstituteName(String newName) {
            instituteName = newName;
            System.out.println("Updated Institute Name: " + instituteName);
        }
    }

    public static void main(String[] args) {
        Course c1 = new Course("Cooking", "4 Years", 85000);
        Course c2 = new Course("Management", "2 Years", 95000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Reyansh College of Hotel Management");
    }
}