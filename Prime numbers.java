public class primeNum {
    public static void main(String[] args){
        int num = 21;
        int counter = 0;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                counter++;
            }
        }if(counter>0){
            System.out.println(num + " is not a prime number");
        }
        else{
            System.out.println(num + " is a prime number");
        }
    }

}



