package day15;

public class A {
	A() {
		System.out.println("A ��ü�� ������");
	}

	// �ν��Ͻ� ��� Ŭ����
	class B {
		B() {
			System.out.println("B ��ü�� ������");
		}

		int field1;

//		static int field2;
		void method() {
		}
//		static void method2() {}

	}

	static class C {
		C() {
			System.out.println("C��ü�� ������");
		}

		int field1;
		static int field2;
		public static C c;

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		// ���� Ŭ����
		class D {
			D() {
				System.out.println("D��ü�� ������");
			}

			int field1;
			// static int field2;

			void method1() {

			}
//			static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}

	// �ν��Ͻ� �ʵ�
	B outerfield1 = new B();
	C outerfield2 = new C();

	// �ν��Ͻ� �żҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}

	// �����ʵ� �ʱ�ȭ
	// static B outerfield3 = new B(); //(x) A��ü ����
	static C outerfield4 = new C(); // ������ ����

	static void method2() {
		// B var1 = new B(); (x) A��ü ����
		C var2 = new C(); // (o) ������ ����
	}

}
