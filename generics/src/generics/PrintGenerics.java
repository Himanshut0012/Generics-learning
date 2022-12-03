package generics;

public class PrintGenerics {

	public static <T> void printArray(T arr[]) {
		for (T element : arr)
			System.out.print(element + " ");
	}

	
	public static void main(String[] args) {

		Integer[] arr = new Integer[10];
		for(int i=0;i<10;i++)
			arr[i]=i+1;
		printArray(arr);
	
		
		
		System.out.println();
		
		Character[] arr1 = new Character[26];
		for(int i=0;i<26;i++) 
			arr1[i]=(char) (i+97);
		printArray(arr1);
		
		
		
		System.out.println();
		String str ="himanshu";
		
		Character[] arr2 = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		
		printArray(arr2);
		
		
		
		
		
		
		
	}

}
