package intermediate;
import beginner.Arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapProblems {

    public static void main(String [] args){
        // frequency of number seen before arr = {1,2,2,3,3}
        frequencyOfNumberSeenBefore(new int[]{1,1,2,2,2,3,4,5,5,7,6,6,6});

        // Given an array find the first non-repeating element
        firstNonRepeatingElement(new int[]{1,1,2,2,2,3,4,5,5,7,6,6,6});

        // Given 2 arrays find intersection of 2 arrays
        intersectionOfTwoArrays(new int[]{1,2,66,55,8,9,10},new int[]{66,88,33,44,99,1});

        //Given an array Integer check if there exists a pairs of a[i] + a[j] = k
        boolean ans = checkExistsOfPairOfK(new int[]{7,4,10,2,5,16,3},12);
        System.out.println("ExistsOfPairOfK Ans : "+ ans);




    }

    private static boolean checkExistsOfPairOfK(int[] arr,int k) {
        HashSet<Integer> checkList = new HashSet<>();
        for(int val:arr){
            int diff = k - val;
            if(checkList.contains(diff)){
                return true;
            }
            else{
                checkList.add(val);
            }
        }
        return false;
    }

    static void frequencyOfNumberSeenBefore(int [] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(freq.containsKey(num)){
                int frequency = freq.get(num);
                freq.put(num,frequency+1);
            }else{
                freq.put(num,1);
            }
        }
        System.out.println(freq);
    }

    static void firstNonRepeatingElement(int [] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:arr){
            int num = i;
            if(freq.containsKey(num)){
                int frequency = freq.get(num);
                freq.put(num,frequency+1);
            }else{
                freq.put(num,1);
            }
        }

        for(int i:arr){
            int frequency = freq.get(i);
            if(frequency == 1){
                System.out.println(i);
                break;
            }
        }
    }

    static void intersectionOfTwoArrays(int [] arr1,int [] arr2){
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> arr1Set = new HashSet<>();
        for(int num : arr1){
            arr1Set.add(num);
        }
        for(int num : arr2){
            if(arr1Set.contains(num)){
                ans.add(num);
            }
        }
        System.out.println(ans);
        HashMap<Integer,Boolean> map= new HashMap<>();
    }
}
