package assignment1;

public class MatrixProcessor {
	
	public void add(int[][] a, int[][] b){
		
		if(isMatrix(a) == false || isMatrix(b) == false){
			System.out.println("Input is not a matrix");
			return;
		}
		
		if(a[0].length != b[0].length || a.length != b.length){
			System.out.println("Two matrices cannot be added");
			return;
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				int sum = a[i][j] + b[i][j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
	}
	
	public void Multiply(int[][] a, int[][] b){
		
		if(isMatrix(a) == false || isMatrix(b) == false){
			System.out.println("Input is not a matrix");
			return;
		}
		
		if(a[0].length != b.length){
			System.out.println("Two matrices cannot be multiplied");
			return;
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				int multiple =0;
				
				for(int k=0;k<a[0].length;k++){
					multiple = multiple + a[i][k] * b[k][j];
				}
				System.out.print(multiple + " ");
			}
			System.out.println();
		}
		
	}	
	
	public boolean isMatrix(int[][] m){
		
		boolean isMatrix = false;
		
		if(m != null){
			int length = 0;
			
			for(int i=0;i<m.length;i++){
				
				if(length == 0){
					length = m[i].length;
				}
				else if(length == m[i].length){
					isMatrix = true;
				}
				else{
					isMatrix = false;
					break;
				}
			}
		}
		
		return isMatrix;
	}
    
}
