package string.practice;

public class ReverseAString {
    public static String reverse(String string){
        char[] charArray = string.toCharArray();
        int left = 0 ;
        int right = string.length()-1;
       while(left<right){
           char temp = charArray[left];
           charArray[left] = charArray[right];
           charArray[right]= temp;
           left++;
           right--;
       }
       return new String(charArray);
    }

    public static void main(String[] args) {
        String result = reverse("rahul");
        System.out.println("result = " + result);

    }
}
