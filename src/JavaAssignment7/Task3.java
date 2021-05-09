package JavaAssignment7;

public class Task3 {
	static void method1(First f) {
		f.A();
		};
		static void method2(Second s) {
		s.C();
		};
		static void method3(Third t) {
		t.E();
		};
		static void method4(Fourth f) {
		f.G();
		};

		public static void main(String[] args) {
			Part3 p=new Part3();
			method1(p);
			method2(p);
			method3(p);
			method4(p);
			
		}
}
