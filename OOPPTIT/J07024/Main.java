package J07024;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1");
        WordSet s2 = new WordSet("DATA2");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}