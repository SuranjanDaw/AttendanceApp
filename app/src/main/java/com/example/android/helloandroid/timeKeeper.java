package com.example.android.helloandroid;

import java.io.Serializable;

public class timeKeeper implements Serializable {
    long start=0;
    long end= 0;
    String subjectName="";
    static double dayPresent=0;
    static double dayTotal=0;
    static  double percentage=0;
    int id1=0;
    int id2=0;
    int id3=0;
    timeKeeper(){
        this.start = 0;
        this.end = 0;
    }
}
