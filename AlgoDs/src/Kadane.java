import java.io.*;

public class Kadane {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    System.out.println(maxSubarraySum(arr, n));
		}
	}
    static int maxSubarraySum(int arr[], int n){
        int currentMaxSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++){
            currentMaxSum = Math.max(arr[i], currentMaxSum+arr[i]);
            maxSum = Math.max(currentMaxSum,maxSum);
        }
        return maxSum;
    }
    
}

