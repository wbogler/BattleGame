package BattleGame;

public class Program {

	public static void main(String[] args) {
		
		Champion c1 = new Champion();
		c1.name="Dario";
		c1.life = 50;
		c1.attack = 8;
		c1.armor = 1;
		
		Champion c2 = new Champion();
		c2.name="Fiora";
		c2.life = 40;
		c2.attack = 10;
		c2.armor = 2;
		
		c1.takeDamage(c2);
		c2.takeDamage(c1);
		
		System.out.println("Dario pós dano: " + c1.life);
		System.out.println("Fiora pós dano: " + c2.life);

	}

}
