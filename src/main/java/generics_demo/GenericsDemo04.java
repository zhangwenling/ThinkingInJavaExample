package generics_demo;

/**
 * ���޷��� ������ݵķ��Ͷ�����Ҫ��Ķ��� �����ڼ䱨��
 * extends Ҫ������������
 * super Ҫ���������丸��
 * 
 * @author yixunzhi
 * 
 */
public class GenericsDemo04 {
	public static void main(String[] args) {
		Info<Integer> i = new Info<Integer>();
		i.setVar1(123);
		fun(i);
		Info<String> i1 = new Info<String>();
		i1.setVar("123av");
		// fun(i1);
		
		Info<Object> i2 = new Info<Object>();
		i2.setVar("123abcdefg");
		fun1(i2);
	}

	public static void fun(Info<? extends Number> info) {
		System.out.println(info.getVar1());
	}
	
	public static void fun1(Info<? super String> info){
		System.out.println(info.getVar());
	}
}
