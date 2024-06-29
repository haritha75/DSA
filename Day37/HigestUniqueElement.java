public class HigestUniqueElement {

    public static void main(String[] args) {
        int arr[]={3,4,4,5,5,7,7};
        int count=1,i;
        for(i=arr.length-1;i>0;i--) {
            if(arr[i]==arr[i-1]) {
                count++;
            }
            else {
                if(count==1){
                  System.out.println(arr[i]);
                  return;
                }
                  count=1;
                  
            }
         
        }
        if(count==1)
             System.out.println(arr[i]);
       
    }
    
}
