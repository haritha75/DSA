public class Commonelement {

    public static void main(String[] args) {
        int arr[]={2,5,7,4};
        int a[]={12,14,5,8,9};

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<a.length;j++) {

                if(arr[i]==a[j])
                  System.out.println(arr[i]);
            }
        }
    }
    
}
