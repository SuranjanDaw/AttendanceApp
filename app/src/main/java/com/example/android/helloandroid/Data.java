package com.example.android.helloandroid;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class  Data {
    static String dateString="";
    static timeKeeper[] timeMon ;
    static timeKeeper[] timeTue ;
    static timeKeeper[] timeWed ;
    static timeKeeper[] timeThus ;
    static timeKeeper[] timeFri ;
    static timeKeeper[] timeSun ;
    static timeKeeper[] timeSat ;
    static timeKeeper hmts_ = new timeKeeper();
    static timeKeeper math_ = new timeKeeper();
    static timeKeeper phy_ = new timeKeeper();
    static timeKeeper chem_ = new timeKeeper();
    static timeKeeper csen_ = new timeKeeper();
    static timeKeeper info1_ = new timeKeeper();
    static timeKeeper info2_ = new timeKeeper();
    static timeKeeper csenLab_ = new timeKeeper();
    static timeKeeper phyLab_ = new timeKeeper();
    static timeKeeper mathLab_ = new timeKeeper();
    static timeKeeper infoLab_ = new timeKeeper();
    public Data(){
        timeMon = new timeKeeper[]{csenLab_,chem_,hmts_,math_,phyLab_};
        timeTue = new timeKeeper[]{info2_,hmts_,phy_,info1_,csen_};
        timeWed = new timeKeeper[]{info2_,math_,phy_,infoLab_};
        timeThus = new timeKeeper[]{info1_,chem_,csen_,phy_,info2_};
        timeFri = new timeKeeper[]{math_,chem_,csen_,phy_,mathLab_};
    }
    public void monday() {
        timeMon[0].start = getTimeInMilis("9", "00");
        timeMon[0].end = getTimeInMilis("11", "45");
        timeMon[0].subjectName = "CSEN2011";
        timeMon[0].id1 = R.id.csenLab1;
        timeMon[0].id2 = R.id.csenLab2;
        timeMon[0].id3 = R.id.csenLab3;
        timeMon[1].start = getTimeInMilis("12", "25");
        timeMon[1].end = getTimeInMilis("13", "20");
        timeMon[1].subjectName = "CHEM2001";
        timeMon[1].id1 = R.id.chem1;
        timeMon[1].id2 = R.id.chem2;
        timeMon[1].id3 = R.id.chem3;
        timeMon[2].start = getTimeInMilis("13", "20");
        timeMon[2].end = getTimeInMilis("14", "15");
        timeMon[2].subjectName = "HMTS2001";
        timeMon[2].id1 = R.id.hmts1;
        timeMon[2].id2 = R.id.hmts2;
        timeMon[2].id3 = R.id.hmts3;
        timeMon[3].start = getTimeInMilis("14", "15");
        timeMon[3].end = getTimeInMilis("15", "10");
        timeMon[3].subjectName = "MATH2002";
        timeMon[3].id1 = R.id.math1;
        timeMon[3].id2 = R.id.math2;
        timeMon[3].id3 = R.id.math3;
        timeMon[4].start = getTimeInMilis("15", "10");
        timeMon[4].end = getTimeInMilis("17", "55");
        timeMon[4].subjectName = "PHYS-LAB";
        timeMon[4].id1 = R.id.phy1;
        timeMon[4].id2 = R.id.phy2;
        timeMon[4].id3 = R.id.phy3;
    }
    public void tuesday(){
        timeTue[0].start = getTimeInMilis("9","00");
        timeTue[0].end = getTimeInMilis("9","55");
        timeTue[0].subjectName = "INFO2102";
        timeTue[0].id1 = R.id.info_1;
        timeTue[0].id2= R.id.info_2;
        timeTue[0].id3=R.id.info_3;
        timeTue[1].start = getTimeInMilis("9","55");
        timeTue[1].end = getTimeInMilis("10","50");
        timeTue[1].subjectName="HMTS2001";
        timeTue[1].id1 = R.id.hmts1;
        timeTue[1].id2= R.id.hmts2;
        timeTue[1].id3=R.id.hmts3;
        timeTue[2].start = getTimeInMilis("10","50");
        timeTue[2].end = getTimeInMilis("11","45");
        timeTue[2].subjectName="PHYS2001";
        timeTue[2].id1 = R.id.phy1;
        timeTue[2].id2= R.id.phy2;
        timeTue[2].id3=R.id.phy3;
        timeTue[3].start = getTimeInMilis("13","20");
        timeTue[3].end = getTimeInMilis("14","15");
        timeTue[3].subjectName="INFO2101";
        timeTue[3].id1 = R.id.info1;
        timeTue[3].id2= R.id.info2;
        timeTue[3].id3=R.id.info3;
        timeTue[4].start = getTimeInMilis("14","15");
        timeTue[4].end = getTimeInMilis("15","10");
        timeTue[4].subjectName="CSEN2001";
        timeTue[4].id1 = R.id.csen1;
        timeTue[4].id2= R.id.csen2;
    }
    public void wednesday(){
        Log.d("myTag","ReadWEd");
        timeWed[0].start = getTimeInMilis("9","00");
        timeWed[0].end = getTimeInMilis("9","55");
        timeWed[0].subjectName = "INFO2102";
        timeWed[0].id1 = R.id.info_1;
        timeWed[0].id2= R.id.info_2;
        timeWed[0].id3=R.id.info_3;
        timeWed[1].start = getTimeInMilis("9","55");
        timeWed[1].end = getTimeInMilis("10","50");
        timeWed[1].subjectName="MATH2002";
        timeWed[1].id1 = R.id.math1;
        timeWed[1].id2= R.id.math2;
        timeWed[1].id3=R.id.math3;
        timeWed[2].start = getTimeInMilis("10","50");
        timeWed[2].end = getTimeInMilis("11","45");
        timeWed[2].subjectName="PHYS2001";
        timeWed[2].id1 = R.id.phy1;
        timeWed[2].id2= R.id.phy2;
        timeWed[2].id3=R.id.phy3;
        timeWed[3].start = getTimeInMilis("12","25");
        timeWed[3].end = getTimeInMilis("15","10");
        timeWed[3].subjectName="INFO2112";
        timeWed[3].id1 = R.id.infoLab1;
        timeWed[3].id2= R.id.infoLab2;
        timeWed[3].id3=R.id.infoLab3;
    }
    public void thusrsday() {
        timeThus[0].start = getTimeInMilis("9","00");
        timeThus[0].end = getTimeInMilis("10","50");
        timeThus[0].subjectName = "INFO2101";
        timeThus[0].id1 = R.id.info1;
        timeThus[0].id2= R.id.info2;
        timeThus[0].id3=R.id.info3;
        timeThus[1].start = getTimeInMilis("10","50");
        timeThus[1].end = getTimeInMilis("11","45");
        timeThus[1].subjectName="CHEM2001";
        timeThus[1].id1 = R.id.chem1;
        timeThus[1].id2= R.id.chem2;
        timeThus[1].id3=R.id.chem3;
        timeThus[2].start = getTimeInMilis("12","25");
        timeThus[2].end = getTimeInMilis("14","15");
        timeThus[2].subjectName="CSEN2001";
        timeThus[2].id1 = R.id.csen1;
        timeThus[2].id2= R.id.csen2;
        timeThus[2].id3=R.id.csen3;
        timeThus[3].start = getTimeInMilis("14","15");
        timeThus[3].end = getTimeInMilis("15","10");
        timeThus[3].subjectName="PHYS2001";
        timeThus[3].id1 = R.id.phy1;
        timeThus[3].id2= R.id.phy2;
        timeThus[3].id3=R.id.phy3;
        timeThus[4].start = getTimeInMilis("15","10");
        timeThus[4].end = getTimeInMilis("16","05");
        timeThus[4].subjectName="INFO2102";
        timeThus[4].id1 = R.id.info_1;
        timeThus[4].id2= R.id.info_2;
        timeThus[4].id3=R.id.info_3;
    }
    public void friday() {
        timeFri[0].start = getTimeInMilis("9","00");
        timeFri[0].end = getTimeInMilis("9","55");
        timeFri[0].subjectName = "MATH2002";
        timeFri[0].id1 = R.id.math1;
        timeFri[0].id2= R.id.math2;
        timeFri[0].id3=R.id.math3;
        timeFri[1].start = getTimeInMilis("9","55");
        timeFri[1].end = getTimeInMilis("10","50");
        timeFri[1].subjectName="CHEM2001";
        timeFri[1].id1 = R.id.chem1;
        timeFri[1].id2= R.id.chem2;
        timeFri[1].id3=R.id.chem3;
        timeFri[2].start = getTimeInMilis("10","50");
        timeFri[2].end = getTimeInMilis("11","45");
        timeFri[2].subjectName="CSEN2001";
        timeFri[2].id1 = R.id.csen1;
        timeFri[2].id2= R.id.csen2;
        timeFri[2].id3=R.id.csen3;
        timeFri[3].start = getTimeInMilis("12","25");
        timeFri[3].end = getTimeInMilis("13","20");
        timeFri[3].subjectName="PHYS2011";
        timeFri[3].id1 = R.id.phy1;
        timeFri[3].id2= R.id.phy2;
        timeFri[3].id3=R.id.phy3;
        timeFri[4].start = getTimeInMilis("15","10");
        timeFri[4].end = getTimeInMilis("17","00");
        timeFri[4].subjectName="MATH2012";
        timeFri[4].id1 = R.id.mathLab1;
        timeFri[4].id2= R.id.mathLab2;
        timeFri[4].id3=R.id.mathLab3;

    }
    static  long getTimeInMilis(String hr, String min){
        Calendar c = Calendar.getInstance();
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            dateString =c.get(Calendar.DATE)+"-"+(int)(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR)+" "+hr+":"+min+":00";
            Date date = sdf.parse(dateString);
            c.setTime(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return c.getTimeInMillis();
    }
}
