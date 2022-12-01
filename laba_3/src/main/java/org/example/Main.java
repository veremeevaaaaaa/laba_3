package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String[][] table = new String[4][13];
        table[0][0]="Value table";
        table[0][1]="ArrayList.add";
        table[0][2]="LinkedList.add";
        table[0][3]="ArrayList.remove";
        table[0][4]="LinkedList.remove";
        table[0][5]="ArrayList.indexOf";
        table[0][6]="LinkedList.indexOf";
        table[0][7]="ArrayList.size";
        table[0][8]="LinkedList.size";
        table[0][9]="ArrayList.sort";
        table[0][10]="LinkedList.sort";
        table[0][11]="ArrayList.clear";
        table[0][12]="LinkedList.clear";


        for(int i=0;i<3;i++){
            ArrayList<Integer> mas = new ArrayList<>();
            LinkedList<Integer> list = new LinkedList<>();
            long timer=System.currentTimeMillis();

            table[i+1][0]=Integer.toString(1000*(5*i+1));
            for(int j=0;j<1000*(5*i+1);j++){
                mas.add((int)Math.random()*2022);
            }
            timer = System.currentTimeMillis() - timer;
            table[i+1][1] = Long.toString(timer);

            timer = System.currentTimeMillis();
            for(int j=0;j<1000*(5*i+1);j++){
                list.add((int)Math.random()*2022);
            }
            timer = System.currentTimeMillis() - timer;
            table[i+1][2] = Long.toString(timer);
            ///////////////////////////////////////////////////////
            timer = System.currentTimeMillis();
            mas.remove(154+i*15);
            timer = System.currentTimeMillis() - timer;
            table[i+1][3] = Long.toString(timer);

            timer = System.currentTimeMillis();
            list.remove(154+i*15);
            timer = System.currentTimeMillis() - timer;
            table[i+1][4] = Long.toString(timer);
            /////////////////////////////////////////////////////
            timer = System.currentTimeMillis();
            mas.indexOf(333);
            timer = System.currentTimeMillis() - timer;
            table[i+1][5] = Long.toString(timer);

            timer = System.currentTimeMillis();
            list.indexOf(333);
            timer = System.currentTimeMillis() - timer;
            table[i+1][6] = Long.toString(timer);
            ////////////////////////////////////////////////////
            timer = System.currentTimeMillis();
            mas.size();
            timer = System.currentTimeMillis() - timer;
            table[i+1][7] = Long.toString(timer);
            timer = System.currentTimeMillis();
            list.size();
            timer = System.currentTimeMillis() - timer;
            table[i+1][8] = Long.toString(timer);
            //////////////////////////////////////////////////
            timer = System.currentTimeMillis();
            Collections.sort(mas);
            timer = System.currentTimeMillis() - timer;
            table[i+1][9] = Long.toString(timer);

            timer = System.currentTimeMillis();
            Collections.sort(list);
            timer = System.currentTimeMillis() - timer;
            table[i+1][10] = Long.toString(timer);
            ////////////////////////////////////////////
            timer = System.currentTimeMillis();
            mas.clear();
            timer = System.currentTimeMillis() - timer;
            table[i+1][11] = Long.toString(timer);
            timer = System.currentTimeMillis();
            list.clear();
            timer = System.currentTimeMillis() - timer;
            table[i+1][12] = Long.toString(timer);
        }

        for (int i = 0; i < 13; i++) {
            Formatter formatter = new Formatter();
            if(i==0)System.out.println(formatter.format("%30s %10s %10s %10s", table[0][i], table[1][i], table[2][i], table[3][i]));
            else System.out.println(formatter.format("%30s %10s %10s %10s", table[0][i], table[1][i] + " ms", table[2][i] + " ms", table[3][i] + " ms"));
        }
    }
}