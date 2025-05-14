package Strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1="Listen";
        String str2="silentt";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        // check krna hai ki dono words ke characters ki frequency same hai ki nhi
        // l  i s t e n
        // l=1, i=1, s=1,t=1, e=1,n=1,
        // s i l e n t
        // s=1 , i=1 , l=1 ,e=1 , n=1, t=1

        // str1=> cisten
        int arr[]=new int[26];
        for (int i = 0; i <str1.length(); i++) {
            char ch=str1.charAt(i);
            int a=ch-'a';
            //     99-97=2
            //ch-> ascii - 97=>index
            arr[a]++;

        }

        for (int i = 0; i <26; i++) {
            if(arr[i]!=0) {
                //int freq=ch-'a';
                // freq+'a'=ch
                int a=i+'a';
                char ch=(char)a;
                System.out.println(ch + " " + arr[i]);

            }
        }
        for (int i = 0; i <str2.length(); i++) {
            char ch=str2.charAt(i);
            int a=ch-'a';
            //     99-97=2
            //ch-> ascii - 97=>index
            arr[a]--;

        }

        int count=0;
        for (int i = 0; i <26; i++) {
            if (arr[i] != 0)
            {
//                System.out.println("its not");
                count=1;
                break;
            }
        }
        if(count==0)
            System.out.println("valid anangram");
        else
            System.out.println("its not a anagram");


        String t="alice and bob love leetcode";
//        String t=s[i];
        int ans=t.split(" ").length;


    }
}
