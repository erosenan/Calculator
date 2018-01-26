package gali;

public class Minus extends Expr {

	private Expr left;
	private Expr right;

	public Minus(Expr l, Expr r) {
		left = l;
		right = r;
	}
	@Override
	public int eval() {
		return left.eval() - right.eval();
	}
	public String toString() {
		return left.toString() + "-" + right.toString();
	}
}