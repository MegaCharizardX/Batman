package assignment1;

public class Demo {

	public static void main(String[] args) {
		
			int[] a = {1,2,3,4,10,15,17,20,24};
			String[] s = {"Batman", "Superman", "Ironman"};
			
			int[][] m1 = {{1,2,3},{1,2,3}};
			int[][] m2 = {{2,3,4},{2,3,4}};
			int[][] m3 = {{1,2},{1,2},{1,2}};
			
			int[][][] m4 = {{{1,2,3},{1,2,3}}, {{1,2,3},{1,2,3}}};
			
			Student[] studs = new Student[5];
			
			studs[0] = new Student(1, "aa");
			studs[1] = new Student(2, "bb");
			studs[2] = new Student(3, "cc");
			studs[3] = new Student(4, "dd");
			studs[4] = new Student(5, "ee");
			
			ArrayParser ap = new ArrayParser();
						
			System.out.println(ap.add(a));
			System.out.println(ap.findHighestLength(s));
			ap.printSpecial(a);
			
			System.out.println();
			System.out.println("******************************");
			
			ap.print3DArray(m4);
			
			System.out.println("******************************");
			
			MatrixProcessor mp = new MatrixProcessor();
			mp.add(m1, m2);
			System.out.println();
			mp.Multiply(m1, m3);
			
			System.out.println("******************************");
			
			for(Student stud : studs){
				System.out.println(stud);
			}
			
			System.out.println("******************************");
			
			Calc c = (int a1, int b1) -> {return a1+b1;};
			
			System.out.println(c.add(1,2));
			System.out.println(c.sub(3,2));
			System.out.println(c.multi(2,3));
	}

}
