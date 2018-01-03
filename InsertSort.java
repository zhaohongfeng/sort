package test;

/**
 * Created by zhaohf on 2017/12/25 0025.
 */
public class InsertSort {

    public static void main(String[] args){
        int [] array = {4,7,8,0,2,1,11,12,31,10};

        for (int i:array){
            System.out.print(i+",");
        }

        insertSort3(array);

        System.out.println();
        for (int i :array){
            System.out.print(i+",");
        }

    }

    public static void insertSort(int [] array){
        int temp = 0;
        for(int i = 1;i < array.length ; i++){
            temp = array[i];
            for(int j = i - 1;j >= 0 ;j--){
                if (temp < array[j]){
                    array[j+1] = array[j];
                    array[j] = temp;
                }else{
                 break;
                }
            }
        }
    }

    public static void insertSort2(int [] array){
        int temp = 0;
        for(int i = 1;i < array.length ; i++){
            temp = array[i];
            int j;
            for(j = i - 1;j >= 0 ;j--){
                if (temp < array[j]){
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }
    }

    public static void insertSort3(int [] array){
        int temp = 0;
        for(int i = 1;i < array.length ; i++){
            temp = array[i];
            int j;
            for(j = i - 1;j >= 0 && temp < array[j] ;j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }




}
