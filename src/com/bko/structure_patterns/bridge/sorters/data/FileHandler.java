package com.bko.structure_patterns.bridge.sorters.data;

import java.io.*;
import java.util.*;


/**
 * Created by bko on 4/6/15.
 */
public class FileHandler {
    private static String basePath = "/Volumes/data/dev/{LAB}/Designing/DesignPatterns/src/com/bko/structure_patterns/bridge/sorters/data/";
   private static String fileName = "sort_data.csv";


    public static Object readFile(){
        return readCSV();
    }

    private static List<List> readCSV(){
        List<List> ary = new ArrayList<>();
        try{
            String filePath = basePath + fileName;
            File csv = new File(filePath);

            BufferedReader br = new BufferedReader(new FileReader(csv));

            //最終行まで読み込む
            String line = "";
            while((line = br.readLine()) != null){
                //一行をデータの要素に分割
                StringTokenizer st = new StringTokenizer(line,",");
                List<Integer> row = new ArrayList<Integer>();
                while(st.hasMoreTokens()){
                    //一行をタブ区切りで表示
                    int num = Integer.parseInt(st.nextToken());
                    row.add(num);
                }
                System.out.println();
                ary.add(row);
            }
            br.close();
        }catch (FileNotFoundException e) {
            //fileオブジェクト生成時の例外補足
            e.printStackTrace();
        }catch (IOException e){
            //BufferedReaderおブジェクトのクローズ次の例外補足
            e.printStackTrace();

        }
        return ary;
    }
}
