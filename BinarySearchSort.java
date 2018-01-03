package test;

/**
 * Created by zhaohongfeng on 2017/12/26 0026.
 */
public class BinarySearchSort {

    public static void main(String args[]){

        int [] array = {4,7,8,0,2,1,11,12,31,10};
        binarySearchSort(array);
        for (int index :array){
            System.out.print(index+",");
        }


    }
    public static void binarySearchSort(int [] array){
        int temp;
        for (int i = 1;i < array.length ; i++){
            temp = array[i];
            int mid;
            int start = 0;
            int end = i -1;
            while(end >= start){
                mid = (start + end)/2;
                if (array[mid] > temp){
                    end  = mid - 1;
                }else if (array[mid] <= temp){
                    start  = mid + 1;
                }
            }
            for(int j = i - 1; j >= start ; j--) {
                array[j + 1] = array[j];
            }
            array[start] = temp;
        }

    }
}
