package java04;

public class StaticBlock {
	static String company = "삼성";
	static String kind = "LCD";
	static String product = company+"-"+kind;
	static String pro2;
//	static { 원래 이렇게 햇어야 했음.
//		pro2 = company + "-" + kind;
//	}
	
}
