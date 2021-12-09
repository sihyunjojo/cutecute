import java.util.Scanner;

public class Pramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("반복하고 싶은 숫자를 입력하세요 :");
			int num = scanner.nextInt();
			
			for(int i = 0; i < num; i++) {
				for(int j = 1; j < num-i; j++) {
					System.out.printf(" ");
				}
				for(int k = 0; k < i*2+1; k++) {
					System.out.printf("*");
				}
				System.out.println();
			}
			System.out.println();
			for(int i=0; i < num; i++) {
				for(int j = 0; j < i; j++) {
					System.out.printf(" ");
				}
				for(int k = 1; k < 2*(num-i); k++) {
					System.out.printf("*");
				}
				System.out.println();
			}
			
			int a= 1;
			int b= 1;
			int result =1;
			for(int i=0; i<num; i++) {
				System.out.println(result);
				b = result;
				result = a+b;
				a = b;
				
				
			}
	}
	

}
