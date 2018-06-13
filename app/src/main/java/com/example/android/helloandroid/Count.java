package com.example.android.helloandroid;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.widget.TextView;
import android.os.Handler;
public class Count extends MainActivity{
    static double percentage=0;
    private static int NOTIFICATION_ID=0;
    Data d= new Data();
    timeKeeper nowSubject = new timeKeeper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_layout);
        updateAttendance();
    }
    void updateAttendance(){
        //The three TextView are configured and the notification id is updated to original value
        //to hold the desired value.

        TextView t1,t2,t3;
        Intent intent = getIntent();
        //this gets the EXTRA_TEXT AND NOTIFICATION_ID from the MyIntentService.java class
        // in the pre-defined String variable Extra_TEXT and the ID in NOTIFICATION_ID
        NOTIFICATION_ID = getIntent().getIntExtra("ID",0);//obtained to close the notification after ActionButton is clicked.
        //The user's choice for being Present ie. YES or Not present ie. NO; is being determined and
        //accordingly the number of days present and the total no. of days are updated
        String check = intent.getStringExtra(Intent.EXTRA_TEXT);
        nowSubject = (timeKeeper) getIntent().getSerializableExtra("SerializedObj");
        if(check.compareTo("TRUE")==0){
            nowSubject.dayPresent++;
            nowSubject.dayTotal++;
        }
        else if(check.compareTo("FALSE")==0) {
            nowSubject.dayTotal++;
        }
        Log.d("myTag","nitify+"+nowSubject.dayPresent+"/"+nowSubject.dayTotal);
        Log.d("myTag",""+nowSubject.id1);
        t1 = (TextView) findViewById(nowSubject.id1);
        t1.setText(""+(int)nowSubject.dayPresent);
        t2 = (TextView) findViewById(nowSubject.id2);
        t2.setText(""+(int)nowSubject.dayTotal);
        t3 = (TextView) findViewById(nowSubject.id3);

        nowSubject.percentage = (nowSubject.dayPresent/nowSubject.dayTotal)*100;
        if(nowSubject.dayTotal != 0)
            t3.setText(""+nowSubject.percentage);
        else
            t3.setText(""+0);

        //the notification must be closed after the action button is clicked. The following code is for that purpose.
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.cancel(NOTIFICATION_ID);
        //the activity which shows different class attendances must be closed after a certain time.
        //The following code is for that purpose
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                finish();
            }
        }, 1000*5);
    }
    void showAttendance(){

    }
}
