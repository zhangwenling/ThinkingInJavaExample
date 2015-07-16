package generics_demo;

/**
 * ͨ�����ͷ������ط�������ʵ��
 * 
 * @author 201506160244
 * 
 */
interface InfoInterface<T> { // �ڽӿ��϶��巺��
	public T getVar(); // ������󷽷������󷽷��ķ���ֵ���Ƿ�������
}

class InfoImpl<T> implements InfoInterface<T> { // ���巺�ͽӿڵ�����
	private T var; // ��������

	public InfoImpl(T var) { // ͨ�����췽��������������
		this.setVar(var);
	}

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}
};

public class GenericsDemo06 {
	public static void main(String arsg[]) {
		InfoInterface<String> i = null; // �����ӿڶ���
		i = new InfoImpl<String>("��ķ"); // ͨ������ʵ��������
		System.out.println("���ݣ�" + i.getVar());
	}
};