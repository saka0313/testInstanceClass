package jp.gr.conf_java.taksak.testInstanceClass;

public class SuperHero extends Hero {
	private boolean flying;

	public SuperHero() {
		super("Tanaka Marcus Tulio");
		System.out.println("SuperHeroのコンストラクタが動作");
	}

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	public void run() {
		System.out.println("撤退した");
	}

	public void atack(Matango m) {
		super.atack(m);
		if (this.flying) {
			super.atack(m);
		}
	}

	public void atack() {
		super.atack();
		if (this.flying) {
			super.atack();
		}
	}
}
