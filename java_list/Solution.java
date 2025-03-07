package java_list;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        // scanner.next();
        // System.out.println("n : "+n);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<n;i++){
            numbers.add(scanner.nextInt());
        }
        // printArray(numbers);
        
        int q = scanner.nextInt();
        // scanner.next();
        // System.out.println("Q : "+q);
           
        for(int i=0;i<q;i++){
            if((scanner.next()).equals("Insert")){
                // print("Es insert");
                int index = scanner.nextInt();
                // print("index: "+index );
                int num = scanner.nextInt();
                // print("num: "+num );
                numbers = insert(index,num,numbers);
                // print("result : "+numbers);
            }else{
                // print("Es Delete");
                int ind = scanner.nextInt();
                numbers.remove(ind);
                // print("result : "+numbers);
            }
        }
        printArray(numbers);
        scanner.close();
        
    }
    public static ArrayList<Integer> insert(int index, int num, ArrayList<Integer> list){
        // print("1");
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, (index)));
        ArrayList<Integer> right = new ArrayList<>(list.subList(index,list.size()));
        // print("2");
        
        left.add(num);
        // print("3");
        
        left.addAll(right);
        // print("4");
        
        return left;
    }
    public static void printList(int[] list){
        String msj = "";
        for(int i =0;i<list.length;i++){
            msj += list[i]+", ";
        }
        print(msj);
    }
    public static void printArray(ArrayList<Integer> list){
        String msj = "";
        for(int i =0;i<list.size();i++){
            msj += list.get(i)+" ";
        }
        print(msj);
    }
    public static void print(Object o){
        System.out.println(o);
    }
    
}