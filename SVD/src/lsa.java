import Jama.*; 

public class lsa {
		//Krzysztof Kulpiciñski
	   public static void main (String argv[]) {

		//values||wartoœci
		   	double sumU = 0;
		   	double sumV = 0;
		   	  double[][] array = {{1.,0.,0.,1.,0.,0.,0.,0.,0.},{1.,0.,1.,0.,0.,0.,0.,0.,0.},{1.,1.,0.,0.,0.,0.,0.,0.,0.},{0,1,1,0,1,0,0,0,0},{0,1,1,2,0,0,0,0,0},{0,1,0,0,1,0,0,0,0},{0,1,0,0,1,0,0,0,0},{0,0,1,1,0,0,0,0,0},{0,1,0,0,0,0,0,0,1},{0,0,0,0,0,1,1,1,0},{0,0,0,0,0,0,1,1,1},{0,0,0,0,0,0,0,1,1}}; 
		   	  Matrix A = new Matrix(array); //A Matrix||Macie¿ A
		      System.out.print("A = ");
		      A.print(9, 6);

		      // compute the singular vallue decomposition

		      System.out.println();
		      SingularValueDecomposition s = A.svd();
		      System.out.print("U = "); //U Matrix||Macie¿ U
		      Matrix U = s.getU();
		      U.print(9, 6);
		      System.out.print("V = "); //V Matrix||Macie¿ V
		      Matrix V = s.getV();
		      V.print(9, 6);
		      System.out.print("S = "); //Sigma Matrix||Macie¿ Sigma
		      Matrix S = s.getS();
		      S.print(9, 6);
		      
		      //similarity||podobieñstwo
		      for(int i=0; i<U.getColumnDimension();i++)
		      {
		    	  for(int j=0; j<U.getRowDimension();j++)
			      {
		    		  sumU += U.get(j, i);
			    	  
			      }
		      }
		      
		      for(int i=0; i<V.getColumnDimension();i++)
		      {
		    	  for(int j=0; j<V.getRowDimension();j++)
			      {
		    		  sumV += V.get(j, i);
			    	  
			      }
		      }
		      
		      System.out.print(sumU);
		      System.out.print("\n");
		      System.out.print(sumV);

		}

}
