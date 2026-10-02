public class twosum {
    public static void main(String[] args) {
        int[] arr={2,7,5,4,8,3};
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("index:"+i+"'"+j);
                }
            }
        }
    }

}