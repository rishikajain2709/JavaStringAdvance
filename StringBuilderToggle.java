package Strings;

public class StringBuilderToggle {
    public static void main(String[] args) {
        String s="AbcDe@F 1234";
        StringBuilder sb=new StringBuilder(s);
        //sb.setCharAt() =>A->a
        // A=> a   sb=>a
        for (int i = 0; i <sb.length(); i++) {
            char ch = sb.charAt(i);
            int a=ch;
            if (ch >= 97&& ch<=122)
            {
                a-=32;
                char ch1=(char)a;
                sb.setCharAt(i,ch1);
                // small letter
            }
            else if(ch>=65 && ch<=91)
            {
                a+=32;
                char ch1=(char)a;
                sb.setCharAt(i,ch1);
                //capital
            }
//            else {
//                sb.append(ch);
//            }
        }
        System.out.println(sb);
    }
}
