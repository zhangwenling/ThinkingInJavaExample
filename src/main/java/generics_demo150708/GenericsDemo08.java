package generics_demo150708;
/**
 * java·ºÐÍ·½·¨
 * @author 201506160244
 *
 */
public class GenericsDemo08 {
	public static void main(String[] args) {
		Demo d = new Demo();
		String str = d.fun("ÌÀÄ·");
		int i = d.fun(30);
		System.out.println(str);
		System.out.println(i);
	}
}

class Demo{
	public <T> T fun(T t){
		return t;
	}
};
