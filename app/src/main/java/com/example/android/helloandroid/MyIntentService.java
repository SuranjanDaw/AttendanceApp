package com.example.android.helloandroid;

import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import java.util.Calendar;

public class MyIntentService extends IntentService {

    int i = 0;
    private static final int NOTIFICATION_ID = 3;
    Data d= new Data();


    public MyIntentService() {
        super("MyNewIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //weekFinder();

        timeKeeper timeDay[] = weekFinder();
        Log.d("myTag", "IntentService"+System.currentTimeMillis()+","+i+timeDay[i].start+","+timeDay[i].end);
        for(i=0 ;i< timeDay.length; i++)
            if(System.currentTimeMillis() >= timeDay[i].start && System.currentTimeMillis() <= timeDay[i].end) {
                //Log.d("myTag", "IntentServiceIN"+System.currentTimeMillis()+","+i);
                //Log.d("myTag",i+"*");
                        //Intent of the class that have the layout is created below
                Intent intent1 = new Intent(this, Count.class);
                Intent intent2 = new Intent(this, Count.class);
                Intent noActionIntent = new Intent(this, Count.class);
                //Log.d("myTag",i+"**");
                intent1.putExtra(Intent.EXTRA_TEXT, "TRUE");
                intent1.putExtra("ID", NOTIFICATION_ID);
                intent1.putExtra("obj",timeDay);
                intent2.putExtra(Intent.EXTRA_TEXT, "FALSE");
                intent2.putExtra("ID", NOTIFICATION_ID);
                intent2.putExtra("obj",timeDay);
                noActionIntent.putExtra(Intent.EXTRA_TEXT,"NO ACTION");
                noActionIntent.putExtra("ID",NOTIFICATION_ID);
                noActionIntent.putExtra("SerializedObj",timeDay);
                //Log.d("myTag",i+"***");
                //Different request codes are used in PendingIntent to send different values to activitis that is getting triggered
                // by the notification buttons.

                PendingIntent pi0= PendingIntent.getActivity(this, 0, noActionIntent, PendingIntent.FLAG_UPDATE_CURRENT);
                PendingIntent pi = PendingIntent.getActivity(this, 1, intent1, PendingIntent.FLAG_UPDATE_CURRENT);
                PendingIntent pi2 = PendingIntent.getActivity(this, 2, intent2, PendingIntent.FLAG_UPDATE_CURRENT);
                //Log.d("myTag",i+"****");
                //Notification is created below

                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "abc");
                mBuilder.setSmallIcon(R.drawable.lecture_icon);
                mBuilder.setContentTitle("HERITAGE INSTITUTE OF TECHNOLOGY");
                mBuilder.setContentText("ARE YOU ATTENDING THE "+timeDay[i].subjectName+" CLASS ?");
                mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
                mBuilder.addAction(R.drawable.ic_check_black_24dp, "YES", pi);
                mBuilder.addAction(R.drawable.ic_clear_black_24dp, "NO", pi2);
                mBuilder.addAction(R.drawable.lecture_icon,"CLASS CANCELLED",pi0);
                mBuilder.setAutoCancel(true);
                mBuilder.setOngoing(true);
                mBuilder.setDefaults(Notification.DEFAULT_SOUND);
                //Log.d("myTag",i+"5*");
                //Notification is displayed using the code below
                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
                notificationManager.notify(NOTIFICATION_ID, mBuilder.build());
                //i++;
                break;
            }
        //}
    }
    private timeKeeper[] weekFinder(){
        Calendar c = Calendar.getInstance();
        Log.d("myTag","week"+c.get(Calendar.DAY_OF_WEEK));
        switch (c.get(Calendar.DAY_OF_WEEK)){
            case 2:
                Log.d("myTag","Monday");
                d.monday();
                return  d.timeMon;
            case 3:
                d.tuesday();
                return d.timeTue;
            case 4:
                d.wednesday();
                return d.timeWed;
            case 5:
                d.thusrsday();
                return d.timeThus;
            case 6:
                d.friday();
                return d.timeFri;
            case 1:
                return d.timeSun;
            case 7:
                return d.timeSat;
            default:
                return null;
                //Log.d("myTag","Monday"+c.get(Calendar.DAY_OF_WEEK));
        }

    }

}
