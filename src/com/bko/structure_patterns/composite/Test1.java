package com.bko.structure_patterns.composite;

import com.bko.structure_patterns.composite.directory_entries.Directory;
import com.bko.structure_patterns.composite.directory_entries.File;
import com.bko.structure_patterns.composite.directory_entries.SymbolicLink;

/**
 * Created by bko on 4/8/15.
 */
public class Test1 {
    public static void main(){
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");
        SymbolicLink copy_file1 = new SymbolicLink("copy_file1");

        Directory dir1 = new Directory("dir1");
        dir1.add(file1);

        Directory dir2 = new Directory("dir2");
        dir2.add(file2);
        dir2.add(file3);
        dir2.add(copy_file1);

        dir1.add(dir2);
        dir1.add(file4);

        dir1.remove();

    }
}
