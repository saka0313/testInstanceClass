package jp.gr.conf_java.taksak.testInstanceClass;

public class Hero {
	private String name;
	private int hp;
	private Sword sword;
	static int money;

	Hero(String name) {
		this.setHp(100);
		this.setName(name);
		System.out.println("Heroのコンストラクタが動作");
	}

	Hero() {
		this("ダミー");
	}

	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}

	void bye() {
		System.out.println("勇者は別れを告げた");
	}

	private void die() {
		System.out.println(this.getName() + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	public void atack() {
		System.out.println(this.getName() + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

	public void atack(Matango m) {
		System.out.println(this.getName() + "の攻撃！");
		this.setHp(this.getHp() - 2);
		System.out.println("お化けキノコ" + m.getSuffix() + "から2ポイントの反撃を受けた");
		if (this.getHp() <= 0) {
			this.die();
		}
	}

	void sleep() {
		this.setHp(100);
		System.out.println(this.getName() + "は、眠って回復した！");
	}

	void sit(int sec) {
		this.setHp(this.getHp() + sec);
		System.out.println(this.getName() + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した。");
	}

	void slip() {
		this.setHp(this.getHp() - 5);
		System.out.println(this.getName() + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	void run() {
		System.out.println(this.getName() + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.getHp() + "でした");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}
}
