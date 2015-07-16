package generics_demo;

public class GenericsDemo03 {
	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setVar("123");
		fun(i);
	}

	public static void fun(Info< ?> temp) {
		System.out.println("ÄÚÈÝ" + temp.getVar());
	}
}
