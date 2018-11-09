package com.company;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {


        {
            Scanner sf = new Scanner(new File("imports.txt"));

            System.out.println(sf);
            int maxIndx = -1; //-1 so when we increment below, first indx is 0
            String text[] = new String[1000]; //to be safe, declare plenty

            while (sf.hasNext()) {
                maxIndx++;
                text[maxIndx] = sf.nextLine();
            }
            System.out.println(text[1]);

        }
    }
}


