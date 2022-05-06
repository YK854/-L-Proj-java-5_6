
public class learning_table {
	public static void main(String[] args) {
		// 学習コンテンツ5章
		// "あいう"の文字数を出力
		String string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());
		// ""(空文字)の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		// nullの変数を参照するとNullPointerExceptionのエラー
		string1 = null;
//		System.out.println(string1 + "の文字数は" + string1.length());

		System.out.println();

		// 配列
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[1] = 50;
		array1[2] = 40;
		int int2 = array1[2];

		System.out.println(array1[0] + array1[1] + array1[2]);
		System.out.println(int2);

		System.out.println();

		// 配列省略
		int array3[] = { 10, 20, 50 };

		System.out.println(array3[1]);

		System.out.println();

		// 演算子
		System.out.println(2 + 2);
		System.out.println(3 - 2);
		System.out.println(2 * 2);
		System.out.println(4 / 2);
		System.out.println(15 % 2);

		System.out.println();

		// インクリメント演算子 前置・後置
		int a = 0;
		int b;
		b = a++;
		System.out.println("後置");
		System.out.println("aの値は" + a + "です" + "bの値は" + b + "です");

		int c = 0;
		int d = 0;
		d = ++c;
		System.out.println("前置");
		System.out.println("cの値は" + c + "です" + "dの値は" + d + "です");
		
		System.out.println();
		
		//等価比較
		String s = "kao";
		String si = "k" + "ao";
		boolean so ;
		System.out.println(so = s == si);
		
		so = s.equals(si);
		System.out.println(so = s == si);
	}

}
