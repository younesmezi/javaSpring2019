package oca;

import java.util.ArrayList;
import java.util.Arrays;

public class Fiday05102019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 /*.  What's the result of the following code fragments?
		 
		  	int[][] arr=new int[][] { {1,2}, {3,4} };
		  			arr[1] = arr[0];
		 		System.out.println(arr[0]);
		 		
		 		A. Compile Error         B. [ 1, 2 ]
		 		C. [ 3, 4 ]				 C. hashcodes (correct)
		 		   
		 [][]:[index number]
		 */
		int[] arrz = {1,2,3};
		System.out.println(arrz); //The variable contains more than one element
		
		
		/*
		 2. which one of the following will give compile error?
		 	
		 	A. int[][] arr=new int[2][];
		 	B. double[][] arr=new double[][] { {1,2}, {3,4} };
		 	C. long[][] arr=new long[2][] { {1,2}, {3,4} }; (correct)Arrays size is fixed
		 	D. int[][] arr ={ {'A', 'B'}, {'C' , 'D' } };
		 	
		 		byte < short < int < long < float < double   char       boolean
		 		
		default: 0      0	    0     0      0.0     0.0      empty      false
		
		Wrapper class default values: null
		 
		 */
		int[][] arr2=new int[2][];
		System.out.println(Arrays.deepToString(arr2));
		
		double[][] arr=new double[][] { {1,2}, {3,4} };
		System.out.println(Arrays.deepToString(arr));
		
		//long[][] arr3=new long[2][] { {1,2}, {3,4} };
		int[][] arr4 ={ {'A', 'B'}, {'C' , 'D' } };
		char a = 'l';
		int z = 'l';
		System.out.println(z);
		
		
		int[][] arr5 ={ {'A', 'B'}, {'C' , 'D' } };
		System.out.println(Arrays.deepToString(arr5));
		
		char[] arr7 = new char[2];
		System.out.println(Arrays.toString(arr7));
		
		
		/*
		 3. what's the result of the following code fragment?
			 		int[][] arr= { {1,2,3}, {3,4} };
				for(int i=0; i<2; i++) {
					for(int j=0; j<2; j++) {
						System.out.println(arr[i][j]+" ");
					}
				}
				
				A.  1 2 3 3 4                             B. 1 2 3 4  (correct)
		 		C.  1 2 3								  D. Throws an Exception
		 		E. Compile Error
		 
		 */
		
		int[][] arr6= { {1,2,3}, {3,4} };
		for(int i=0; i<2; i++) {  // i=0, i=1,   
			
			for(int j=0; j<2; j++) { // j=0, j=1 
				System.out.println(arr[i][j]+" ");
				//when i is 0: [0][0]  [0][1]   1,2
				//when  i is 0: [1][0]  [1][1]  3,4
			}
		}
		
		
		/*
		  4. Which Three lines fail to compile?
		 		1	int ivar = 100;
				2	double dvar = 123;
				3	float fvar = 200; 
				4		ivar = fvar;  error
				5		fvar = ivar;  compile
				6		dvar = fvar; compile
				7		fvar = dvar; error
				8		dvar = ivar; compile
				9		ivar = dvar;  error
				
			A. line 3, line 5, line 8                        B. line 4, line 7, line 9 (correct)
			C. line 5, line 6, line 9						 D. line 4, line 5, line 8
		 
		 byte < short < int < long < float < double
		 
		 */
		long u = 10l;
		double d1 = 10f;
		double d2 = 10l;
		
		/*
		 5. Which code fragment, when inserted at line 3, enables the code to print 10:20?
				public static void main(String[] args) {
				
					 line 3 **
					 arr[0]=10;
					 arr[1]=20;
					 System.out.println(arr[0]+" "+ arr[1]); 
				}
				
				A. int arr[2] ;                           B. int[] arr n = new int[2];
				C. int[] arr;     arr = int[2];           D. int arr[] = new int[2];  (correct)
	 
		 
		 */
		
		int [] arrp = new int[2];
		 arrp[0]=10;
		 arrp[1]=20;
		 System.out.println(arrp[0]+" "+ arrp[1]); 
	
		
		
		 /*
		  		6.  What's the result?
		  		public static void main(String[] args) {
			
						System.out.println("Result A"+0+1);
						System.out.println("Result B"+(1)+(2));
						
					}

(correct)  A. ResultA01     ResultB12            B. ResultA01     ResultB3
		    C. ResultA1      ResultB3 			  C. ResultA1      ResultB12
		  
		  */
		
		 System.out.println("Result A"+0+1);
		    System.out.println("Result A".concat("0").concat("1"));//result - A01
			
		 System.out.println("Result B"+(1)+(2));
			System.out.println("Result B".concat("1").concat("2"));//result - B12
		
		
		  /*
		   			7.  What's the result?
		   			
		   			public static void main(String[] args) {
			
							System.out.println("5 + 2 = "+3+4);
							System.out.println("5 + 2 = "+(3+4));
							
						}
				
	  (correct) A. 5 + 2 = 34     5 + 2 = 7		       B. 5 + 2 = 34    5 + 2 =34
		   		C. 7 = 7        7 + 7				   D. 5 + 2 = 3 + 4     5 + 2 = 7
		   
		   */
		
			System.out.println("5 + 2 = "+3+4);
			System.out.println("5 + 2 = "+(3+4));
			
		
		
		  
		   /*
		      8. What's the result?
		      
		      	public static void main(String[] args) {
						String str = " ";
							str.trim();
						System.out.println(str.equals("") +"   "+str.isEmpty());	
					}
					
			   A. false     true		            B. true    true
	(correct)  C. false     false				    D. true    false
		 
		   */
		
			String str = " ";
			 str.trim();
		System.out.println(str.equals("") +"   "+str.isEmpty());	
	
		String A1 = "    Cyber tek    ";
		A1.trim(); //"Cyber tek"
