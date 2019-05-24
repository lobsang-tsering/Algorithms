public static int max(int a, int b ){
        return a>b ? a : b;
    }
   
    public static int kadene(int[] arrays){
        int currentMax = arrays[0];
        int globalMax = arrays[0];
        for(int i = 1 ; i<arrays.length; i++){
            currentMax = max(arrays[i], arrays[i] + currentMax);
            if(currentMax > globalMax)
                globalMax = currentMax;
        }
        
        return globalMax;
    }