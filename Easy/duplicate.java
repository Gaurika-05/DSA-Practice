public class duplicate {
    public static void main(String[] args) {
    
        int []nums={1,2,2,3,3,4,4};
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                System.out.print(nums[i]);
            }
        }
    }
}
