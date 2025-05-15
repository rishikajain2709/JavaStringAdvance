package Strings;

public class AllpallindromeSubstring {
    public static void main(String[] args) {
        String s="abcd";
        //substring generate
        int count=0;
        for (int i = 0; i <s.length(); i++) {

            for (int j = i+1; j <=s.length(); j++) {
//                System.out.println(s.substring(i,j));
               boolean ans= isPallin(s.substring(i,j));
               if(ans==true)
                   count++;
            }
        }
        System.out.println(count);


    }

    private static boolean isPallin(String substring) {
        if(substring.length()==1)
            return true;
        StringBuilder sb=new StringBuilder(substring);
        StringBuilder sb1=new StringBuilder(sb.reverse());
//        System.out.println(sb1);
        if(sb1.equals(sb)) {
            System.out.println(sb1);
            return true;
        }
        return false;
    }
}
