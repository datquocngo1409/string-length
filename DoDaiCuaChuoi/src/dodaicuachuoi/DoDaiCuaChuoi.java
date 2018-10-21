package dodaicuachuoi;

import java.util.Scanner;

public class DoDaiCuaChuoi {

    public static int length(String s){
        return s.length();
    }
    
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s=sc.nextLine();
        System.out.println("The length is: "+length(s));
    }
    
}
