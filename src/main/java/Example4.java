public class Example4 {
	public boolean equals(Example4 other) {
		System.out.println("Inside of Test.equals");
		return false;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("Inside @override: this is dynamic binding");
		return false;
	}

	public static void main(String[] args) {
		Object t1 = new Example4();
		Object t2 = new Example4();
		Example4 t3 = new Example4();
		Object o1 = new Object();

		int count = 0;
		System.out.println(count++);// prints 0
		t1.equals(t2);
		System.out.println(count++);// prints 1
		t1.equals(t3);
		System.out.println(count++);// prints 2
		t3.equals(o1);
		System.out.println(count++);// prints 3
		t3.equals(t3);
		System.out.println(count++);// prints 4
		t3.equals(t2);
	}
}
