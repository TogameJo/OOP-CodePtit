/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07072;
import java.util.*;
import java.io.*;
/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        File x = new File("DANHSACH.in");
        Scanner sc = new Scanner(x);
        ArrayList<DANHSACH> ds = new ArrayList<>();
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            ds.add(new DANHSACH(name));
        }
        Collections.sort(ds);
        for(DANHSACH res : ds){
            System.out.println(res);
        }
    }
}
