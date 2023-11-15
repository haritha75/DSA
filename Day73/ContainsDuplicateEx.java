import java.util.Arrays;
public class ContainsDuplicateEx {

    public static void main(String[] args) {
        
        int a[]={1,4,6,1,7};

        boolean flag=true;

        for(int i=0;i<a.length-1;i++) {
            for(int j=i+1;j<a.length;j++) {

                if(a[i]==a[j]) {
                    flag = false;
                  System.out.println(true);   
                }             

            }
        }
            if(flag==true)
               System.out.println(false);
        
    }
    
}
