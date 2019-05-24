public static int[] bubbleSort(int[] arrays ){
        for(int i =0; i< arrays.length; i++){
            for(int j = 0; j<arrays.length-1-i; j++){
                if(arrays[j] > arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        return arrays;
    }