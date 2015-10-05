package jp.gr.conf_java.taksak.testInstanceClass;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "こんぼう";
		s.damage = 10;

		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
