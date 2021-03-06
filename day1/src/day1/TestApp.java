package day1;
public class TestApp {
	public static void main(String[] args) {
		Wizard wi=new Wizard();
		wi.setName("shota");
		wi.setHp(100);
		wi.setMp(100);

		Wand wa=new Wand();
		wa.setName("幻の杖");
		wa.setPower(1.5);

		wi.setWand(wa);

		Hero h=new Hero();
		h.setName("Shotan");
		h.setHp(100);
		wi.heal(h);
		System.out.println(h);
	}
}
 class Hero{
	private String name;
	private int hp;
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}
	@Override
	public String toString() {
		return"名前"+this.name+"/HP:"+this.hp;
	}
}
 class Wand{
	private String name;
	private double power;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length()<3) {
			throw new IllegalArgumentException("みじかい");
		}
		this.name=name;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if(power<0.5 || power >100.0) {
			throw new IllegalArgumentException("みじかい");
		}
		this.power=power;
	}
}
 class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp<0) {
			hp=0;
		}
		this.hp=hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if(mp<0) {
			throw new IllegalArgumentException("すくない");
		}
		this.mp=mp;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length()<=3) {
			throw new IllegalArgumentException("みじかい");
		}
		this.name=name;
	}
	public Wand getWand() {
		return this.wand;
	}
	public void setWand(Wand wand) {
		if(wand==null) {
			throw new IllegalArgumentException("杖じゃない異常");
		}
		this.wand=wand;
	}
	void heal(Hero h) {
		 int basePoint=10;
		 int recovPoint=(int)(basePoint*this.wand.getPower());
		h.setHp(h.getHp()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した!");
	}
}
