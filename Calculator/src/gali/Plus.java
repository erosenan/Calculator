package gali;

public class Plus extends Expr {

	private Expr left;
	private Expr right;

	public Plus(Expr l, Expr r) {
		left = l;
		right = r;
	}
	@Override
	public int eval() {
		return left.eval() + right.eval();
	}
	@Override
	public String toString() {
		return left.toString() + "+" + right.toString();
	}
}
