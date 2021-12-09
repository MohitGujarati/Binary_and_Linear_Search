package com.company.A10_Linear_and_Binaray_search;

/*
public class Binary_test {
    //given an array has N integers all the elements but one come twice array is sorted

    // an Array is {0,0,2,2,4,4,5,7,7,8,8,10,10} find the element which comes only once(singlet)
    // last element will never a singlet

    //brute force-here we can use xor which will give is the singlet but time complexity is O(n)
    // if we use hash map will will not be taking the advantage this sorted property
    //most optimal is binary search

    public static void main(String[] args) {
        int[] a={0,0,2,2,4,4,5,5,7,7,8,10,10,12,12};

        //whenever an new element comes it comes at even place index
        // unless it is that singlet after which all the new elements comes at odd
        // so left side elements on the target node comes at an even place
        // and after singlet new elements comes at odd place first occurrence of 7,8,10 is at odd index
        // and first occurrence of 2 and 4 is even place




        int low=0;
        int high=a.length-1;
        int n=a.length-1;


        while(low<=high){
           int  mid=low+(high-low)/2;

            if(mid > 0 && a[mid-1]==a[mid])
                mid--;

            if(mid<n-1 && a[mid+1]!=a[mid]){
                    System.out.println(" index:- "+mid+" number:-"+a[mid]);
                }
            if(mid % 2==0){
                low=mid+1;

            }else
                high=mid-1;

        }
    }
}

 */ // find the singlet form an sorted array

/*
// Java program to find first
// and last occurrences of a
// number in a given sorted array

import java.util.*;

class Occurrence {

      // if Target is present in arr[] then
     // returns the index of FIRST
    // occurrence of Target in arr[0..n-1],
   // otherwise returns -1

    static int first(int arr[], int Target, int n)
    {
        int start = 0, end = n - 1, res = -1;

        while (start <= end)
        {
            // Normal Binary Search Logic

            int mid = start+( end-start) / 2;

            if (arr[mid] > Target)
                end = mid - 1;
            else if (arr[mid] < Target)
                start = mid + 1;

                // If arr[mid] is same as
                // Target, we update res and
                // move to the left half.
            else
            {
                res = mid;
                end = mid - 1;
            }
        }
        return res;
    }

      // If Target is present in arr[] then returns
     // the index of LAST occurrence of Target in
    // arr[0..n-1], otherwise returns -1

    static int last(int arr[], int Target, int n)
    {
        int start = 0, end = n - 1, res = -1;

        while (start <= end)
        {
            // Normal Binary Search Logic
            int mid = start+( end-start) / 2;
            if (arr[mid] > Target)
                end = mid - 1;
            else if (arr[mid] < Target)
                start = mid + 1;

                // If arr[mid] is same as Target,
                // we update res and move to
                // the right half.
            else
            {
                res = mid;
                start = mid + 1;
            }
        }
        return res;
    }

    // Driver program
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 2, 2, 2,3, 4, 7, 8, 8};
        int n = arr.length;
        int Target = 8;
        System.out.println("First Occurrence = " + first(arr, Target, n));
        System.out.println("Last Occurrence =  " + last(arr, Target, n));

        // lets count how many time this Target came in our array
        int occ=last(arr, Target, n) - first(arr, Target, n)+1;
        System.out.println("number of time the Target element cam in array is = "+ occ);
    }
}

 */ // first and the last occurrence of the an elements in an array and number of times the elements are repeated in array (MIMP)

/*
class No_Of_rotations
{
    // Function to find the total number of times the array is rotated
    public static int findRotationCount(int[] A)
    {
        int left = 0;
        int right = A.length - 1;

        while (left <= right)
        {
            if (A[left] <= A[right]) {
                return left;
            }

            int mid = (left + right) / 2;

            int next = (mid + 1) % A.length;
            int prev = (mid - 1 + A.length) % A.length;

            if (A[mid] <= A[next] && A[mid] <= A[prev]) {
                return mid;
            }
            else if (A[mid] <= A[right]) {
                right = mid - 1;
            }

            else if (A[mid] >= A[left]) {
                left = mid + 1;
            }
        }
        // if nothing
        return -1;
    }

    public static void main(String[] args)
    {
        int[] A = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("The array is rotated " + findRotationCount(A) + " times");
    }
}

 */ //  program to find number of rotations in a sorted and rotated array

/*
class sqrt{
    static int integerSqrt(int n) {

        long low = 0;
        long high = n ;

        while(high - low >= 2) {
            long mid = (low + high) / 2;

            if(mid * mid <= n) low = mid;               // dismiss all values < mid
            else high = mid;                           //dismiss all values > mid
        }
        return (int)low;
    }
    public static void main(String[] args) {

        System.out.println(integerSqrt(53) );

    }
}

 */ //square root of number

/*
class binary{
    void searching(int[] a, int start, int end, int src, int mid) {

        if (a[0] > a[1]) {
            while (start <= end) {
                if (a[mid] == src) {
                    System.out.println("found at " + mid);
                    break;
                } else if (a[mid] > src) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                mid = start + (end - start) / 2;

            }
            if (start > end) {
                System.out.println("not found ");
            }
        }
        else if  (a[0]<a[1]){
            while (start<=end)
            {
                if (a[mid]==src){
                    System.out.println(src+" is found at Index  "+ mid );
                    break;
                }
                else if(a[mid]<src) {
                    start=mid+1;

                }
                else {
                    end=mid-1;
                }

                mid = start + (end - start) / 2;
            }
            if (start>end){
                System.out.println("Not found ");
            }

        }


    }

    public static void main(String[] args) {
        binary DB=new binary();
      //  int[] a={8,7,6,5,4,3,2,1};
        int[] a={1,2,3,4,5,6,7,8};
        int start=0;
        int src=7;
        int end =a.length-1;
        int mid =start+(end-start)/2;
        System.out.println(start +" "+mid+" "+end);
        DB.searching(a,start,end,src,mid);

    }
}

 */ // Order agnostic search



//All given questions in main file are imp this was just
//so now you are covered with Binary search
