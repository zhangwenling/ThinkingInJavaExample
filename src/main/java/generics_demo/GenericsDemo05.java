package generics_demo;
/**
 * java泛型无法向上转型
 * @author yinxunzhi
 *
 */
public class GenericsDemo05 {
	public static void main(String[] args) {
		Info<String> info1 = new Info<String>();
		Info<Object> info2 = new Info<Object>();
//		info2 = info1;
	}
}
