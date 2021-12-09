package com.company.A10_Linear_and_Binaray_search;

/*
public class Linear_Search_for_integer {
    //Linar seach is an iterative method which goes 1 iteam to another at a time
    public int Searchingalgo(int[] a, int target){

        int temp=0;
        for (int i=0;i<a.length;i++) {
            if (a[i] == target) {
                System.out.println("found at " + i);
                temp++;
            }
            }
        if (temp==0){
            System.out.println("not found ");

        }
        return 0;
    }

    public static void main(String[] args) {
        Linear_Search_for_integer lr=new Linear_Search_for_integer();
        int[] a={1,2,3,4,5,6,7,9,8};
        int target =8;
        lr.Searchingalgo(a,target);

    }
}

 */ //linear search for integer value

/*
class linaer_search_str{

    void searching(String[] a, String target) {
        int temp=0;
        for (int i=0;i<a.length;i++) {
            if (a[i].equals(target)) {
                System.out.println("found at " + i+" index position");
                temp++;
            }
        }
        if (temp==0){
            System.out.println("not found ");

        }

    }
    public static void main(String[] args) {

        linaer_search_str lrs=new linaer_search_str();
        String[] a={"abc","def","hijk","lmno","pqr","st"};
        String target="hijk";
        lrs.searching(a,target);
    }
}

 *///linear search for String value


