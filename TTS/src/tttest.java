import java.util.Scanner;

public class tttest {
	public static String str;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		System.out.println(str.length());
		Problems prb = new Problems(str);
		prb.prob20();//
		prb.prob21();
		prb.prob22();
		prb.prob23();
		prb.prob24();
		prb.prob25();
		prb.prob26();
		prb.prob27();
		prb.prob28();
		prb.prob29();
		prb.prob30();
		prb.prob31();
		prb.prob32();
		prb.prob33();
		prb.prob34();
		prb.prob35();
		prb.prob36();
		prb.prob37();
		prb.prob38();
	}
}
