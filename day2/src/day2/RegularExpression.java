package day2;

public class RegularExpression {
	public static void main(String[] args) {
		String s="Java";
		if(s.matches("Java")) {
			System.out.println("Match!");
		}
		if(s.matches("J.va")) {
			System.out.println("Match!");
		}
		if("Jaaaaaaava".matches("ja*va")) {
			System.out.println("Match");
		}
		if("あいうxx01".matches(".*")) {
			System.out.println("Match");
		}
		if("url".matches("[a-z]{3}")){
			System.out.println("Match");
		}
		s="abc,def:ghi";
		String[]words=s.split("[,:]");
		for(String w:words) {
			System.out.print(w+"->");
		}
		String w=s.replaceAll("[beh]","X");
		System.out.println(w);

		Method(3,5,7,9);
		int sum=sumOf(3,5,7,9);
		System.out.println(sum);
	}
	public static void Method(int...args) {
		for(int i:args) {
			System.out.println(i);
		}
	}
	public static int sumOf(int n,int...args){
		int sum=n;
		for(int i:args) {
			sum+=i;
		}
		return sum;
	}
}
