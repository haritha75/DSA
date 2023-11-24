public class OddTimesRepeatedNumber {

    public static void main(String[] args) { 

        int arr[] = {2,2,4,4,5,5,5,1,1};

        int res = arr[0];
        for(int i=1;i<arr.length;i++) {
            res = res^ arr[i];
        }
        System.out.println(res);
    }
    
}
