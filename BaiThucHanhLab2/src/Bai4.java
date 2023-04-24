import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int thang;
         Scanner sc = new Scanner(System.in);

         System.out.print("Nhap so thang trong nam (so thang tu 1-12): ");
         thang = sc.nextInt();
         switch(thang){
            case 1:
            System.out.println("Thang nay la thang mot");
            break;
            case 2:
            System.out.println("Thang nay la thang hai");
            break;
            case 3:
            System.out.println("Thang nay la thang ba");
            break;
            case 4:
            System.out.println("Thang nay la thang tu");
            break;
            case 5:
            System.out.println("Thang nay la thang nam");
            break;
            case 6:
            System.out.println("Thang la thang sau");
            break;
            case 7:
            System.out.println("Thang nay la thang bay");
            break;
            case 8:
            System.out.println("Thang nay la thang tam");
            case 9:
            System.out.println("Thang nay la thang chin"); 
            case 10:
            System.out.println("Thang nay la thang muoi");
            case 11:
            System.out.println("Thang nay la thang muoi mot");
            case 12:
            System.out.println("Thang nayla thang muoi hai");
            default:
            System.out.println("So thang khong hop le!");
        }
        sc.close();
    }
}

