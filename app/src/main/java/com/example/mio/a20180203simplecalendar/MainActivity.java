package com.example.mio.a20180203simplecalendar;

import android.database.Cursor;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {
    calendar_baseadapter calendar_baseadapter;
    ArrayList mylist;
    Calendar_Helper CH;
    ViewPager vp;
    myviewpageradapter myviewpageradapter;
    Calendar calendar;

    int year;
    int month;
    int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=1; i<=42; ++i) {

            String dateTextViewText = someDateText.getText().toString();







        calendar_baseadapter =new calendar_baseadapter(vp,MainActivity.this,mylist);


        vp=(ViewPager)findViewById(R.id.viewpager001);
        myviewpageradapter=new myviewpageradapter();
        vp.setAdapter(myviewpageradapter);

     //   CH=new Calendar_Helper(vp,MainActivity.this);
        calendar=new GregorianCalendar();
        year=calendar.get(Calendar.YEAR) ;
        month=calendar.get(Calendar.MONTH)+1 ;//0~11補正1~12
        day=calendar.get(Calendar.DAY_OF_MONTH) ;
    }

    public void checkDatabaseNotes(){
        //先run過所有日期
        for(int i=1; i<=42; ++i) {
//----------設定一個字串變數內容為DateText+i(要拿來找ID用的)，名字叫做dateTextViewID
            String dateTextViewID = "day_" + Integer.toString(i)+"_0";
//----------設一個int變數，內容為R.id.剛剛那個變數的id(用來findviewbyid物件)
            int resID = getResources().getIdentifier(dateTextViewID, "id", getPackageName());
//----------用來findviewbyid物件
            TextView someDateText = (TextView) findViewById(resID);
//----------設一個字串變數把someDateText裡面的字串抓出來放進去dateTextViewText(找日期)
            String dateTextViewText = someDateText.getText().toString();
            if(Integer.valueOf(dateTextViewText)<10){
                dateTextViewText=0+dateTextViewText;
            }
            Log.d("dateTextViewText", "dateTextViewText===============================" + dateTextViewText);
//-----------設一個字串變數month
            String month1;
//------------↓在前七次迴圈，且日期大於20時(前面第一排有可能有上個月的東西)

            if (i <= 7 && Integer.parseInt(dateTextViewText) >= 20) {
                if(month!=1){
                    month1 = Integer.toString(month - 1);//
                }else {
                    month1 = "12";
                }
            } else if (i >= 25 && Integer.parseInt(dateTextViewText) < 15)//下個月的東西
            {
                if(month!=12) {
                    month1 = Integer.toString(month + 1);
                }else {
                    month1="1";
                }

            } else {
                month1 = Integer.toString(month);
            }
            if(Integer.valueOf(month1)<10){
                String.valueOf(month1);
                month1=0+month1;
            }

           // Cursor noteday=dao.get_activity_date(Integer.valueOf(String.valueOf(year)+String.valueOf(month1)+String.valueOf(dateTextViewText)));
           String noteday="DFGSAA";
            Log.d("dateTextViewText", "dateTextViewText===============================" + Integer.valueOf(String.valueOf(year)+String.valueOf(month1)+String.valueOf(dateTextViewText)));
            Log.d("FHHGHGHFGHHG","DFFFFDD=============="+noteday);
            if(noteday!=null){

                int noteAmount = noteday.getCount();
                int bar;
                if(noteAmount>=3)//假設超過3條note，也只有3條
                {       bar = 3;                }
                else
                {       bar = noteAmount;       }

                for(int k=1; k<=bar; ++k)//接下來開始跑note，最多只跑3條
                {
                    String useID = "day_"+Integer.toString(i)+"_"+Integer.toString(k);
                    int rID = getResources().getIdentifier(useID , "id" , getPackageName());
                    TextView noteText = (TextView) findViewById(rID);
                    noteText.setVisibility(View.VISIBLE);
                    //把noteText的view找起來,要開始迴圈填資料了

                    noteday.moveToNext();//剛剛回傳的Cursor物件(資料表)往下一筆移動，
                    Log.d("CalendarLog","得到一個Note : "+noteday.getString(1));
                    String rawString = noteday.getString(1);//用一個叫做rawString的字串變數抓這一筆的第2個欄位填進去
                    //判斷這個字串長度是不是大於四
                    if(rawString.length()>10)
                    {
                        rawString = rawString.substring(0, 10);//假設字串長度大於4就只抓從頭開始到第四個字
                    }
                    noteText.setText(rawString);//最後填入剛剛findviewbyid的noteText
                }
            }
        }
    }
}
