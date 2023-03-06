package java_practice_programs;

class Animals {
	 public void cats()
	{
		System.out.println("This is cat");                            
	}

	public void dogs()
	{
		System.out.println("this is dog");
	}
}

class Cats extends Animals {
	@Override
	public void dogs() {
	}

	@Override
	public void cats() {
		System.out.println("Cats Meow...! ");
	}
}

class Dogs extends Animals {
	@Override
	public void cats() {
	}

	@Override
	public void dogs() {
		System.out.println("Dogs bark...!");
	}
}

public class CatDog {

	public static void main(String[] args) {
		Animals a = new Animals();
		a.cats();
		a.dogs();
		Cats c = new Cats();
		c.cats();
		Dogs d = new Dogs();
		d.dogs();
	}
}
