package generics;

public class Pair<T,V> {
	private T firstInput;
	private V secondInpt;
	
	public Pair(T firstInput,V secondInput) {
		this.firstInput=firstInput;
		this.secondInpt=secondInput;
	}

	public T getFirstInput() {
		return firstInput;
	}

	public void setFirstInput(T firstInput) {
		this.firstInput = firstInput;
	}

	public V getSecondInpt() {
		return secondInpt;
	}

	public void setSecondInpt(V secondInpt) {
		this.secondInpt = secondInpt;
	}

}
