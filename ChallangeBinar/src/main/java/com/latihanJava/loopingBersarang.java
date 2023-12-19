package com.latihanJava;

public class loopingBersarang {
    public static void main(String[] args){
        for (int i = 4; i>=0;i--){
            for (int j=0;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i= 0; i<=4;i++){
            for (int j=0;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        System.out.println();

//        for (int =)

        System.out.println();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ( (i+j) > 12){
                    break;
                }
                else if ( (j >= 4) && (j-i) > 4){
                    break;
                }
                else if ( (j <= 4) && (i+j) < 4){
                    System.out.print("  ");
                    continue;
                }
                else if ( (i >= 4) && (i-j) > 4){
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
