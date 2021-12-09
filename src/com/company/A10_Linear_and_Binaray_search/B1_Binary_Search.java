package com.company.A10_Linear_and_Binaray_search;


/*
 class Binary_Search {


    void Binary(int[] a, int start, int end, int mid,int src){
        while (start<=end)
        {
            if (a[mid]==src){
                System.out.println(src+" is found at Index  "+ mid +"  position");
                break;
            }
            else if(a[mid]<src) {
                start=mid+1;
            }
            else {

                end=mid-1;
            }

          mid = start + (end-start)/2;
        }

        if (start>end){
            System.out.println("Not found ");
        }

    }
    public static void main(String[] args) {

        Binary_Search call=new Binary_Search();
        int[] b={1,54,6,561,234,656,67,787,98,9};

        //it is compulsory it should be in sorted form
        Arrays.sort(b);
        int[] a=b;

        int srch=54;
        int start=0;
        int end=a.length-1;
        int mid = start + (end-start)/2;                  //(li+hi)/2;<-this can give overflow
        call.Binary(a,start,end,mid,srch);


    }
}

 *///binary search

/*
class main{
    private static int  fun(int[] a, int start, int end, int x)
    {
        if (start>end) return -1;
        int mid= start+(end-start)/2;
        if (a[mid] == x) return mid;

       else if (a[mid] > x)
        {
            return fun(a, start , mid-1, x);

        }
        else
        {
            return fun(a,mid + 1,end, x);
        }

    }



    public static void main(String[] args) {
        int []a={2,3,6,7,9,10,12,15};
        int x=12,start=0,end= a.length-1 ;

        System.out.println(fun(a,start,end,x));


    }
}

 *////binary search (recursive)

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
class find_floor {
    void finding_floor(int[] a, int floor_of, int low , int high, int mid ) {

        int result_floor=0;
        int result_ciel=0;


        while (low <= high) {
            if (a[mid] == floor_of) {
                System.out.println("element found at index " + mid + " ");
                break;
            }
            else if (a[mid] < floor_of) {
            //this will give us the flore value just this one line will save the last value
                result_floor=a[mid];
                low = mid + 1;

            }
            else {
                //this will give us ciel just this one line will save the last value
                result_ciel=a[mid];
                high = mid - 1;

            }

            mid =low + (high-low)/2;
            if (low > high) {
                System.out.println("elements not found but floor value value is "+result_floor);
                System.out.println("elements not found but ciel value value is "+result_ciel);

            }
        }
    }
    public static void main(String[] args) {
        find_floor fl=new find_floor();
        int b[]={1,4,567,67687,789978,9,78,99,997,79};
        Arrays.sort(b);
        int[] a=b;
        int floor_of=5;
        int low =0;
        int high=a.length-1;
        int mid =low + (high-low)/2;
        fl.finding_floor(a,floor_of,low,high,mid);
    }
}



//
//-----------output
//        elements not found but floor value value is 4
//        elements not found but ciel value value is 9


 *///floor and ceil value in an array

/*
class Descending_binary{
    void searching(int[] a, int start, int end, int src, int mid){

        while (start<=end ){
            if (a[mid]==src){
                System.out.println("found at "+mid);
                break;
            }
            else if(a[mid]>src){
                start=mid+1;
            }

            else {
                end=mid-1;
            }
            mid =start+(end-start)/2;

        }if (start>end){
            System.out.println("not found ");
        }

    }
    public static void main(String[] args) {
        Descending_binary DB= new Descending_binary();

        int[] a={8,7,6,5,4,3,2,1};
        int start=0;
        int src=7;
        int end =a.length-1;
        int mid =start+(end-start)/2;
        System.out.println(start +" "+mid+" "+end);
        DB.searching(a,start,end,src,mid);

    }
}
 */ // descending  binary search

/*
class binary{
    void greater(int[] a, int start, int end, int src, int mid){
        while (start <= end) {
            if (a[mid] == src) {
                System.out.println(src+" is found at Index  "+ mid);
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
    void smaller(int[] a, int start, int end, int src, int mid){
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
    void searching(int[] a, int start, int end, int src, int mid) {

        // when first element is greater than then the second element
        if (a[0] > a[1]) {
            greater(a,start,end,src,mid);
        }
        // when second element is greater than then the second element
        else if  (a[0]<a[1]){
            smaller(a,start,end,src,mid);
        }
    }

    public static void main(String[] args) {
        binary DB = new binary();
       //int[] a={8,7,6,5,4,3,2,1};
        int[] a={1,2,3,4,5,6,7,8};
        int start=0;
        int src=7;
        int end =a.length;
        int mid =start+(end-start)/2;
        //System.out.println(start +" "+mid+" "+end);

        DB.searching(a,start,end,src,mid);

    }
}

 *//// Order agnostic search (when order not given just compare the first two elements of the array )(IMP)

