package generics_demo;

/**
 * 受限泛型 如果传递的泛型对象不是要求的对象 编译期间报错
 * extends 要求对象或其子类
 * super 要求对象本身或其父类
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
