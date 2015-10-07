package jp.gr.conf_java.taksak.testInstanceClass;

public class Wand {
	private String name;
	private double power;

	public Wand(String name, double power) {
		this.setName(name);
		this.setPower(power);
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("魔法の杖のpowerの設定値は0.5～100.0の範囲です");
		}
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("魔法の杖の名前にnullは設定できません");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("魔法の杖の名前は3文字以上を設定してください");
		}
		this.name = name;
	}
}
