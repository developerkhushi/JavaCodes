public class Main
{
	public static void main(String[] args) {
	    int arr[] = new int[]{ 1, 2, 4, 5, 6, 8, 7};
	    
	    int left = 0, right = arr.length - 1, temp;
	    
	    while (left < right)
        {
          if (arr[left] % 2 != 0 && arr[right] % 2 == 0){
              temp = arr[left];
              arr[left++] = arr[right];
              arr[right--] = temp;
          }
           else if(arr[left] % 2 == 0 && arr[right] % 2 != 0) {
               left++;
               right--;
           }
           else if(arr[left] % 2 == 0 && arr[right] % 2 == 0) 
             left++; 
           else if (arr[left] % 2 != 0 && arr[right] % 2 != 0)
             right--;
        }
        // Print Array
	    for (int num:arr) System.out.print(num);
	}
}
