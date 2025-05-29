import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhâp a: ");
        float a = scanner.nextFloat();
        System.out.println("mời nhâp b ");
        float b = scanner.nextFloat();

        float cv = (a+b)*2;
        float dt = a*b;
        System.out.printf("chu vi hình chữ nhật là: %f\n",cv);
        System.out.printf("diện tích hình chữ nhật là: %f\n",dt);
        System.out.println("-------------------------");
    }
}
