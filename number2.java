import java.util.Scanner;

public class number2 {
	public static void main(String[] args) { 
		Scanner st = new Scanner(System.in);
		int num[] = new int[3];
		System.out.println("��ġ�� �Է��Ͻÿ� (1�� : ����, 2�� : ���簢��, 3�� : ������ü)");
		String str = st.nextLine(); 
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') { 
				count++;
			}
		}
		if(count == 0) {
			Shape ob = new Shape(Integer.parseInt(str));
			System.out.println("������ ���̴� : " + ob.getArea(count));
		}
		else if(count == 1) {
			String[] arr = str.split(" ");
			for(int i = 0; i <= count; i++) {
				num[i] = Integer.parseInt(arr[i]);
			}
			Shape ob = new Shape(num[0], num[1]);
			System.out.println("�簢���� ���̴� : " + ob.getArea(count));
		}
		else if(count == 2) {
			String[] arr = str.split(" ");
			for(int i = 0; i <= count; i++ ) {
				num[i] = Integer.parseInt(arr[i]);
			}
			Shape ob = new Shape(num[0], num[1], num[2]);
			System.out.println("������ü�� ���Ǵ� : " + ob.getArea(count));
		}
		st.close();
	}
}
