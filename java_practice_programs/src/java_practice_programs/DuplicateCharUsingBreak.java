package java_practice_programs;

public class DuplicateCharUsingBreak {

	public static void main(String[] args) {
		String str = "conclusion";
		char[] ch = str.toCharArray();
		System.out.println(str);
		System.out.println("Duplicate Characters in Given String:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j] + " ");
					break;
				}
			}
		}
	}
}
