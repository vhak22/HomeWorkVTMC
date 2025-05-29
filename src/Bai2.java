import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhâp a: ");
        float a = scanner.nextFloat();
        System.out.println("mời nhâp b ");
        float b = scanner.nextFloat();

        float tong = a+b;
        float hieu = a-b;
        float tich = a*b;
        float thuong = a/b;
        System.out.printf("tổng a&b là: %f\n",tong);
        System.out.printf("Hiệu a&b là: %f\n",hieu);
        System.out.printf("Tích a&b là: %f\n",tich);
        System.out.printf("Thương a&b là: %f\n",thuong);
        System.out.println("-------------------------");
    }
}
