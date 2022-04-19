import java.util.Scanner;
public class FillingArray {
    public static void main(String[] args){
        int len;
        Scanner wr = new Scanner(System.in);
        Scanner lens = new Scanner(System.in);
        System.out.print("Enter length array: ");
        len = lens.nextInt();
        String[] str = new String[len];
        for (int i=0; i< str.length; i++){
            System.out.print("Write data in [" + (i + 1) + "]: ");
            String wort = wr.nextLine();
            System.out.println();
            str[i] = wort;
        }
        for (String s:str){
            System.out.print(s);
        }
    }
}
