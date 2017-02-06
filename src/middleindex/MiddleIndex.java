/*
You are a given an array of numbers. Find out the array index where sum of numbers preceding
the index is equal to the sum of numbers succeeding the index. 
 */
package middleindex;

public class MiddleIndex {

    public static int find_middle_index (int[] array)
    {
        int sum_left =0;
        int sum_right =0;
        int index = 0;
        int left_index = 0;
        int right_index = array.length-1;
        
        for(index = 0; index < array.length; index++)
        {
            for(left_index= 0; left_index<=index; left_index++)
            {
                sum_left +=array[left_index];
            }
            
            for(right_index= index+1; right_index <=array.length; right_index++)
            {
                sum_right +=array[right_index];
            }
            
            if(sum_left == sum_right)
            {
                System.out.println("The index is:" + index);
            }
            
           //resets the values: 
           left_index = 0;
           
           right_index = 0;
        }
        
        return index;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
