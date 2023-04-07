public class genBill {


    public double CalcDiscount(double Total) {
        double Pct;
        if (Total >= 75000) {
            Pct = 25;
        } else if (Total >= 50000 && Total < 75000) {
            Pct = 20;
        } else if (Total >= 20000 && Total < 50000) {
            Pct = 10;
        } else {
            Pct = 0;
        }
        double Dis = Total * Pct / 100;
        System.out.println("This is a discount= " + Dis);
        return Dis;
    }

    public void CalcBill(double tot, double Disc) {
        double BillVal = tot - Disc;
        System.out.println("This is a total billvalue= " + BillVal);
    }


}

