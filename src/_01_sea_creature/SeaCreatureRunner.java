package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature spongebob=new SeaCreature("Spongebob");
		SeaCreature squidward=new SeaCreature("Squidward");
		SeaCreature patric=new SeaCreature("Patric");
		squidward.getName();
		patric.getName();
		spongebob.eat();
		squidward.eat();
		patric.eat();
	
	}
}
