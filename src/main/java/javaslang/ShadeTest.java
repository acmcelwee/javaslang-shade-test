package javaslang;

public class ShadeTest {

	public static void main(String[] args) {
		final Function1<String, String> f = s -> s.toUpperCase();
		final String s = f.apply("Hi!");
		System.out.println(s);
	}
}
