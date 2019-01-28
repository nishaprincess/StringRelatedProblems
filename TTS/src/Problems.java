import java.util.Scanner;

public class Problems {
	public static int[] freq = new int[10000];
	public static char c;
	public static String str;

	public Problems(String s) {
		str = s;
	}

	public void prob20() {

		for (char i = 'a'; i <= 'z'; i++) {
			freq[i] = 0;

		}
		for (char i = 'a'; i <= 'z'; i++) {
			char p = i;
			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) == p) {
					freq[p] = freq[p] + 1;
				}
			}
		}
		for (char i = 'a'; i <= 'z'; i++) {
			if (freq[i] > 0) {
				System.out.println(i + " has a frequency of" + freq[i]);
			}
		}

	}

	public void prob21() {
		char[] removefirststring = new char[10000];
		char cc;
		System.out.print("Enter char to remove from first : ");
		Scanner in = new Scanner(System.in);
		cc = in.next().charAt(0);

		int p = 0;
		int index = 999999;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == cc) {
				index = j;
				break;
			}

		}
		for (int j = 0; j < str.length(); j++) {

			if (j != index) {
				removefirststring[p] = str.charAt(j);
				p++;
			}
			if (p == str.length() - 1)
				break;

		}
		System.out.println(removefirststring);

	}

	public void prob22() {

		char[] removelaststring = new char[10000];
		char cc;
		System.out.print("Enter char to remove from last : ");
		Scanner in = new Scanner(System.in);
		cc = in.next().charAt(0);

		int p = 0;
		int index = 999999;
		for (int j = str.length() - 1; j >= 0; j--) {

			if (str.charAt(j) == cc) {

				index = j;
				break;
			}

		}

		for (int j = 0; j < str.length(); j++) {

			if (j != index) {
				removelaststring[p] = str.charAt(j);
				p++;
			}
			if (p == str.length() - 1)
				break;

		}
		System.out.println(removelaststring);
	}

	public void prob23() {
		char[] removeallstring = new char[10000];
		char cc;
		System.out.print("Enter char to remove : ");
		Scanner in = new Scanner(System.in);
		cc = in.next().charAt(0);

		int p = 0;
		int index = 999999;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == cc) {
				index = j;

			}
			if (j != index) {
				removeallstring[p] = str.charAt(j);
				p++;
			}
			if (p == str.length() - 1)
				break;

		}

		System.out.println(removeallstring);

	}

	public void prob24() {
		char[] removeallrepeatedstring = new char[10000];
		int k = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			freq[i] = 0;

		}
		for (char i = 'a'; i <= 'z'; i++) {
			char p = i;
			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) == p) {
					freq[p] = freq[p] + 1;
				}
			}
		}
		for (int j = 0; j < str.length(); j++) {
			if (freq[str.charAt(j)] > 1) {
				char pw = str.charAt(j);
				int count = 0;
				for (int hh = 0; hh < removeallrepeatedstring.length; hh++) {
					if (removeallrepeatedstring[hh] == pw) {
						count++;
					}
				}
				if (count == 0) {
					removeallrepeatedstring[k] = str.charAt(j);
					k++;
				}

			} else if (freq[str.charAt(j)] <= 1) {
				removeallrepeatedstring[k] = str.charAt(j);
				k++;
			}
		}
		System.out.println(removeallrepeatedstring);
	}

	public void prob25() {
		char[] removefirststring = new char[10000];
		char cc;
		char dd;
		System.out.print("Enter char to remove from first : ");
		Scanner in = new Scanner(System.in);
		cc = in.next().charAt(0);
		System.out.print("Enter char to replace : ");
		dd = in.next().charAt(0);

		int p = 0;
		int index = 999999;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == cc) {
				index = j;
				break;
			}

		}
		for (int j = 0; j < str.length(); j++) {

			if (j != index) {
				removefirststring[p] = str.charAt(j);
				p++;
			}
			if (j == index) {
				removefirststring[p] = dd;
				p++;
			}

			if (p == str.length())
				break;

		}
		System.out.println(removefirststring);
	}

	public void prob26() {
		char[] removelaststring = new char[10000];
		char cc;
		char dd;
		System.out.print("Enter char to remove from last : ");
		Scanner in = new Scanner(System.in);
		cc = in.next().charAt(0);
		System.out.print("Enter char to replace : ");
		dd = in.next().charAt(0);

		int p = 0;
		int index = 999999;
		for (int j = str.length() - 1; j >= 0; j--) {

			if (str.charAt(j) == cc) {

				index = j;
				break;
			}

		}

		for (int j = 0; j < str.length(); j++) {

			if (j != index) {
				removelaststring[p] = str.charAt(j);
				p++;
			}
			if (j == index) {
				removelaststring[p] = dd;
				p++;
			}
			if (p == str.length())
				break;

		}
		System.out.println(removelaststring);
	}

	public void prob27() {
		char[] removeallstring = new char[10000];
		char cc;
		char dd;
		System.out.print("Enter char to remove : ");
		Scanner in = new Scanner(System.in);
		cc = in.next().charAt(0);
		System.out.print("Enter char to replace : ");
		dd = in.next().charAt(0);
		int p = 0;
		int index = 999999;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == cc) {
				index = j;

			}
			if (j != index) {
				removeallstring[p] = str.charAt(j);
				p++;
			}
			if (j == index) {
				removeallstring[p] = dd;
				p++;
			}
			if (p == str.length())
				break;

		}

		System.out.println(removeallstring);

	}

	public void prob28() {
		String cc;
		System.out.print("Enter string to find first : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();

		int i = 0;
		int j;
		int pp = 0;

		for (j = 0; j < str.length(); j++) {

			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;
								break;
							}
						}
					}

				}
			}

		}

		System.out.println(cc + "is found at index " + pp);
	}

	public void prob29() {
		String cc;
		System.out.print("Enter string to find last : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();

		int i = 0;
		int j;
		int pp = 0;

		for (j = str.length() - 1; j >= 0; j--) {

			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;
								break;
							}
						}
					}

				}
			}

		}

		System.out.println(cc + "is found at index " + pp);

	}

	public void prob30() {
		String cc;
		System.out.print("Enter string to find  : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();

		int i = 0;
		int j;
		int pp = 0;

		for (j = 0; j < str.length(); j++) {
			pp = 0;
			i = 0;
			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;
								System.out.println(cc + " is found at index " + pp);
								j = j + cc.length() - 1;

							}
						}
					}

				}
			}

		}

	}

	public void prob31() {
		String cc;
		System.out.print("Enter string to find  : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();
		int count = 0;
		int i = 0;
		int j;
		int pp = 0;

		for (j = 0; j < str.length(); j++) {
			pp = 0;
			i = 0;
			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;
								count++;

								j = j + cc.length() - 1;

							}
						}
					}

				}
			}

		}
		System.out.println(cc + " has occured " + count + " times ");
	}

	public void prob32() {
		char[] removefirststring = new char[10000];
		int index = 0;
		String cc;
		System.out.print("Enter string to remove first : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();

		int i = 0;
		int j;
		int pp = 0;

		for (j = 0; j < str.length(); j++) {

			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;
								j = j + cc.length();
								if (str.charAt(j) == ' ') {
									j = j + 1;
								}
								break;
							}
						}
					}

				}
			}

			removefirststring[index] = str.charAt(j);
			index++;

		}
		System.out.println(removefirststring);

	}

	public void prob33() {
		String cc;
		char[] removelaststring = new char[10000];
		System.out.print("Enter string to remove last : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();
		int index = 0;
		int i = 0;
		int j;
		int pp = 0;

		for (j = str.length() - 1; j >= 0; j--) {

			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;

								j = j - cc.length();

								if (str.charAt(j) == ' ') {
									j = j - 1;
								}

								break;

							}
						}
					}

				}
			}
			index = j;

			removelaststring[index] = str.charAt(j);
			index--;

		}

		System.out.println(removelaststring);

	}

	public void prob34() {
		String cc;
		char[] removeallstring = new char[10000];
		int index = 0;
		System.out.print("Enter string to remove  : ");
		Scanner in = new Scanner(System.in);
		cc = in.next();

		int i = 0;
		int j;
		int pp = 0;

		for (j = 0; j < str.length(); j++) {
			pp = 0;
			i = 0;
			if (str.charAt(j) == cc.charAt(0)) {
				for (int j2 = j; j2 < str.length(); j2++) {
					if (i < cc.length()) {
						if (str.charAt(j2) == cc.charAt(i)) {
							i++;

							if (i == cc.length()) {
								pp = pp + j2 - cc.length() + 1;
								j = j + cc.length();
								if (str.charAt(j + 1) == ' ') {
									j = j + 1;
								}

							}
						}
					}

				}
			}
			removeallstring[index] = str.charAt(j);
			index++;

		}
		System.out.println(removeallstring);

	}

	public void prob35() {
		char[] removeleadspace = new char[10000];
		int index = 0;
		int k = 0;
		int j;
		int flag = 0;
		for (j = 0; j < str.length(); j++) {
			index = 0;
			if (str.charAt(j) == ' ') {
				for (int i = j; i < str.length(); i++) {

					if (str.charAt(i + 1) == ' ') {
						index++;

					} else {
						break;
					}

				}

			}
			if (index > 1 && flag != 1) {

				j = j + index + 1;
				flag = 1;
			}

			removeleadspace[k] = str.charAt(j);
			k++;
		}
		System.out.println(removeleadspace);
	}

	public void prob36() {
		char[] removetrailspace = new char[10000];
		char[] removetrailfinalspace = new char[10000];
		int pk = 0;
		int index = 0;
		int k = 0;
		int j;
		int flag = 0;
		for (j = str.length() - 1; j >= 0; j--) {
			index = 0;
			if (str.charAt(j) == ' ') {
				for (int i = j; i >= 0; i--) {
					if (i > 0) {
						if (str.charAt(i - 1) == ' ') {
							index++;

						} else {
							break;
						}
					}
				}

			}
			if (index > 1 && flag != 1) {

				j = j - index - 1;
				flag = 1;
			}

			removetrailspace[k] = str.charAt(j);
			k++;

		}
		pk = 0;
		for (int i = k; i >= 0; i--) {
			removetrailfinalspace[pk] = removetrailspace[i];
			pk++;
		}
		System.out.println(removetrailfinalspace);
	}

	public void prob37() {
		char[] removeleadspace = new char[10000];
		int index = 0;
		int k = 0;
		int j;
		int flag = 0;
		for (j = 0; j < str.length(); j++) {
			index = 0;
			if (str.charAt(j) == ' ') {
				for (int i = j; i < str.length(); i++) {

					if (str.charAt(i + 1) == ' ') {
						index++;

					} else {
						break;
					}

				}

			}
			if (index > 1 && flag != 1) {

				j = j + index + 1;
				flag = 1;
			}

			removeleadspace[k] = str.charAt(j);
			k++;
		}

		char[] removetrailspace = new char[10000];
		char[] removetrailfinalspace = new char[10000];
		int pk = 0;
		index = 0;
		int kk = 0;
		flag = 0;
		for (j = k; j >= 0; j--) {
			index = 0;
			if (removeleadspace[j] == ' ') {
				for (int i = j; i >= 0; i--) {
					if (i > 0) {
						if (removeleadspace[i - 1] == ' ') {
							index++;

						} else {
							break;
						}
					}
				}

			}
			if (index > 1 && flag != 1) {

				j = j - index - 1;
				flag = 1;
			}

			removetrailspace[kk] = removeleadspace[j];
			kk++;

		}
		pk = 0;
		for (int i = kk; i >= 0; i--) {
			removetrailfinalspace[pk] = removetrailspace[i];
			pk++;
		}
		System.out.println(removetrailfinalspace);
	}

	public void prob38() {
		char[] removeleadspace = new char[10000];
		int index = 0;
		int k = 0;
		int j;
		int flag = 0;
		for (j = 0; j < str.length(); j++) {
			index = 0;
			if (str.charAt(j) == ' ') {
				for (int i = j; i < str.length(); i++) {

					if (str.charAt(i + 1) == ' ') {
						index++;

					} else {
						break;
					}

				}

			}
			if (index > 1) {

				j = j + index + 1;

				removeleadspace[k] = ' ';
				k++;

			}

			removeleadspace[k] = str.charAt(j);
			k++;
		}
		System.out.println(removeleadspace);
	}
}
