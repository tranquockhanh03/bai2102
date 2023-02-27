
import java.util.Scanner;
class bai2102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("nhap n >0: ");
		int n;
		n = sc.nextInt();
		int soDu,tong=0;
		while (n>0) {
			soDu = n%10;
			n = n /10;
			tong = tong + soDu;
		}
		System.out.println("Tong cac chu so =" + tong);
    }
}