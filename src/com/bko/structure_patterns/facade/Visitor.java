package com.bko.structure_patterns.facade;

/**
 * Created by bko on 4/9/15.
 */
public class Visitor {
    public static void main(){
        Librarian nakamura = new Librarian();

        String location = nakamura.searchBook("昆虫図鑑");
        if(location.equals("貸出中です")){
            System.out.println("貸出中かよ…");
        }else if(location.equals("その本は所蔵していません")){
            System.out.println("なんだ、ないのか");
        }else{
            System.out.println("サンキュ！");
        }

    }
}
