package Strings;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String s="hello helle kaise ho";
        String arr[]=s.split(" ");
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String p="";
        for (int i = 0; i <arr.length; i++) {
            if(i!= arr.length-1) {
                p += arr[i];
                p += " ";
            }
            else
                p+=arr[i];

        }
        s=p;
        System.out.println(s);
//        p+=arr[arr.length-1];
    }
}
