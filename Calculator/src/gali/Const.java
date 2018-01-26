package gali;

public class Const extends Expr {
	private int value;

	public Const(int c) {
		value = c;
	}

	@Override
	public int eval() {
		return value;
	}
	public String toString() {
		return new Integer(value).toString();
	}
}
