package string_handling;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test2 {

	public static void main(String[] args) {
		// confirm mutability StringBuilder
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("len " + sb.length() + " capa " + sb.capacity());// 5 21
		System.out.println(sb);// sb.toString() : hello
		StringBuilder sb1 = sb.append(123.456);
		System.out.println(sb);// hello123.456
		System.out.println(sb1);// hello123.456
		System.out.println(sb == sb1);// t
		sb.append(false).append(123).append(LocalDate.now()).append(LocalTime.now());
		System.out.println(sb);//appended contents
		System.out.println("len " + sb.length() + " capa " + sb.capacity());
	}

}
