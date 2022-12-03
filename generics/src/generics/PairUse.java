package generics;

public class PairUse {

	public static void main(String[] args) {
		Pair<Integer, Integer> obj = new Pair<>(1,5);
		System.out.println("obj firstInput : "+obj.getFirstInput());
		System.out.println("obj secondInput : "+obj.getSecondInpt());
		
		Pair<String, Character> obj1 = new Pair<>("Ram",'M');
		System.out.println("obj1 firstInput : "+obj.getFirstInput());
		System.out.println("obj1 secondInput : "+obj.getSecondInpt());
		
		
		Pair<Pair<String,Character>,Integer> obj3 = new Pair<>(obj1,9);
		System.out.println("obj3 firstInput's first : "+obj3.getFirstInput().getFirstInput());
		System.out.println("obj3 firstInput's second : "+obj3.getFirstInput().getSecondInpt());
		System.out.println("obj3 secondInput : "+obj3.getSecondInpt());
		
	}

}
