package gali;

public abstract class Expr {
	public static Expr parse(String expr) {
		int opPos = Math.max(expr.lastIndexOf("+"), expr.lastIndexOf("-"));

		if (opPos == -1){
			return new Const(new Integer(expr));
		}
		else {
			String right = expr.substring(opPos +1);
			String left = expr.substring(0, opPos);
			if (expr.charAt(opPos) == '+') {
				return new Plus(parse(left), parse(right));
			}
			else {
				return new Minus(parse(left), parse(right));
			}
		}
	}

	public abstract int eval();
}
