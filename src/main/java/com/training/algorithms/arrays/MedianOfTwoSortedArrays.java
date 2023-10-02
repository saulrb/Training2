package com.training.algorithms.arrays;


public class MedianOfTwoSortedArrays {

    public double calculate(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] merged = merge(arr1,arr2,size);
        if ( size % 2 == 0) { // even
            int k = size / 2;
            int m = k + 1;
            return ( ( merged[k-1] + merged[m-1] ) * 0.5d );
        } else { // odd
            int k = (size + 1) / 2;
            return merged[k-1];
        }
    }
    private int[] merge(int[] arr1,int[] arr2, int size){
        int[] merged = new int[size];
        int kmax = arr1.length;
        int mmax = arr2.length;
        int k=0, m=0;
        boolean kIsMax = false;
        boolean mIsMax = false;
        if ( kmax == 0 && mmax > 0)
            return arr2;
        if ( mmax == 0 && kmax > 0)
            return arr1;

        for(int i = 0; i < size ; i++){
            if (kIsMax){
                merged[i] = arr2[m];
                m = m < mmax -1 ? m + 1 : m;
                continue;
            }
            if (mIsMax){
                merged[i] = arr1[k];
                k = k < kmax -1 ? k + 1 : k;
                continue;
            }
            if (arr1[k] > arr2[m]) {
                merged[i] = arr2[m];
                if( m == (mmax -1) ) mIsMax = true;
                m = m < mmax -1 ? m + 1 : m;
            }else if(arr1[k] < arr2[m] ) {
                merged[i] = arr1[k];
                if( k == (kmax -1) ) kIsMax = true;
                k = k < kmax -1 ? k + 1 : k;
            } else if (arr1[k] == arr2[m]){
                merged[i] = arr1[k];
                merged[++i] = arr2[m];
                if( m == (mmax -1) ) mIsMax = true;
                m = m < mmax -1 ? m + 1 : m;
                if( k == (kmax -1) ) kIsMax = true;
                k = k < kmax -1 ? k + 1 : k;
            }
            if ( i == size-1 && (k == (kmax -1) || m == (mmax - 1)) ) {
                if (arr1[k] > arr2[m]) {
                    merged[i] = arr1[k];
                }
                if (arr1[k] < arr2[m]) {
                    merged[i] = arr2[m];
                }
            }
        }
        return merged;
    }
}
