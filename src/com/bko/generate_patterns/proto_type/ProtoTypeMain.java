package com.bko.generate_patterns.proto_type;

/**
 * Created by bko on 4/4/15.
 */
public class ProtoTypeMain {
    public static void main(){
        Teacher teacher = new Teacher();
        Paper[] papers = teacher.createManyCrystals();

        for(int i=0; i < papers.length; i++){
            papers[i].printName();
        }
    }
}
