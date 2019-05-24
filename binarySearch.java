public static boolean binarySearch(String s , char x){
        int left = 0 ; 
        int right = s.length() - 1; 
        while(left <= right){
            int mid = left + ((right - left)/2);
            if (x == s.charAt(mid))
                return true;
            else if ( x < s.charAt(mid))
                right = mid - 1;
            else 
                left = mid + 1;
        }
        return false;
    }