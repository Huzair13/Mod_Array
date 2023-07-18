import java.util.Scanner;

public class ModArray{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of the Array !!!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements !!!");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the number B!!!");
        int B=scanner.nextInt();

        int result=modArray(array,size,B);
        System.out.println(result);
    }

    private static int modArray(int[] array, int size, int b) {
        int result=0;
        int power=1;
        for(int i=size-1;i>=0;i--){
            result=(result+((array[i]%b)*power))%b;
            power=(power*10)%b;
        }
        return result;
    }
}