/*
class main{
    private static int  fun(int[] a, int start, int end, int mid, int src) {

        while(start<=end){
            mid=start+(end-start)/2;

            if (a[mid]>src){
                end=mid-1;
            }else if(a[mid]<src) {
                start=mid+1;
            }
            else{
                if (a[mid]==0 || a[mid-1]!=src){
                    System.out.println("element found at "+mid);
                    break;
                }else
                    end=mid-1;

            }


        }
        return -1;

    }


    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 2,3, 4, 7, 8, 8};
        int n = a.length-1;
        int src = 2;
        int start=0,end =n-1,mid=start+(end-start)/2;
        fun(a,start,end,mid,src);
    }

}

 *///first occurrence of the an elements in an array //their is recursive sol do it from book

/*
class main{
    private static int  fun(int[] a, int start, int end, int mid, int src) {
        int n=a.length;

        while(start<=end){
            mid=start+(end-start)/2;

            if (a[mid]>src){
                end=mid-1;
            }else if(a[mid]<src) {
                start=mid+1;
            }
            else{
                if (a[mid]!=n-1 || a[mid]!=a[mid+1]){
                    System.out.println("element found at "+mid);
                    break;
                }else
                    start=mid+1;

            }


        }
        return -1;

    }


    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 2,3, 4, 7, 8, 8};
        int n = a.length-1;
        int src = 2;
        int start=0,end =n-1,mid=start+(end-start)/2;
        fun(a,start,end,mid,src);
    }

}

 *///last occurrence of the an elements in an array

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
class main{
    private static int  fun(int[] a, int n, int low, int high, int mid) {
        while (low<=high){
            mid=low+(high-low)/2;

            if (a[mid]==0){
                low=mid+1;
            }
            else if (mid==0||a[mid-1]==0)
                return (n-mid);
            else
                high=mid-1;

        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a={0,0,0,1,1,1,1};
        int n=a.length,low=0,high=n;
        int mid=low+(high-low)/2;
        System.out.println(fun(a,n,low,high,mid));

    }


}

