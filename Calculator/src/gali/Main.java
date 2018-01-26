package gali;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an equetion");
		String eq = scan.next();
		Expr expr = Expr.parse(eq);
		System.out.println(expr);
		System.out.println(expr.eval());
	}
	/*public static int calc(String expr) {
		int opPos = Math.max(expr.lastIndexOf("+"), expr.lastIndexOf("-"));

		if (opPos == -1){
			return new Integer(expr);
		}
		else {
			String right = expr.substring(opPos +1);
			String left = expr.substring(0, opPos);
			if (expr.charAt(opPos) == '+') {
				return calc(left) + calc(right);
			}
			else {
				return calc(left) - calc(right);
			}
		}
	}*/

}