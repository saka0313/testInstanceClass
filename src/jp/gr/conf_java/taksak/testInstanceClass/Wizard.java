package jp.gr.conf_java.taksak.testInstanceClass;

public class Wizard {
	private String name;
	private int hp;
	private int mp;
	private Wand wand;

	public Wizard(String name, int hp, int mp, String wandName) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.wand = new Wand(wandName, 0.5);
	}

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());

		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			hp = 0;
		}
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpに0未満は設定できません");
		}
		this.mp = mp;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand w) {
		if (w == null) {
			throw new IllegalArgumentException("杖にnullは設定できません");
		}
		this.wand = w;
	}
}
