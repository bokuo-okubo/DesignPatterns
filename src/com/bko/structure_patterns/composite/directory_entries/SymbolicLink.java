package com.bko.structure_patterns.composite.directory_entries;

/**
 * Created by bko on 4/8/15.
 */
public class SymbolicLink implements DirectoryEntry {
    private String name = null;

    public SymbolicLink(String name) {
        this.name = name;
    }

    @Override
    public void remove() {
        System.out.println(name + "を削除しました");
    }
}
