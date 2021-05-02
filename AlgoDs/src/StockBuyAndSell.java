
import java.util.*;

class StockBuyAndSell {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		    int[] prices = new int[N];
		    for(int i=0;i<N;i++){
		       prices[i]=sc.nextInt();
		    }
		    int i=0;
		    int a=0;
		    int b=0;
		    while(i<N-1)
            {
                while(i<N-1 && prices[i+1]<=prices[i])
                    i++;
                if(i==N-1)
                    break;
                a=i++;
                while(i<N && prices[i]>=prices[i-1])
                    i++;
                b=i-1;
                System.out.print("("+a+" "+b+") ");
            }
            if(a==0 && b==0)
            	System.out.print("No Profit");
            System.out.println("");
		}
		sc.close();
	}
}