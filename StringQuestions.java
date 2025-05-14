package Strings;

import java.util.Arrays;

public class StringQuestions {
    public static void main(String[] args) {

//        String s="abcbaa";
        // pallindrom jisko hum reverse kre fir bhi same ans aaye
        // abcba
        // abcba=> reverse

//        String p="";
//
//        for (int i = s.length()-1; i>=0 ; i--) {
//            p+=s.charAt(i);
//        }
        // string class effective nhi hoti hai
        // yeh bhut jyada memory leti hai

        //""-> "a"->"ab"->"abc"-> "abcd"(ek nayi string create ho rhi hai)
        // "a"-> same string => ab => abc=> abcb=> abcba
//        System.out.println(p);
//        if(s.equals(p))
//            System.out.println("it is pallindrome");
//        else
//            System.out.println("its is not!!!");


//       boolean ans= checkPallindrome(s);
//       if(ans)
//           System.out.println("Yes");
//       else
//           System.out.println("No");

        //-----------------------------------------------------------------------------------


//        String s="AcgDfD";
//        System.out.println(toggle(s));
       //-----------------------------------------------------------------------------

//        String arr[]={"pay","attention","parctice","attend"};
//        System.out.println(checkPref(arr,"at"));

        //------------------------------------------------------------------
        String s="hello hiee kaise ho";
        String arr[]=s.split(" ");
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            String p=arr[i];
            // hello->Hello
            char ch=p.charAt(0);
            int a=ch-32;
            char ch1=(char)a;
            // hume yha pe capital H mil gya hai
            // ello substring method ka use lena pdega
            String newString="";
            newString+=ch1;
            newString+=p.substring(1);
            arr[i]=newString;



        }
        System.out.println(Arrays.toString(arr));


    }

    static int checkPref(String[] arr,String pref) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            String s=arr[i];
            if(s.startsWith(pref))
                count++;
        }

        return count;

    }

    private static String toggle(String s) {
    String p="";

    // ascii vakue range A-> 65 Z->91  65+26=>91 mtlb range 91 tak hoti hai capital letters ki
    // ascii vakue range a-> 97 z->122  97+26=>122 mtlb range 122 tak hoti hai small letters ki
        // A-> a  => ascii value change 65+32=>97
        // a->A   => ascii value 97-32=65

        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>=65 && ch<=91)
            {
              int a=ch+32;
              //    65+32
              // a=97
              char ch1=(char)a;
                p+=ch1;
            }
            else {

                int a=ch-32;
                //    97-32
                // a=65
                char ch1=(char)a;
                p+=ch1;

            }

        }
        return p;

    }


    static boolean checkPallindrome(String s) {

        if(s.isEmpty())
            return true;
   int start=0;
   int end=s.length()-1;
        // abcba
        //  s e
//        char start = s.charAt(0);
//        char end =s.charAt(s.length()-1);
//        if(start!=end)
//            return false;
//        start=s.charAt(1);
//        end=s.charAt(s.length()-2);
//        if(start!=end)
//            return false;
//        start=s.charAt(2);
//        end=s.charAt(s.length()-3);


        while (start < end)
        {
            char ch1=s.charAt(start);
            char ch2=s.charAt(end);
            if(ch1!=ch2)
                return false;
            else {
                start++;
                end--;
            }
        }


        return true;
    }

}
