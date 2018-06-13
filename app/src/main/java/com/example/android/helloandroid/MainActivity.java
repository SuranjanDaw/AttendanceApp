package com.example.android.helloandroid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Context;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    /*static double dayPresent=0;
    static double dayTotal=0;
    String dateString="";*/
    int  NOTIFICATION_REMINDER_NIGHT =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendNotification(View view){

        Calendar calendar= Calendar.getInstance();
        //The try{}catch block below assings the required time to calendar class object which is then
        //used to create intent and trigger the AlarmManager object at the particular time specified using the
        //dateString variable below.
        Intent notifyIntent = new Intent(this,MyReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, NOTIFICATION_REMINDER_NIGHT, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),1000*60*30, pendingIntent);
        Log.d("myTag",System.currentTimeMillis()+"");
    }
    public void viewStats(View view) {
        Intent notifyIntent = new Intent(this, Count.class);
        startActivity(notifyIntent);
    }
}
