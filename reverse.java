public static void reverse(int[] arrays){
        for(int i= 0 ; i < arrays.length/2; i++){
            int temp = arrays[i];
            int end = arrays.length - i - 1;
            arrays[i] = arrays[end];
            arrays[end] = temp;
        }

        for(int i : arrays){
            System.out.println(i + " ");
        }
    }
