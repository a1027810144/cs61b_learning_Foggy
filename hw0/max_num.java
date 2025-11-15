
public class max_num {
    public static int maxofnum(int[] input){
        if (input.length>0){
            int element=input[0];
            for(int i =1;i<input.length;i++){
                if(element < input[i]){
                    element=input[i];
                }
            }
            return element;
        }
        else{
            System.out.print("Array input's length must be greater than zero.");
            return -1;
        }
    }

    public static void main(String[] args){
        int[] input=new int[]{1,3,4,5,22,12,444,2222,4442,11111};
        System.out.printf("The maximum number in the array is:%d ",maxofnum(input));
    }
}
