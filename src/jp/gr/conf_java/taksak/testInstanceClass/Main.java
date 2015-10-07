package jp.gr.conf_java.taksak.testInstanceClass;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.fly();

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

		Matango m1 = new Matango(50, 'A');

		Matango m2 = new Matango(48, 'B');

		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h1);
		pm.attack(h2);
		pm.attack(sh);
		pm.attack(h1);
		pm.attack(h2);
		pm.attack(sh);

		h1.slip();
		sh.atack(m1);
		m1.run();
		sh.land();
		sh.atack(m2);
		m2.run();
		h1.run();
		sh.run();
	}
}
