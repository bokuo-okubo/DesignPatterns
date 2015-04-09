package com.bko.structure_patterns.facade;

/**
 * Created by bko on 4/9/15.
 */
public class Librarian {
    public String searchBook(String bookName){
        BookList bookList = new BookList();
        String location = bookList.seachBook(bookName);

        if(location != null){
            LendingList lendingList = new LendingList();

            if(lendingList.check(bookName)){
                return "貸出中です";
            }else {
                return location;
            }
        } else {
            return "そのほんは所蔵していません";
        }
    }

}
