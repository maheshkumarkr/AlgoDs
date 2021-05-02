import java.util.*;

class SubArraySum {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    long checkVal=sc.nextLong();
		    long[] values = new long[N];
		    for(int i=0;i<N;i++){
		        values[i]=sc.nextLong();
		    }
		    getResult(values,N,checkVal);
		    System.out.println("");
		}
		sc.close();
	}
	private static void getResult(long[] values, int N, long checkVal){
	    long sum=0;
	    int slider=0;
	    for(int i=0;i<N;i++){
	        sum+=values[i];
	        while(sum>checkVal){
	            sum-=values[slider++];
	        }
	        if(sum == checkVal){
	          System.out.print((slider+1)+" "+(i+1));
	          return;
	        }
	  }
	  System.out.print("-1");
	}
}