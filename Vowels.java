public class vowels {
    public static void main(String[] args) {
        String s= "WHERE there IS a WILL there IS a WAY";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
               ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch);
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }

}



