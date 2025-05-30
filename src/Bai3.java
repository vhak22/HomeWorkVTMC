import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        double r = 0.08;
        double ls = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("mời nhâp gốc: ");
        float price = scanner.nextFloat();
        System.out.println("mời nhâp kì hạn: ");
        int year = scanner.nextInt();
        int kihan = year;
        float goc = price;

        //vòng lặp
        do{
            ls = ls +(price*year*r);
            price += ls;
        }while(year-- > 0);

        System.out.println("lãi suất của "+goc+" với kì hạn "+kihan+" năm là: "+ls);
    }
}
