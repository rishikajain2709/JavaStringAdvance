package Strings;

public class ReverseStringWords {
    public static void main(String[] args) {
        String s="Hello hiee";
        ////////  olleH eeih
         StringBuilder sb=new StringBuilder();
          String ans="";
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                sb.reverse();
                //olleH
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder();
                //olleH

            }
            else {
                //olleHhiee
                sb.append(ch);
                //Hello
            }
        }

        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
