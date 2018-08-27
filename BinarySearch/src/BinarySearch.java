/* Jonathan DeLorenzo - 2/6/2018 - Binary Search Program w/ related functions

*  The following program contains three major functions (listed below):

*

 *  1. setNumArray - generates an integer array with a length of 25 integers

*     that are randomly generated ranging from 1-50

*  

 *  2. sortNumArray - takes the array returned in setNumArray sorts the

 *     array out into a new array list

*  3. binarySearch - takes the sorted array list and performs a recursive

*     search on the arraylist until it arrives at the index of target value

*     the user is looking for. */

 

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Random;


public class BinarySearch {

      

       public static void main(String agrs[]) {

             

              sortNumArray();

       }

      

      

       public static int[] setNumArray()

       {

              int[] randNumArray = new int[25];

              Random rand = new Random();

             

              for(int i = 0; i < randNumArray.length; i++)

              {

                     int j = rand.nextInt(50)+1;

                     randNumArray[i] = j;

              }

              return randNumArray;

       }

      

       public static void sortNumArray()

       {

              ArrayList<Integer> sortedNumArray = new ArrayList();

              Random rand = new Random();

              

               int[] sortNumArray = setNumArray();

              //int[] sortNumArray = {0,1,2,3,5,7,9,10,12};

              int index = 0;

              int smallestNum = sortNumArray[index];

            int x;

           

            for(int j = 0; j < sortNumArray.length; j++)

            {

                     for(int i = 0; i < sortNumArray.length; i++)

                     {

                           if(sortNumArray[i] < smallestNum)

                           {

                                  smallestNum = sortNumArray[i];

                                  index= i;

                           }

                     }

                     sortNumArray[index] = 99;

                     sortedNumArray.add(smallestNum);

                    

                     do

                     {

                           x = rand.nextInt(sortNumArray.length);

                           smallestNum = sortNumArray[x];

                     }      while(sortNumArray[x] != 99);

             

            }

           

            int first = sortedNumArray.get(0);      

               int last = sortedNumArray.size();

              int target = 19;

 

 

              int targetIndex =binarySearch(sortedNumArray,first,last,target);

              

               if(targetIndex == -1)

              {

                     System.out.println("Target value "+target+" does not exist as element in array.");

              }

              else

              {

                     System.out.println("Target value "+target+" exists as element in array located at index "+targetIndex);

              }

              

               

       }

      

       public static int binarySearch(ArrayList<Integer> sortedNumArray, int first, int last, int target)

       {

             

              if(first <= last )

              {

                     int middle = (first + last)/2;

                     System.out.println(sortedNumArray);

                     if(target == sortedNumArray.get(middle))

                     {

                           return middle;

                     }

                     else if (target < sortedNumArray.get(middle))

                     {

                           return binarySearch( sortedNumArray, first,middle-1,target);

                     }

                     else

                     {

                           return binarySearch( sortedNumArray,middle+1,last,target);

       }

     }
     return -1;
   }
}

 

 


