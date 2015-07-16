package generics_demo150708;

/**
 * 使用泛型统一传入的参数类型
 * 
 * @author 201506160244
 * 
 */
public class Generics_demo10 {
	public static void main(String[] args) {
		Info<String> i1 = new Info<String>();
		Info<String> i2 = new Info<String>();
		i1.setVar("Hello");
		i2.setVar("汤姆");
		add(i1, i2);
	}

	public static <T> void add(Info<T> i1, Info<T> i2) {
		System.out.println(i1.getVar() + " " + i2.getVar());
	}
}