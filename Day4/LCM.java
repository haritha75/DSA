public class LCM {

    public static void main(String args[]) {

        int n1=120,n2=70,n3=40,lcm;

        lcm = n3>(n1>n2? n1:n2)? n3 : ((n1)>n2)? n1:n2;
        boolean flag = true;

        while(flag) {
            if(lcm%n1==0 && lcm%n2==0 && lcm%n3==0) {
                System.out.println("The lcm  is "+lcm);
                flag = false;
            }
            lcm++;
        }
    }
}