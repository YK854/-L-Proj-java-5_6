
public class learning_table {
	public static void main(String[] args) {
		// �w�K�R���e���c5��
		// "������"�̕��������o��
		String string1 = "������";
		System.out.println(string1 + "�̕������F" + string1.length());
		// ""(�󕶎�)�̕��������o��
		string1 = "";
		System.out.println(string1 + "�̕������F" + string1.length());
		// null�̕ϐ����Q�Ƃ����NullPointerException�̃G���[
		string1 = null;
//		System.out.println(string1 + "�̕�������" + string1.length());

		System.out.println();

		// �z��
		int[] array1 = new int[3];
		array1[0] = 60;
		array1[1] = 50;
		array1[2] = 40;
		int int2 = array1[2];

		System.out.println(array1[0] + array1[1] + array1[2]);
		System.out.println(int2);

		System.out.println();

		// �z��ȗ�
		int array3[] = { 10, 20, 50 };

		System.out.println(array3[1]);

		System.out.println();

		// ���Z�q
		System.out.println(2 + 2);
		System.out.println(3 - 2);
		System.out.println(2 * 2);
		System.out.println(4 / 2);
		System.out.println(15 % 2);

		System.out.println();

		// �C���N�������g���Z�q �O�u�E��u
		int a = 0;
		int b;
		b = a++;
		System.out.println("��u");
		System.out.println("a�̒l��" + a + "�ł�" + "b�̒l��" + b + "�ł�");

		int c = 0;
		int d = 0;
		d = ++c;
		System.out.println("�O�u");
		System.out.println("c�̒l��" + c + "�ł�" + "d�̒l��" + d + "�ł�");
		
		System.out.println();
		
		//������r
		String s = "kao";
		String si = "k" + "ao";
		boolean so ;
		System.out.println(so = s == si);
		
		so = s.equals(si);
		System.out.println(so = s == si);
	}

}
