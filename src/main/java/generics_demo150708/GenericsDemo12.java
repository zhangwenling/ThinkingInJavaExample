package generics_demo150708;

/**
 * java泛型的嵌套设置
 * 
 * @author 201506160244
 * 
 */
public class GenericsDemo12 {
	public static void main(String[] args) {
		Demo1<Info1<String, Integer>> d = null;
		Info1<String, Integer> i = null;
		i = new Info1<String, Integer>("qdqd", 1);
		d = new Demo1<Info1<String, Integer>>(i);
		System.out.println("内容一：" + d.getInfo().getVar());
		System.out.println("内容二：" + d.getInfo().getValue());
	}
}

class Info1<T, V> {
	private T var;
	private V value;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Info1(T var, V value) {
		this.var = var;
		this.value = value;
	}

};

class Demo1<S> {
	private S info;
	
	public Demo1(S info) {
		super();
		this.info = info;
	}

	public S getInfo() {
		return info;
	}

	public void setInfo(S info) {
		this.info = info;
	}
}
