import java.io.*;
class kthbitset{
    static int bitset(int n ){
        int count = 0;
        while (n !=0){
        if (n % 2 !=0)
            count++;
            n=n/2;
        }
        return count;
    }
    public static void main (String args []){
        int i = 9;
        System.out.println (bitset(i));
    }
 }