package Strings;

import java.util.Arrays;



public class StringAdvance {
    public static void main(String[] args) {

        String s="Hello bhai Kaise ho";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            String a=arr[i];
            // Hello
            // HellO
            // 01234
            // task H + substring(1,4)=>ell +O
            // H+ell+O
            // helper character-> captial krke dega
            char FirstCapitalChar=helper(a.charAt(0));
            char LastCapitalChar=helper(a.charAt(a.length()-1));

            String ans="";
            //HellO
            ans+=FirstCapitalChar+a.substring(1,a.length()-1)+LastCapitalChar;
            arr[i]=ans;
        }
        System.out.println(Arrays.toString(arr));


        String f="aaabbccdavpqrs";
        frequency(f);


        String str="car";
        String str1="arc";

        char arr1[]=str.toCharArray();
        char arr2[]=str1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i])
            {
               count=1;
                break;
            }

        }
          if(count==1)
              System.out.println("nanagram nhi hai");
          else
              System.out.println("equal hence anagram");




    }

    private static void frequency(String f) {

        int arr[]=new int[26];
        //abcdefghijklmnopqrstuvwxyz
        //01234567891011121314151617--25

        //array
        // 0 1 2 3 4 5 -----25
        // 2 0 0 0 0 0-------0 <- value
        //

        for (int i = 0; i <f.length(); i++) {
            char ch=f.charAt(i);
            //a->corresponding hume dhudhna hai a ka index jha pe hum a ki freq store kr ske
            //a->0 //b->1  => b ascii value hoti hai 98-97=1
            int index=ch-'a';
            //index+'a'=ch
            arr[index]++;

        }

        for (int i = 0; i <26; i++) {
            // arr[i]=> freq hai koi bhi character ki voh kitni hai
            //  i+'a' 0+97=>a
            if(arr[i]!=0) {
                int characterASciiVlaue = i + 'a';
                char ch = (char) characterASciiVlaue;
                System.out.println(ch + " " + arr[i]);
            }
        }
    }

    private static char helper(char ch) {
       if(ch>=65 && ch<=91)
           return ch;
       //a->A   97-32=65
       int a=ch-32;
        char ch1=(char)a;
//        System.out.println(ch1);

return ch1;
    }
}
