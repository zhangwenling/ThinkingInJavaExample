package generics_demo150708;

/**
 * ʹ�÷���ͳһ����Ĳ�������
 * 
 * @author 201506160244
 * 
 */
public class Generics_demo10 {
	public static void main(String[] args) {
		Info<String> i1 = new Info<String>();
		Info<String> i2 = new Info<String>();
		i1.setVar("Hello");
		i2.setVar("��ķ");
		add(i1, i2);
	}

	public static <T> void add(Info<T> i1, Info<T> i2) {
		System.out.println(i1.getVar() + " " + i2.getVar());
	}
}