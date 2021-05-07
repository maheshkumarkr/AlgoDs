import java.util.Arrays;

public class LargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"54", "546", "548", "60"};
		printLargest(arr);
	}
	static String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr,(a,b) -> (Integer.compare(Integer.parseInt(b+a),Integer.parseInt(a+b))));
        for(int i = 0; i < arr.length-1; i++){
        	System.out.print(arr[i]);
        }
        System.out.println(arr[arr.length-1]);
        return "";
    }
}
