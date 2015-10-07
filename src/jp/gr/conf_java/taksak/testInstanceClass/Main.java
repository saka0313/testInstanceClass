package jp.gr.conf_java.taksak.testInstanceClass;

public class Main {
	public static void main(String[] args) {
		Sword s1 = new Sword();
		s1.name = "こんぼう";
		s1.damage = 10;

		Sword s2 = new Sword();
		s2.name = "ひのきの棒";
		s1.damage = 12;

		Hero.setRandomMoney();
		System.out.println(Hero.money);

		Hero h1 = new Hero("ミナト");
		h1.setSword(s1);
		System.out.println("現在の武器は" + h1.getSword().name);

		Hero h2 = new Hero();
		h2.setSword(s2);

		System.out.println(h1.money);
		h1.money += 100;
		System.out.println(h1.money);

		King k = new King();
		k.talk(h1);
		k.talk(h2);

		Wizard w = new Wizard("スガワラ", 10, 30, "魔法の杖");

		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		h1.slip();
		m1.run();
		m2.run();
		h1.run();
	}
}
