package kunalDSA;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Main {
 public int searchInsert(int[] nums, int target) {
     int left = 0;
     int right = nums.length - 1;
     int index = -1;
     while(left <= right){
         int mid = left + (right - left) / 2;
         if(nums[mid] == target){
             index = mid;
         }
         if(nums[mid] < target){
             left = mid + 1;
         }
         if(nums[mid] > target){
             right = mid - 1;
         }
     }
     if(index == -1){
         
         for(int i = 0; i < nums.length-1; i++){
             if(target < nums[i] && target > nums[i+1]){
                 index = i+1;
             }
         }
     }
     return index;
     
 }
 
 public static void main(String[] args){
   int[] arr = {1,3,5,6};
   int target = 3;
   Main sol = new Main();
   System.out.println(sol.searchInsert(arr, target));
 }
}
