package com.training.algorithms.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    public int findKthLargestQS(int[] arr, int k){
        if( k < 1 || arr == null)
            return 0;
        return getKth(arr.length - k + 1, arr, 0, arr.length - 1);
    }

    private int getKth(int k, int[] nums, int start, int end){

        int pivot = nums[end];
        int left = start;
        int right = end;

        while(true) {
            while (nums[left] < pivot && left < right) {
                left++;
            }
            while (nums[right] >= pivot && right > left) {
                right--;
            }
            if (left == right) {
                break;
            }
            swap(nums, left,end);
        }

        swap(nums, left,end);

        if( k == left + 1){
            return pivot;
        }else if( k < left + 1){
            return getKth(k,nums,start,left - 1);
        }else {
            return getKth(k,nums,left + 1,end);
        }
    }
    private void swap(int[] nums, int n1, int n2){
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

    public int findKthLargestH(int[] nums, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>(k);
        for(int i : nums) {
            q.offer(i);
            if(q.size() > k){
                q.poll();
            }
        }
        System.out.println(q);
        return q.peek();
    }
}
