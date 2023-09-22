//Normal appoach time complexity is o(n^2)
public class NearestSmallElement {
    public static void main(String[] args) {
        

        int arr[] ={4,5,2,10,8};
        for(int i=0;i<arr.length;i++) {
            boolean flag =true;
            for(int j=i-1;j>=0;j--) {
                if(arr[i]>arr[j]) {
                    flag=false;
                    System.out.print(arr[j]+" ");
                    break;
                }


            }
            if(flag)
                System.out.print(-1+" ");

        }


    }
}