package assignment2;

public class Q2 {
    class Marks{
        static double marks(double math, double phy, double chem){
            double avg = (math+phy+chem)/3;
            return avg;
        }
    }
    public static void main(String[] args) {
        double average = Marks.marks(94, 95, 96);
        System.out.println(average);
    }
}
