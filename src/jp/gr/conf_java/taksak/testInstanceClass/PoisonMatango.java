package jp.gr.conf_java.taksak.testInstanceClass;

public class PoisonMatango extends Matango {
	int poisonCnt = 5;

	public PoisonMatango(int hp, char suffix) {
		super(hp, suffix);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public PoisonMatango(char suffix) {
		super(suffix);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void attack(Hero h) {
		super.sttack(h);
		if (this.poisonCnt > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.getHp() / 5;
			h.setHp(h.getHp() - damage);
			System.out.println(damage + "ポイントのダメージ");
			this.poisonCnt--;
		}
	}

}
