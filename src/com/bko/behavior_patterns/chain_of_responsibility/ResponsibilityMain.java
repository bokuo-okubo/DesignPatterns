package com.bko.behavior_patterns.chain_of_responsibility;

import com.bko.behavior_patterns.chain_of_responsibility.Responsibles.*;

/**
 * Created by bko on 4/9/15.
 */
public class ResponsibilityMain {
    public static void main (){
        Responsible nakagawa = new Student("中川雄介");
        Responsible rookie = new ClassTeacher("新人先生");
        Responsible veteran = new ChiefTeacher("ベテラン先生");
        Responsible staffMeeting = new StaffMeeting("職員会議");
        nakagawa.setNext(rookie).setNext(veteran).setNext(staffMeeting);
        nakagawa.putQuestion(new Question("おやつはいくらまで？",new Level(1)));
        nakagawa.putQuestion(new Question("携帯電話持って行ってよい？", new Level(3)));
    }
}
