import java.util.Scanner;

public class findArmostrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,c,d=0,j=0,m,e;
        System.out.print("please give me ur first number: ");
        a=input.nextInt();
        System.out.print("Please Give me ur second number: ");
        e=input.nextInt();
        for(int i=a;i<=e;i++){
            m=i;
        while(m!=0){
            c=m%10;
            d=d+c*c*c;
            m=m/10;
        }
        j=m;
        m++;
        if(d==j){
        }
        System.out.println(j);
        /*else{
            j=d;
            m++;
            System.out.println(" ");
        }**/
        input.close();
        //System.out.println("Armstrong number between this two number is:"+j);
        }
    }


}