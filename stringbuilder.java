import java.util.*;
class stringbuilder{
public static void main(String args[]){
    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a';ch<='z';ch++){
        sb.append(ch);
    }

System.out.println(sb);
System.out.println(sb.length());

// niche ka work append work nhi karge ku ke java me string immutable hota hai 
// ... ek baar bn gya phir change nhi hoga...

// String sb = "tony";
// for(char ch = 'a';ch<='z';ch++){
//     sb.append(ch);
// }
// System.out.println(sb);
}
}