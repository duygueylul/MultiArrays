package MultiArrays;
import java.util.Scanner;

public class N_elemanlıDizi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int top;
		
		System.out.print("Dizinin Satır Syısını Giriniz: ");
		int satir;
		satir = scan.nextInt();
		int sütun;
		sütun = scan.nextInt();
		
		int[][] array = new int [satir][sütun];
		
		
		for(int i = 0; i < satir; i++) {
			for(int j = 0; j < sütun; j++) {
				System.out.print("Bir Sayı Giriniz: ");
				array[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Girilen Dizi: \n");
		for(int i = 0; i < satir; i++) {
			top = 0;
			for(int j = 0; j < sütun; j++) {
				top += array[i][j];
				System.out.println(array[i][j] + "\t");
			}
			System.out.println(top + "\n");
		}
		
		
		
		
		
		
		
		

	}

}
