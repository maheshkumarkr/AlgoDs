
public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {16,17,4,3,5,2};
		leadersInArr(arr,arr.length);
	}
	static void leadersInArr(int[] arr, int N) {
		int max = arr[N-1];
		for(int i=N-2;i>=0;i--){
	        if(arr[i]>=max)
	            max=arr[i];
	        else
	            arr[i]=-1;
	    }
	    for(int i=0;i<N;i++){
	        if(arr[i]!=-1)
	            System.out.println(arr[i]+" ");
	    }
	}
}
