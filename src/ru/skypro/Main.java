package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Task 1
        int[] intArray = {1,2,3};
        double[] dblArray = {1.57,7.654,9.986};
        int[] rndArray = new int[30];
        for(int i=0;i<rndArray.length;i++){
            rndArray[i]=i;
        }
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        System.out.println("out_data_intArray");
        int i_intArr=0;
        while(i_intArr<intArray.length){
//            System.out.print(intArray[i_intArr] +","); //out_with_excess_comma
            System.out.print(intArray[i_intArr]);
            if(i_intArr<intArray.length-1) {             //out_without_excess_comma
                System.out.print(",");                   //out_without_excess_comma
            }
            i_intArr++;
        }
        System.out.println();

        System.out.println("out_data_dblArray");
        int i_dblArray=0;
        while(i_dblArray<dblArray.length){
            System.out.print(dblArray[i_dblArray]);
            if(i_dblArray<dblArray.length-1){
                System.out.print(",");
            }
            i_dblArray++;
        }
        System.out.println();

        System.out.println("out_data_rndArray");
        for(int i=0;i<rndArray.length;i++){
            System.out.print(rndArray[i]);
            if(i<rndArray.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        System.out.println("out_data_intArray_b.o.");
        for(i_intArr=intArray.length-1;i_intArr>=0;i_intArr--){
            System.out.print(intArray[i_intArr]);
            if(i_intArr!=0){
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("out_data_dblArray_b.o.");
        for(i_dblArray=dblArray.length-1;i_dblArray>=0;i_dblArray--){
            System.out.print(dblArray[i_dblArray]);
            if(i_dblArray!=0){
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("out_data_rndArray_b.o.");
        for(int i=rndArray.length-1;i>=0;i--) {
            System.out.print(rndArray[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println();

        //task4
        System.out.println("Task 4");
        for(int i=0;i<rndArray.length;i++){
            if(rndArray[i]%2==1){
                rndArray[i]=rndArray[i]+1;
                System.out.print(rndArray[i]);
                if(i<rndArray.length-1){
                    System.out.print(",");
                }
            }
        }
        System.out.println();


    }
}
