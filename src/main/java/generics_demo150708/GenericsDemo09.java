package generics_demo150708;
/**
 * 通过泛型方法返回泛型类型实例
 * @author 201506160244
 *
 */
public class GenericsDemo09 {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.setId(12);
		tree.setName("1111");
		Info<Tree> i = fun(tree);
		System.out.println(i.getVar());
	}
	
	public static <T extends Object> Info<T> fun(T param){
		Info<T> temp = new Info<T>();
		temp.setVar(param);
		return temp;
	}
}

class Info<T extends Object>{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	
	@Override
	public String toString() {
		return this.var.toString();
	}
}

class Tree{
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tree [id=" + id + ", name=" + name + "]";
	}
}

