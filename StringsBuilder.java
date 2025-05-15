package Strings;

import java.util.Scanner;

public class StringsBuilder {
    public static void main(String[] args) {
//        String s="abc"
//        String s="";
        // String s="abc";
        //      StringBuilder sb1=new StringBuilder(100);

        StringBuilder sb=new StringBuilder("abcd");

//        String s="abcd";
//        s+="efgh";
//        sb.append(12);
//        sb.append(true);
//        sb.append('a');
//        sb.append("abcd");

        //reverse
//        sb.reverse();
        // modify
        //string modify ❌❌
        // string "abc"=> s.charAT(0)='d'❌❌

        // modify easily
      // by using setCharAt()
//        sb.setCharAt(0,'c');
        // abc d
        // 3rd index space ko insert kro
//        sb.insert(3,' ');
//        System.out.println(sb);

        // character delete
//        sb.deleteCharAt(3);
//        System.out.println(sb);
//        sb.delete(1,3);
//        System.out.println(sb);

        // substring method same as string
        //abcd
//        sb.substring(0);
//        sb.substring(1,4);

//        String p=""+sb;
//        String p=sb.toString();

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        StringBuilder sb1=new StringBuilder(s1);
//        StringBuilder sb1=new StringBuilder(sc.next());
//        StringBuilder sb1=new StringBuilder(sc.nextLine());








    }
}
