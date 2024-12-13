import java.util.*;
class practice1{
    public static void main(String[]args){
        int target =5;
        int[] num={1,2,3,4,5,6,7,8,9};
        int[] value=new int[2];
        int i=0;
        int j=1;
        while(j<num.length){
            if(num[i]+num[j]==target){
                value[0]=num[i];
                value[1]=num[j];
                break;
            }
             else if (num[i]+num[j] < target) {
                i++;  
            } else {
                j--; 
            }
        }
        
        System.out.println(value);
    }
}