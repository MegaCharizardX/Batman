package assignment1;

public interface Calc {
	
	public int add(int a, int b);
	
	default int sub(int a, int b){
		return a-b;
	}

	default int multi(int a, int b){
		return a*b;
	}

}
