import java.util.Scanner;

public class number2 {
	public static void main(String[] args) { 
		Scanner st = new Scanner(System.in);
		
		System.out.println("수치를 입력하시오 (1개 : 직선, 2개 : 직사각형, 3개 : 직육면체)");
		
		String str = st.nextLine();
		String []s = str.split(" ");
		int [] num = new int[s.length];
		for(int i = 0; i<num.length; i++) {
			num[i] = Integer.parseInt(s[i]);
		}

		if(num.length == 1) {
			Shape ob = new Shape(num[0]);
		}
		else if(num.length == 2) {
			Shape ob = new Shape(num[0], num[1]);
		}
		else if(num.length == 3) {
			Shape ob = new Shape(num[0], num[1], num[2]);
		}
		st.close();
	}
}
