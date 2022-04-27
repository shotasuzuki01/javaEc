package day2;

public class HeroApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1=new Hero("ろと",100);
		Hero h2=new Hero("ろと",200);
		Hero h3=new Hero("ぜしか",300);

		if(h1 !=h2) {
			System.out.println("同値ではない。");
		}
		if(h1.equals(h2)) {
			System.out.println("同価です");
		}
		if(!h1.equals(h3)) {
			System.out.println("同値ではない。");
		}
	}
}
