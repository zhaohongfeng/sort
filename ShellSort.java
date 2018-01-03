package test;

/**
 * Created by zhaohf on 2017/12/26 0026.
 */
public class ShellSort {

    public static void main(String args[]){
        int [] array = {8,9,1,7,2,3,5,4,6,0};

        shellSort(array);

        for (int index :array){
            System.out.print(index+",");
        }
    }

    public static void shellSort(int [] array) {
        int gap = array.length / 2;
        while(gap >= 1){
            for (int gapIndex = 0; gapIndex < gap; gapIndex++) {
                for (int i = gapIndex + gap; i < array.length; i += gap) {
                    int temp = array[i];
                    int j;
                    for ( j = i - gap; j >= 0; j = j - gap) {
                        if (temp < array[j]) {
                            array[j + gap] = array[j];
                        } else {
                            break;
                        }
                    }
                    array[j+gap] = temp;
                }
            }
            gap = gap/2;
        }
    }
}
