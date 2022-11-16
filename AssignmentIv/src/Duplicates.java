import java.util.Scanner;

class DuplicateI {
	public void duplicate(String s) {
		String s1 = new String(s);
		String s2 = " ";
		for (int i = 0; i < s1.length(); i++) {
			boolean f = false;
			for (int j = 0; j < s2.length(); j++) {
				if (s2.charAt(j) == s1.charAt(i)) {
					f = true;
					break;
				}

			}
			if (f == true) {
				s2 += s1.charAt(i);
			}
		}
		System.out.println("String after Removal  "+s2);
//		compare(s1, s2);

	}



}

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a new String");
		String s = sc.nextLine();
		DuplicateI d = new DuplicateI();
		d.duplicate(s);
	}

}
