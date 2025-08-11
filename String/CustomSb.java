public class CustomSb {

   public void compressString(String str) {
      StringBuilder sb = new StringBuilder();
      int count = 1;
      for (int i = 0; i < str.length(); i++) {
         if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
            count++;
         } else {
            sb.append(str.charAt(i));
            if (count > 1) {
               sb.append(count);
            }
            count = 1;
         }
      }
      System.out.println(sb.toString());
   }
   public void reveseString(String str) {
      StringBuilder sb = new StringBuilder(str);
      for (int i = 0; i < sb.length()/2; i++) {
         int start = i;
         int end = sb.length() - i - 1;
         char temp = sb.charAt(start);
         sb.setCharAt(start, sb.charAt(end));
         sb.setCharAt(end, temp);
      }
      System.out.println(sb.toString());
   }
   public static void main(String[] args) {
      StringBuilder sb = new StringBuilder();
      System.out.println(sb.capacity()); // Default capacity is 16
      sb.append("Hello");
      sb.append(" ");
      sb.append("World");
      sb.insert(4, 'o');
      sb.replace(0, 5, "Hi");
      sb.delete(2, 4);

      System.out.println(sb.toString());
      CustomSb customSb = new CustomSb();
      customSb.compressString("aaabbbccddddd"); // Output: a3b3c2d5;
      customSb.reveseString("Hello");
   }
}
for (int i = 0; i < sb.length(); i++) {
        str = str + sb.charAt(i);
   }
      System.out.println(str);
   }
}