System.out.println(A1);			
			/*
			    9. what's the result ?
			    		public static void main(String[] args) {
								int[][] arr=  { {1,2}, {3,4} };
								for(int i=arr.length-1; i>=0; i-- ) {
									for(int j=0; j<arr.length; j++) {
										System.out.println(arr[i][j]+" ");
									}
								}
							}
							
	  (correct) A.  3 4 1 2							B. 1 2 3 4
				C.  4 3 2 1						    D. 2 1 3 4
			 
			 */
		int[][] arr8=  { {1,2}, {3,4} };
		for(int i=arr8.length-1; i>=0; i-- ) {   //i=1     i=0
			
			for(int j=0; j<arr8.length; j++) {   //j=0    j=1    j=0  j=1
				
				System.out.println(arr8[i][j]+" ");//arr8[1][0]=3    //arr8[i][1]=4
				                                   //arr8[0][0]=1    //arr8[0][1]=2
			}
		}
		
		
			/*
			     10. Which statement is true about Java byte code?

				      A.  it can run on any platform.
				
				      B. it can run on any platform only if it was compiled for that platform.
				
	    (correct)      C. It can run on any platform that has the Java Runtime Environment.
				
				      D. It can run on any platform that has a Java compiler.
				      
			 
			 */
		/*
		 Array: size is fixed.  supports primitives, wrapper class and objects  (immutable)
		 */
		
		
		//int[] arr= {1,2,34,5};
		//Integer[] arr2 = {1,2,3, null};
		
		int[] arr3=new int[4];
		
		/*
		 ArrayList: does not support primitives,  size is not fixed.     (mutable version of array).
		 */
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		
		// add( ) ,   remove(). get(), set(), sort(), clear()
		
		
		// add(value));  any value u give in arraylist is not primitive
		ArrayList<Integer> list2= new ArrayList<>();
				list2.add( new Integer(1) );   // 1 is converted to Integer    (Autoboxing)
				list2.add(2);
		
		
			// add(index position, value)
		
			//	list2.add(3, 8);   // 
				System.out.println(list2);
		
				
					// get(index number) : gets the index from the lisdt
						// print 2: 
				System.out.println(list2.get(1));
				
	
		// remove(): 	 removes index , or delets value.	
				
				ArrayList<Integer> list3 =new ArrayList<Integer>();
							list3.add(10);
							list3.add(2);
							list3.add(4);
				
							// remove 2 from the list:  remove(index num)
								//   list3.remove(  1  );
									// primitives in remove method it will remove the index of the arrayliist
							
								//Integer a=2;
							list3.remove(a);  // wrapepr class in remove method  will rem,ove the value
								System.out.println(list3);
		
							
								Integer b=10;								
							boolean b1 =	list3.remove(b);
								System.out.println(b1);
								
								System.out.println(list3);
								
								Integer b2=20;								
								boolean b3 =	list3.remove(b2);
								System.out.println(b3);
								
								
					
	ArrayList<String> arrlist=new ArrayList<String>(Arrays.asList("A","B","C", "D","E","F","J"));		
								
								
						arrlist.remove("B");		
						System.out.println(arrlist);
								
					if( arrlist.remove("1") ) {
						arrlist.remove("J");
					}
					
					
					
					System.out.println(arrlist);
					
					
			
								
	}

}
