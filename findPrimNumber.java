import java.util.Scanner;

public class findPrimNumber {
    public static void main(String[] args) {
        int a,b,d,c,e=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Please give 1st number: ");
        a=input.nextInt();
        System.out.print("Give 2nd number: ");
        b=input.nextInt();

        for( c=a;c<=b;c++){
            for(d=2;d<=c-1;d++){
                if(c%d==0){
                    e++;
                    break;
                }
            }
        
            if(e==0){
                 System.out.println("prime numer is:"+c);
            }
            else{
                System.out.print("Sorry ! there are no prime number between them.");
            }
            e=0;
        }
    }

}