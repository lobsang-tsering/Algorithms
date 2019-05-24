 public static int[] selectionSort(int[] arrays){
        for(int  i = arrays.length - 1; i > 0 ; i-- ){
            int max  = 0 ; 
            int maxPointer = 0 ;    
            for(int j=0 ; j<i; j++){
                if(arrays[i]> max){
                    max = arrays[i];
                    maxPointer = i;
                }
            }

            arrays[maxPointer] = arrays[i];
            arrays[i] = max;
        }

        return arrays;
    }
