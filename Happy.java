//Happy Number
import java.util.*;
class Happy{
    private int n;
    void accept(){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            n=sc.nextInt();
        }while(n<=9);
        for(int i=n;;i++){
            if(isHappy(i)){
            System.out.println("Happy number: "+i);
            break;
            }
        }
    }
    boolean isHappy(int x){
        int s=x;
        for(int i=1;;i++){
        s=sum(s);
        if((count(s))==1){
            if(s==1)
            return true;
            else
            return false;
            }   
        }
    }
    int sum(int x){
        int t=0;
        while(x>0){
            int b=x%10;
            t+=(int)Math.pow(b,2);
            x/=10;
        }
        return t;
    }
    int count(int x){
        int c=0;
        while(x>0){
            int b=x%10;
            c++;
            x/=10;
        }
        return c;
    }
    public static void main(String args[]){
        Happy ob=new Happy();
        ob.accept();
    }
}