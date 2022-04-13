package kr.hs.dgsw.java.dept1.d0406;
import java.util.*;

public class Measure {
	
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("약수를 구할 숫자를 입력하세요.");
        
        int num = scanner.nextInt();
        int a;
 
        for(a=1; a<=num; a++){
            if((num%a)==0){
                System.out.println(a);
                
        }
    }scanner.close();
}
	
}
