package com.company;

public class Array_tut {
    public static void main(String[] args) {

        /*//Exercise 1
        float [] marks ={89.89f, 79.88f,69.49f,47.88f,100.0f};
        float sum =0;
        for (float total:marks) {
            sum = sum + total;
        }
        System.out.println("The sum if Array is:-   "+sum);*/


        //Exercise 2
        /*float [] marks ={89.89f, 79.88f,69.49f,47.88f,100.0f};
        float num =79.88f;
        boolean isinarray = false;
        for (float jdk:marks) {
            if (jdk == num){
                isinarray = true;
                break;
            }
        }
        if (isinarray == true){
            System.out.println("Entered Number is in the Array!");
        }
        else{
            System.out.println("Entered Number is not in the Array");
        }*/


        // Exercise 3

        /*float [] marks ={89.89f, 79.88f,69.49f,47.88f,100.0f};
        float sum =0;
        for (float total:marks) {
            sum = sum + total;
        }
        System.out.println("Average Marks of Physics Are:-   "+sum/marks.length); */

        //Exercise 4

        /*int [][] mat1 ={{1,2,3},
                        {4,5,6}};
        int [][] mat2 ={{6,7,8},
                        {9,10,11}};
        int [][] sum = {{0,0,0},
                        {0,0,0}};

        for (int  i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d j=%d ",i,j);
                sum [i][j] = mat1[i][j]+mat2[i][j];
                System.out.print("\n");
            }

        }


        for (int  i=0;i< mat1.length;i++){
            for (int j=0;j<mat1[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        } */

        //Exercise 5

        /*int [] array = {12,22,34,49,55,66};
        int l = array.length;
        int n=Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n ; i++){
            temp = array[i];
            array[i]=array[l-i-1];
            array[l-i-1]=temp;
        }

        for (int element:array) {
            System.out.println(element);
            
        }*/

        //Exercise 6

        /*int [] array = {12,22,34,89,55,66};
        int max = 0;
        for (int e:array){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum Number from this Array is:"+max); */

        //Exercise 7

        /*int [] array = {12,22,34,-89,55,66};
        int min = Integer.MAX_VALUE;
        for (int e:array){
            if(e<min) {
                min = e;
            }
        }
        System.out.println("The minimum Number from this Array is:"+min);  */

        //Exercise 8

        /*boolean IsSorted = true;
        int [] array = {1,226,36,40,5};
        for (int i = 0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                IsSorted = false;
                break;
            }
        }
            if(IsSorted == true){
                System.out.println("Array is sorted");
            }
            else{
                System.out.println("Array is not Sorted");
            }  */
    }
}
