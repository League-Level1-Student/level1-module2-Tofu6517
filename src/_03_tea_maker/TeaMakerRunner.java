package _03_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaBag myTeaBag=new TeaBag("water");
		Kettle myKettle=new Kettle();
		Cup myCup=new Cup();
		myTeaBag.getFlavor();
		myKettle.boil();
		myCup.makeTea(myTeaBag,myKettle.getWater());
		
		
		
		
		
		
	}
}
