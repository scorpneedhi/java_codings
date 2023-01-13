class Solution {
    public void duplicateZeros(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                int j=arr.length-2;
                while(j>=i+1){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[i+1]=0;
                i++;
            }            
        }
    }
}
