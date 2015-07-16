package generics_demo;

public class GenericsDemo02 {
	public static void main(String[] args) {
		Notepad<String, Integer> notepads = new Notepad<String,Integer>();
		notepads.setKey("124");
		notepads.setValue(122);
		
		System.out.println(notepads.getKey());
		System.out.println(notepads.getValue());
	}
}
