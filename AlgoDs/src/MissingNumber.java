import java.io.*;

class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            System.out.println(missingNumber(array, n));
        }
    }
static int missingNumber(int array[], int n) {
        int mathSum = (n * (n+1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < n-1; i++){
            actualSum += array[i];
        }
        return mathSum - actualSum;
    }
}