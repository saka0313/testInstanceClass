package jp.gr.conf_java.taksak.testInstanceClass;

public class Matango {
	private int hp;
	private final int LEVEL = 10;
	private char suffix;

	public Matango(int hp, char suffix) {
		this.hp = hp;
		this.setSuffix(suffix);
	}

	public Matango(char suffix) {
		this(50, suffix);
	}

	public void run() {
		System.out.println("お化けキノコ" + this.getSuffix() + "は逃げ出した！");
	}

	public void	sttack(Hero h) {
		System.out.println("キノコ" + this.getSuffix() + "の攻撃");
		h.setHp(h.getHp() - 10);
		System.out.println("10のダメージ");
	}

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}
}
