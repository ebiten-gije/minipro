package minipro;

public class Info {

	@Override
	public String toString() {
		return name + "	" + phone + "	" + hp;
	}

	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String phone;
	public String hp;
	
	public Info(String name, String phone, String hp) {
		super();
		this.name = name;
		this.phone = phone;
		this.hp = hp;
	}
	
	
	
}
