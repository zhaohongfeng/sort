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
