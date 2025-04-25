package assignment18;

public class Q9 {
    public class Vehcile{
        String ownerName;
        String vehcileType;
        static int regFees;

        Vehcile(String ownerName, String vehcileType){
            this.ownerName = ownerName;
            this.vehcileType = vehcileType;
            regFees = 10000;
        }
        void displayResults(){
            System.out.println("Name of owner : " + ownerName);
            System.out.println("Type of vehcile : " + vehcileType);
        }
        public void updateRegFees(int newRegFees){
            regFees = newRegFees;
            System.out.println("Updated Registration Fees : " + regFees);
        }
    }
    public static void main(String[] args){
        Q9 q9 = new Q9();
        Vehcile v1 = q9.new Vehcile("Khushal", "Sedan");
        v1.displayResults();
        v1.updateRegFees(15000);
    }
}
