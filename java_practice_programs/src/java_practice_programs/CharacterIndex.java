package java_practice_programs;

public class CharacterIndex {
	public static void main(String[] args) {
		String str = "Asawari Sarnobat!";
		System.out.println("Original String = " + str);
		int index1 = str.charAt(1);
		int index2 = str.charAt(10);
		System.out.println("The character at position 0 is " + (char) index1);
		System.out.println("The character at position 10 is " + (char) index2);
	}
}
