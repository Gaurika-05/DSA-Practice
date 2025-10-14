package String;

public class capital {
 
    public static void main(String[] args) {
         StringBuilder sb=new StringBuilder("my name is gaurika");
          sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
           for(int i=1;i<sb.length();i++){
            if(sb.charAt(i-1)==' '){
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
           }
         }
        System.out.println(sb);
    }
 }

