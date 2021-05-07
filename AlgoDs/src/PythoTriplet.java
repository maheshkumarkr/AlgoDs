import java.util.Arrays;

public class PythoTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,4,49,1,59,19,81,97,99,82,90,99,10,58,73,23};
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		// Sort the "Square" numbers and proceed with regular "Triplet" program technique
		System.out.println(getTriplet(arr, arr.length));
	}
	static boolean getTriplet(int[] arr, int N){
	    for(int i=N-1;i>=2;i--){
		        int j=0;
                int k=i-1;
                while(j<k)
                {
                    if(arr[j]+arr[k] == arr[i])
                    {
                        return true;
                    }
                    else if(arr[j]+arr[k] < arr[i])
                        j++;
                    else
                        k--;
                }
		  }
		  return false;
	}
}
