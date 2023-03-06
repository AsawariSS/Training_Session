package java_practice_programs;

public class CommandLineArguments {
	public static void main(String[] args) {
		int w = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int z = Integer.parseInt(args[3]);
		int div = Integer.parseInt(args[4]);
		int sum = w + x + y + z;
		System.out.println("Total" + "=" + sum);
		float ans = sum / div;
		System.out.println("Final Answer" + "=" + ans);
	}
}
