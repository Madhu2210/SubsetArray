package com.bridglabz;

public class SubsetArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5};
        if(checkSubset(arr1,arr2)){
            System.out.println("arr2 is a subset of arr1");
        }else {
            System.out.println("arr2 is not a subset");
        }
    }

    public static boolean checkSubset(int arr1[],int arr2[]) {
        int j=0;
        for (int i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }
            if (j == arr1.length) {
                return false;
            }
        }
        return true;
    }
}
