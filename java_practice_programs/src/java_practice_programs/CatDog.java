package java_practice_programs;

abstract class Animals{
	abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
	@Override
    public void dogs(){}
    @Override
    public void cats(){
    System.out.println("Cats Meow...! ");
   }
}
class Dogs extends Animals{
	@Override
    public void cats(){}
    @Override
    public void dogs(){
    System.out.println("Dogs bark...!");
   }
}
public class CatDog {
    		
  public static void main(String[] args) {
	  Cats c = new Cats();
      c.cats();
      Dogs d = new Dogs();
      d.dogs();
 }  
}
	

