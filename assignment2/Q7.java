package assignment2;

public class Q7 {
    public static void main(String[] args) {
        double rad = 6378;
        double rad3 = rad*rad*rad;
        double mrad = 6378*16;
        double mrad3 = mrad*mrad*mrad;
        double vol1 = (4/3)*3.14*rad3;
        double vol2 = (4/3)*3.14*mrad3;
        System.out.println("the total volume of earth in cubic kms is " + vol1);
        System.out.println("the total volume of earth in cubic miles is " + vol2);

    }    
}
