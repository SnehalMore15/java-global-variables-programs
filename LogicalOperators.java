package com.tka;

public class LogicalOperators {
	public static void main(String[] args) {

		boolean check = !(5 >= 3); // -->false

		System.out.println(true && (7 > 9) || (5 <= 8 && 5 < 4) && !false);
		// F || F && T
		// F || F ---> False

		System.out.println(false || (10 >= 10 && true) && !(6 < 3) || false);
		// F || T && T || F
		// F || T || F
		// T || F ---> True

		System.out.println(!(5 > 2) && (true || false) || (8 != 8 && true));
		// F && T || F
		// F && T ---> False

		System.out.println(true && (8 > 9) || (5 <= 8 && 5 < 4) && check);
		// F || F && F
		// F || F ---> False

		System.out.println((9 > 5 || false) && (6 != 6 || true) && check);
		// T && T && F
		// T && F ---> False

		System.out.println(true && ("Ram" == "Ram") || ("Pune" != "Mumbai" && check));
		// T || T && F
		// T || F ---> True

		System.out.println(("Ram" != "Sham" && false) && ("Pune" == "Pune" && true) && !check);
		// F && T && F
		// F && F ---> False

		System.out.println((("Ram" == "Ram" && true) || ("Sham" != "Ram" && false)) && !(5 < 2) && check);
		// T || F && T && F
		// F && T && F
		// T && F ---> False

		int x = 4;
		int y = 6;

		System.out.println((x + y == 10 && "Ram" != "Sham") && (true || y < x) && check || (x < y && false));
		// T && T && F || F
		// T && T && F
		// T && F ---> False

		System.out.println(((x < y && "Ram" == "Ram") || (x > y && false)) && ((y == 6 || true) && !check)|| (x + y == 10 && "Pune" != "Mumbai"));
		//  T || F && F || T
		//  T && T ---> True
	}

}
