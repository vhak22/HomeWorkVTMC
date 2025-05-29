import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");
        menu();

    }

    public static void menu(){
        int chon;

        do{
            System.out.println("tính chu vi & diện tch hình chữ nhật ");
            System.out.println("Cộng trừ nhân chia ");
            System.out.println("tính lãi xuất ngân hàng ");
            System.out.println("chẵn lẽ");
            System.out.println("-------------------------");
            System.out.print("Nhập lựa chọn: ");
            chon = scanner.nextInt();

            switch(chon){
                case 1:
                    System.out.println("tính chu vi & diện tch hình chữ nhật ");

                    break;
                case 2:
                    System.out.println("Cộng trừ nhân chia ");
                    break;
                case 3:
                    System.out.println("tính lãi xuất ngân hàng ");
                    break;
                case 4:
                    System.out.println("chẵn lẽ");
                    break;
                default:
                    System.out.println("nhập lại i cốt");
                    break;
            }
        }while(chon!=5);
    }
}
