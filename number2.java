import java.util.Scanner;

public class number2 {
	public static void main(String[] args) { 
		Scanner st = new Scanner(System.in);
		int num[] = new int[3];
		System.out.println("수치를 입력하시오 (1개 : 직선, 2개 : 직사각형, 3개 : 직육면체)");
		String str = st.nextLine(); 
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') { 
				count++;
			}
		}
		if(count == 0) {
			Shape ob = new Shape(Integer.parseInt(str));
			System.out.println("직선의 길이는 : " + ob.getArea(count));
		}
		else if(count == 1) {
			String[] arr = str.split(" ");
			for(int i = 0; i <= count; i++) {
				num[i] = Integer.parseInt(arr[i]);
			}
			Shape ob = new Shape(num[0], num[1]);
			System.out.println("사각형의 넓이는 : " + ob.getArea(count));
		}
		else if(count == 2) {
			String[] arr = str.split(" ");
			for(int i = 0; i <= count; i++ ) {
				num[i] = Integer.parseInt(arr[i]);
			}
			Shape ob = new Shape(num[0], num[1], num[2]);
			System.out.println("직육면체의 부피는 : " + ob.getArea(count));
		}
		st.close();
	}
}
