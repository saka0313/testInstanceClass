package jp.gr.conf_java.taksak.testInstanceClass;

public class Wizard {
	String name;
	int hp;

	void heal(Hero h) {
		h.hp += 10;
		System.out.println("");
	}
}
