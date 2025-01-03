/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07040;
import java.util.*;
import java.io.*;
/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        ObjectInputStream x1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a1 = (ArrayList<String>) x1.readObject();
        ObjectInputStream x2 = new ObjectInputStream(new FileInputStream("VANBAN.in"));
        ArrayList<String> a2 = (ArrayList<String>) x2.readObject();
        HashSet<String> st1 = new HashSet<>();
        HashSet<String> st2 = new HashSet<>();
        for(String temp1 : a1){
            String[] lt = temp1.split(" ");
            for(String temp2 : lt){
                st1.add(temp2);
            }
        }
        for(String temp1 : a2){
            String[] lt = temp1.split(" ");
            for(String temp2 : lt){
                st2.add(temp2);
            }
        }
        ArrayList<String> res = new ArrayList<>();
        st2.forEach(e ->{
            if(st1.contains(e)){
                res.add(e);
            }
        });
        for(String ans : res){
            System.out.println(ans.toLowerCase());
        }       
    }
}
