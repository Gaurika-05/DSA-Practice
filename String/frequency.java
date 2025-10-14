package String;

public class frequency {
     public static void main(String[] args) {
     StringBuilder sb=new StringBuilder("banana");
     char target='a';
     int count =0;
      for(int i=0;i<sb.length();i++){
       if(sb.charAt(i)==target){
         count++;
       }
     }
        System.out.println(count);
    }
   }

