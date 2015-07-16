package generics_demo;

public class GenericsDemo01 {
	public static void main(String[] args) {
		Point<String> p = new Point<String>();
		p.setVar("123");
		System.out.println(p.getVar().length());
		
		Point<Integer> p1 = new Point<Integer>();
		p1.setVar(1);
		System.out.println(p1.getVar());
	}
}
