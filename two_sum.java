class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int diff=0;
        int size=numbers.length;
        for(int i=0;i<size-1;i++){
            diff=target-numbers[i];
            for(int j=i+1;j<size;j++){
                if(numbers[j]==diff){
                    return new int[]{i+1,j+1};
                }
            }
        }
    return null;
}
}