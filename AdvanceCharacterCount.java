package Strings;

public class AdvanceCharacterCount {
    public static void main(String[] args) {
        String s="aaabbccddeeff";
        //sorted string
        //output generate a3b2c2d2e2f2

        // a a a b
        // int count=1

        //String p="a"
        // result a1;
        //approach ans+=a;
        //if length==1 ans+=count;

        //prev char current char count
        //prev=0th index character
        // a a a b b
        // prev =a
        //loop i=1 i<s.length;i++
        // prev=cureent=a=2
        //i++ count++
        // count =3
        // i++
        // character=b
        // string a3
        //prev=s.charAt(i)=>prev=curr
        //count=1
        // prev=curr count=2;
        // index out of bound
        //ans+=prev+count

          char prev=s.charAt(0);
          int count=1;
          String ans="";
        for (int i = 1; i <s.length(); i++) {
            char curr=s.charAt(i);
            if(prev==curr)
            {
                count++;
            }
            else{
                ans+=prev;
                ans+=count;
                prev=curr;
                count=1;


            }
        }
        ans+=prev;
        ans+=count;
        System.out.println(ans);

    }
}
