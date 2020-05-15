package gali;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an equetion");
		String eq = scan.next();
		Expr expr = Expr.parse(eq);
		System.out.println(expr);
		System.out.println(expr.eval());
		
//		String s = "if(a == 2) { print(3); }";
//		StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(s));
//		while(tokenizer.ttype != StreamTokenizer.TT_EOF) {
//			tokenizer.nextToken();
//			switch(tokenizer.ttype) {
//			case StreamTokenizer.TT_WORD:
//				System.out.println("Word: " + tokenizer.sval);
//				break;
//			case StreamTokenizer.TT_NUMBER:
//				System.out.println("Number: " + tokenizer.nval);
//				break;
//			case StreamTokenizer.TT_EOF:
//				break;
//			default:
//				System.out.println("Symbol: " + (char)tokenizer.ttype);				
//			}
//		}
		double a = 0;
		String s = scan.next();
		StreamTokenizer tokenizer = new StreamTokenizer(new StringReader(s));
		tokenizer.ordinaryChar('-');
		while(tokenizer.ttype != StreamTokenizer.TT_EOF) {
			tokenizer.nextToken();
			switch(tokenizer.ttype) {
			case StreamTokenizer.TT_NUMBER:
				a = a + (double)tokenizer.nval;//System.out.println("Number: " + tokenizer.nval);
				break;
			case StreamTokenizer.TT_EOF:
				break;
			default:
				System.out.println("Symbol: " + (char)tokenizer.ttype);				
			}
		}
		System.out.println(a);	
		//gali(tokenizer);
	}
	private static void gali(StreamTokenizer tokenizer) {
		double a = tokenizer.nval;
		System.out.println(a);
	}
}