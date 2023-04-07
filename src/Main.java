
public class Main {
    public static void main(String args[]) {
        int Quantity = 7;
        double UnitPrice = 10000;

        double TotalBill = Quantity * UnitPrice;
        System.out.println("Total Bill is: " + TotalBill);

        genBill Obj = new genBill();
        double dis = Obj.CalcDiscount(TotalBill);
        Obj.CalcBill(TotalBill, dis);


    }
}