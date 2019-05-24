    public static int minEditDistance(String A, String B){
        int[][] table = new int[A.length()+1][B.length()+1];
        for(int i =0 ; i<table.length; i++){
            table[i][0] = i;
        }
        for(int j =0 ; j<table[0].length; j++){
            table[0][j] = j;
        }
        for(int i =1 ; i < A.length(); i++){
            for(int j = 1; j < B.length(); j++){
                if(A.charAt(i) == B.charAt(j)){
                    table[i][j] = table[i-1][j-1];
                }else {
                    table[i][j] = minOf(table[i-1][j], table[i-1][j-1], table[i][j-1]) + 1;
                }
            }
        }
        return table[A.length()-1][B.length()-1];
    }

    public static int minOf(int a, int b, int c){
       int min = a;

       if(b < c){
           if(b < a){
               min = b;
           }
       }else {
           if(c < a){
               min = c;
           }
       }
       return min;
    }