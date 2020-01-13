package algo.com;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        int num = str.length()/10 + 1;
        
        String[] arr = new String[num];
        
        for (int i = 0; i < num; i++) {
        	int A = i * 10;
			
			if((A+10) >= str.length()) {
				arr[i] = str.substring(A, str.length());
			}else {
				arr[i] = str.substring(A, A+10);
			}
			System.out.println(arr[i]);
        }
    }
}