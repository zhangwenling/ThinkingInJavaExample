package generics_demo150708;

/**
 * Java��������
 * 
 * @author 201506160244
 * 
 */
public class GenericsDemo11 {
	public static void main(String[] args) {
		Integer i[] = fun1(1, 2, 4, 5, 6, 7, 88);
		fun2(i);
	}

	@SuppressWarnings("unchecked")
	public static <T> T[] fun1(T... arg) {// ���ܿɱ����
		return arg;
	}

	public static <T> void fun2(T param[]) {
		System.out.println("���շ�������");
		for (T t : param) {
			System.out.println(t + ",");
		}
	}
}
