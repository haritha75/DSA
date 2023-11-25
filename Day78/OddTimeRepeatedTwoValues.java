public class OddTimeRepeatedTwoValues {

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,2,4,5,4};
        int mask=1;
        int ans = arr[0];

        for(int i=1;i<arr.length;i++){
            ans ^= arr[i];
        }

        while ((ans & mask) == 0) {
            mask <<=1;
        }

        int num1 = 0,num2 =0;

        for(int i=0;i<arr.length;i++) {

            if((mask & arr[i]) == 0)

                num1 ^= arr[i];
            else
            
                num2 ^= arr[i];
        }

        System.out.println(num1+" "+num2);
    }
}