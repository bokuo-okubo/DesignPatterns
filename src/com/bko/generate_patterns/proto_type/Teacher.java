package com.bko.generate_patterns.proto_type;

/**
 * Created by bko on 4/5/15.
 */
public class Teacher {
    public Paper[] createManyCrystals(){
        Paper prototype = new Paper("雪の結晶");

        drawCrystal(prototype);
        cutAccordanceWithLine(prototype);

        Paper[] papers = new Paper[100];

        for(int n=0; n < papers.length; n++){
            papers[n] = (Paper)prototype.createClone();
        }
        return papers;
    }

    private void drawCrystal(Paper paper){

    }

    private void cutAccordanceWithLine(Paper paper){
        //書かれた線にそって綺麗に切るには時間がかかる
    }
}

