package assignment1;

public class ArrayParser {
	
	public int add(int[] a){
		
		int sum = 0;
		
		for(int i : a){sum = sum + i;}
		
		return sum;
		
	}
	
	public String findHighestLength(String[] array){
		
		int max = 0;
		String str = null;
		
		for(String s : array){
			
			if(s.length() > max){
				max = s.length();
				str = s;
			}
		}
		
		return str;
		
	}
	
	public void printSpecial(int[] a){
		
		for(int i : a){
			
			if(i>10 && i%5 == 0){System.out.print(i + " ");}
			
		}
		
	}
	
	public void print3DArray(int[][][] a){
		
		for(int[][] b : a){
			for(int[] c : b){
				for(int d : c){
					System.out.print(d + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
