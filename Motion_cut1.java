import java.util.Scanner;
public class Motion_cut1 {
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int n=0;
       while(n!=3){
        System.out.println("ENTER CHOICE:  (1.CELSIUS TO FAHRENHEIT)  (2.FAHRENHEIT TO CELSIUS)  (3.FOR EXIT)");
        int ch=in.nextInt();
        switch(ch){
            case 1:System.out.println("Enter the celsius value(The value should bein between 0 to 100 only):");
                   int c=in.nextInt();
                   if(c>=0&&c<=100){
                    int ctof=(c*9/5)+32;
                    System.out.println("The FAHRENHEIT value is:"+ ctof);
                   }else{
                    System.out.println("THIS IS NOT A CELSIUS VALUE");
                   }
                   break;
            case 2:System.out.println("Enter the fahrenheit value(The value should bein between 32 to 212 only):");
                   int f=in.nextInt();
                   if(f>=32&&f<=212){
                    int ftoc=(f-32)*5/9;
                    System.out.println("The FAHRENHEIT value is:"+ ftoc);
                   }else{
                    System.out.println("THIS IS NOT A FAHRENHEIT VALUE");
                   }
                   break;
            case 3:n=3;
                   break;
        }
       }
    }
}
