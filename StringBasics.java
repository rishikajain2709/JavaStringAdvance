package Strings;

import java.util.Scanner;

public class StringBasics {

    public static void main(String[] args) {
        // string kya hota hai
        // abcdefghi=> collection of charcters

        //java mai humare pass ek alag se class hiti hai String class
        // jiske through hum kya kr skte hai hum humaro dstring bna skte hai
        // aur uspe opertaions perform kr skte hai

//        char arr[]={'a','b','c'};


        // String class and it methods
        // string input kaise lete hai

        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
//        String p= sc.nextLine();
        // input le kste hai via sc.next and sc.nextLine
        // next vs nextLine diffrence???

//        String s= sc.next();
//        System.out.println(s);
// yeh input tab tak hi lega jab tak isko space nhi mil jata ya fir nextLine enter nhi mil jata
        // example Kritika Rishika => output =>Kritika
        // example kritikaRishika=>   output=>kritikaRishika

//        String p=sc.nextLine();
//        System.out.println(p);
        // enter jab tk hum nhi krte tab tak yeh poora input leta hai
        // example Kritika is a hardworking girl
        // output Kritika is a hardworking girl


//        char arr[]={'a','b','c'};
//        char ch=arr[0];
//        System.out.println(ch);

//        String s="Abcd";
//        System.out.println(s[0]);
 // s[0] cant acess values like this
 // then what method should we use

      // s.charAt(i);
      // agar hume koi bhi character index ke through access krna hai toh hum kr skte hai
      // via s.charAt(i) method where i is the index;
//       char ch=s.charAt(0);
//        System.out.println(ch);
        // array ki length nikalni hai toh hum arr.length likte hai
        // agar string ki length nikalni hoti hai s.length()



        // strring => indexing voh based hai 0 based index pe
        // a   b  c   d => length=>4
        // indexing based hai 0 based
        // a-> 0 b->1 c->2 d->3


        // array example => 1 2 3 4
        // arr[4] kya hai  exception aayega vbacause 4 exist nhi krta as index


//        int a="abc";
//        String s1=123;
//




        String s="Abcdcaaaa";

        //abcd
        for (int i = 0; i <=s.length()-1; i++) {
            // loop dry run kro
            // i=0 0<4 ✅✅
            // s.charAt(0)=> a
            // i=1 1<4 ✅✅
            // s.charAt(1)=>b
            // i=2  2<4 ✅✅
            //s.charAt(2)=>c
            // i=3  3<4 ✅✅
            // s.charAt(3)=> d
            // i=4 4<4❌❌ loop break terminate
//            System.out.println(s.charAt(i));
        }


        // methods string
        // 1) s.charAt(i) => index ki help se hum access kr skte hai character ko
        //  2)indexOf(ch)=> jsyt opposite if charAT isme hum character dete hau aur hume index mil jata hai
        //        int a=s.indexOf('c');
        // System.out.println(a);
        // first index return krega c ka



        // 3)comapareTO 2 strings compare kr rha hai
        // comaparison kaise hota hai toh hum pe lexographically comp. hota hai
        // ans ya toh 0 hota hai ys fir<0 ya fir >0

//        String s1="Aello";
//        String s2="Cello";
//        System.out.println(s1.compareTo(s2));
//        // ans =-ve aa rha hai s2>s1
//        System.out.println(s2.compareTo(s1));
        // ans =+ve aa rha hai s2>s1 and s2 pehle likha hua hai
        // yha pe character by character checking hoti hai
        // for example h k => k >h  2nd string>1st string se ans -ve
        // 1st string >2nd string ans +ve
        // A B C
        // a aur c mai s1-aello s2=cello dffrence hai 2 ka -ve
        // s1-cello s2-aello ans =2+ve

        // 4) contains method
        // string accept krta hai na ki character ko
        // example

        String c="Kritikaa";
//        System.out.println(c.contains("it"));

        // 5) startsWith
        //  6) endsWith

//        System.out.println(c.startsWith("aa"));
//        System.out.println(c.endsWith("aa"));

        // ab hume bhut important method padhna hai voh hai
        //7) substring
        // 2 tarike se kaam krta hai str.subtring(a,b)
        // ya for hum firect ek argument bhi le skte hai
        //abcd
        //a ab abc abcd  b bc bcd c cd d

//        System.out.println(c.substring(0,3));
//        System.out.println(c.substring(0));
//        System.out.println(c.substring(3));


        // ans dena chahiye as  abc  par dega kya ab
        // kyun kyunki end index exclusive hota hai
        //0----2  => 0---<2 => 0 se 1
        // abc chahiye start=0 end 3 3 exclusive ans 2

// question hai generate all the substring fo abcd
// a ab abc abcd  b bc bcd c cd d yeh output aan chahiye
//        String str="abcd";
//        for(int i=0; i<=3;i++)
//        {
//            // dry run
//            // a=> s.subtring(0,)
//            // a=> s.substring(i,i+1)
//
//
//            for (int j = i+1; j <=4 ; j++) {
//                System.out.println(s.substring(i,j));
//            }
//
//        }



        // strigs immutable hoti hai
        //iska mtlb kye hai ki string ki value kbhi bhi change nhi ho skti hai
        String a="abc";
        a="pqr";

        // a-> abc (Heap memory)
        // a="pqr" a->"abc" connection tootega
        // aur a->pqr

        // concept of interning in java
        // string heap bnate hai
        String p="Hello";
        String q="Hello";
        // memory save performance better
        // new keyword
        String r=new String("Hello");
        //==
        // equals
//        System.out.println(p==r); false
        //p==q true
        //== operator compare address

        System.out.println(p.equals(r));
        // comapares on the basis of value











    }



}