 *///count 1s in a sorted array

/*
class No_Of_rotations
{
    // Function to find the total number of times the array is rotated
    public static int findRotationCount(int[] a)
    {
        int low = 0;
        int high = a.length - 1;

        while (low <= high)
        {
            if (a[low] <= a[high]) {
                return low;
            }

            int mid = (low + high) / 2;

            int next = (mid + 1) % a.length;
            int prev = (mid - 1 + a.length) % a.length;

            if (a[mid] <= a[next] && a[mid] <= a[prev]) {
                return mid;
            }
            else if (a[mid] <= a[high]) {
                high = mid - 1;
            }

            else if (a[mid] >= a[low]) {
                low = mid + 1;
            }
        }
        // if nothing
        return -1;
    }

    public static void main(String[] args)
    {
        int[] a = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("The array is rotated " + findRotationCount(a) + " times");
    }
}

 *///  program to find number of rotations in a sorted and rotated array.(IMP)

/*
class Main
{
    // Function to search an element `x` in a nearly sorted array `A`
    public static int searchElement(int[] A, int target)
    {
        // search space is `A[left…right]`
        int start = 0;
        int end = A.length - 1;

        // loop till the search space is exhausted
        while (start <= end)
        {
            // find middle index `mid` and compare `A[mid-1]`, `A[mid]`, and `A[mid+1]`
            // with the target number
            int mid = (start + end) / 2;

            if (A[mid] == target) {
                return mid;
            }

            else if (mid - 1 >= start && A[mid - 1] == target) {
                return mid - 1;
            }

            else if (mid + 1 <= end && A[mid + 1] == target) {
                return mid + 1;
            }


            else if (target > A[mid]) {
                start = mid + 2;
            }
            else {
                end = mid - 2;
            }
        }

        // invalid input or number is not present in the array
        return -1;
    }

    public static void main(String[] args)
    {
        int[] A = { 2, 1, 3, 5, 4, 7, 6, 8, 9 };

        int target = 5;

        int index = searchElement(A, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
}

 */ // search element in nearly sorted array

/*
class ciel_floor{

   void Binary(int[] a, int start, int end, int mid,int src) {
       int res_floor = 0;
       int res_ciel = 0;

       while (start <= end) {
           if (a[mid] == src) {
               res_floor=a[mid];
               System.out.println(src + " is found at Index  " + mid + "  position");
               break;
           } else if (a[mid] < src) {
               res_floor = a[mid];
               start = mid + 1;

           } else {
               res_ciel = a[mid];
               end = mid - 1;
           }

           mid = (start + end) / 2;


       }
       if (start > end) {
           System.out.println("Not found but floor and ciel are ");
       }


           System.out.println("floor " + res_floor);
           System.out.println("ciel " + res_ciel);

   }
       public static void main (String[]args){
           ciel_floor floor_ciel = new ciel_floor();

           int[] b = {1, 3, 4, 6, 7, 8, 9};

           int srch = 3;
           int start = 0;
           int end = b.length - 1;
           int mid = start + (end - start) / 2;                  //(li+hi)/2;
           floor_ciel.Binary(b, start, end, mid, srch);

       }
   }

 */ //floor_ciel of an array

/*

class main{
    void find(int[] c){

        Arrays.sort(c);
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        int start=0;
        int end=c.length;
        int mid =start+(end- start)/2;
        int key=6;

        while(start<=end){

            if (c[mid]==key){
                System.out.println();

                System.out.println("key found at index "+mid);
                break;
            }else if(c[mid]>key){
                end=mid-1;
            }else start=mid+1;

            mid=start +(end-start)/2;

        }if (start>end){
            System.out.println("element not found");
        }

    }

    public static void main(String[] args) {
        main call=new main();

        int []arr1={2,3,6,7,9};
        int []arr2={1,4,8,10};

        int a1= arr1.length;
        int b1= arr2.length;
        int c1=a1+b1;
        int []c=new int[c1];

        for (int i=0;i<a1;i++){
            c[i]=arr1[i];
            }
            for (int i = 0; i < b1;i ++) {
                c[a1 + i] = arr2[i];
        }
         for (int i=0;i<c1;i++){
             System.out.print(" " +c[i]);
         }
        System.out.println();


        call.find(c);


    }
}*/// find kth elements from two arrays

/*

 */ // infinite sorted array see on youtube NOT POSSIBLE TO CODE   classic Face-to-Face interview question

/*
class Alphabet {
    static int binarySearch(String[] arr, String key)
    {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // comparing the key with mid
            int res = key.compareTo(arr[mid]);

            if (res == 0)
                return mid;

            if (res > 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }
    public static void main(String []args)
    {
        String[] arr = { "A", "B", "C", "D","E"};
        String key = "E";

        int result = binarySearch(arr, key);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}

 */// search alphabet from the array

/*
class median{
    private static int  fun(int[] a, int[] b) {
        int i=a.length/2;
        int i2=((a.length+b.length)+1)/2-i;
        int res1=-1,res2=-1;
//       System.out.println(i);
//        System.out.println(i2);

        if (a[i-1] >= b[i2-1]){
             res1=a[i-1];
        }
        else if (a[i-1] <= b[i2-1]){
            res1=b[i2-1];
        }
//        System.out.println(a[i-1]+" "+b[i2-1]);
//
//        System.out.println("greatest is "+res1);
        if (a[i] <= b[i2]){
            res2=a[i];
        }
        else if (a[i] >= b[i2]){
            res2=b[i2];
        }
       // System.out.println("smallest is "+res2);

        int median=(res1+res2)/2;
     //   System.out.println(median);
        return median;
    }
public static void main(String[]args){

    int a[]={10,20,30,40,50};
    int b[]={5,15,25,27,35,55,65,75,85};
    // int b[]={5,15,25,35,45,55,65,75,85};
    System.out.println("median two arrays "+fun(a,b));;

}
}

 */ //median of two arrays

/*
class main
{
    private static void fun(int[] a, int src, int low, int high) {

            while (low <= high) {
                int mid = (low + high) / 2;

                if (a[mid] == src) {
                    System.out.println(mid);
                }

                if (a[low] < a[mid]) {
                    if (src >= a[low] && src < a[mid]) {
                        high = mid - 1;
                    } else
                        low = mid + 1;

                } else if (src > a[mid] && src <= a[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        System.out.println("-1");

    }


    public static void main(String[] args) {
        int a[]={10,20,30,40,5,6,8};
        int src=5;
        int low=0,high=a.length-1;
        fun(a,src,low,high);
    }
}

 */// find in nearly sorted array


































































