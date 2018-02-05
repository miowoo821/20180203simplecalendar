package com.example.mio.a20180203simplecalendar;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by mio on 2018/2/3.
 */

public class Calendar_Helper {
    private myviewpageradapter mAdapter;
    private List calendar_baseadapterList=new ArrayList<>();
    int feb_days;//2月天數
    int DAY_2000_1_1 = 5;//1999/12/31是星期五
    int day_after_2000_1_1=0;
    Calendar calendar;
    int start_Day_of_the_week;//該月份的第一天是星期幾
    int Days_After_2000_1_1;//從2000/1/1開始之後過了幾天
    int[] MONTH_LENGTH_LIST ={ 31, feb_days, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int year;
    int month;
    int day;
    int whatDay = start_Day_of_the_week+1;//求輸入的該年月的一號是星期幾
    int textDateCount = 1 + whatDay;//星期幾+1=>(甚麼意思?)=>解：因為禮拜整除=0，所以+1把範圍從0~6變成1~7
    int textDateCountLast = whatDay;//設為禮拜幾的前面幾格
///-----------
    //ArrayList<String> datalist=new ArrayList<>();
///-----------


    public Calendar_Helper(ViewPager vp, Context context,ArrayList mylist){
        LayoutInflater inflater = LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.test,null);

        mAdapter = new myviewpageradapter();
        calendar=new GregorianCalendar();
        year=calendar.get(Calendar.YEAR) ;
        month=calendar.get(Calendar.MONTH)+1 ;//0~11補正1~12
        day=calendar.get(Calendar.DAY_OF_MONTH) ;

        start_Day_of_the_week=get_Day_of_the_week(year,month,day);//設為輸入的該年月的一號是星期幾
        Days_After_2000_1_1=get_Days_After_2000_1_1(year,month,day);//設為輸入的年月日是從2000/1/1開始之後過了幾天






        if(month==1)//如果輸入的月份是1月
        {
            for (int i = MONTH_LENGTH_LIST[11]; 1 > 0; i--)//令i等於12月的天數，然後無窮迴圈到執行break
            {
                String data;
                data=String.valueOf(i);
                mylist.add(data);

                if (textDateCountLast > 0)//迴圈跑出有幾個上個月的天數(透過本月1號是星期幾來找出)。不能大於本月的起始星期
                {
                    String foo = "day_" + textDateCountLast;
                    Log.d("MyLog", "使用ID為" + foo);
                    int resID = context.getResources().getIdentifier(foo, "id", context.getPackageName());
                    Log.d("MyLog", "使用ID為" + resID);

                    TextView someDateText = (TextView) view.findViewById(resID);
                    TextView tv1;

                    // someDateText.setText(Integer.toString(i));//日期設定為12月的第i天(31、30、29、28、27...

                    Log.d("MyLog", "使用TextView為" +someDateText);

                    Log.d("MyLog", "使用I為" +i);
                    someDateText.setText(String.valueOf(31));//日期設定為12月的第i天(31、30、29、28、27...

                    textDateCountLast--;//每執行一次就-1，最後一個執行的是本星期的起始點
                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            for (int i = MONTH_LENGTH_LIST[month - 2]; 1 > 0; i--)//如果輸入的月份不是1月，則跑一個上個月的迴圈(二月跑一月，三月跑二月)
            {
                String data;
                data=String.valueOf(i);
                mylist.add(data);

                Log.d( "MyLog" , "第" + (i + 1) + "条数据");
                if (textDateCountLast > 0)
                {
                    String foo = "day_" + textDateCountLast+"_0";
                    Log.d("MyLog", "使用ID為" + foo);
                    int resID = context.getResources().getIdentifier(foo, "id", context.getPackageName());
                    TextView someDateText = (TextView) view.findViewById(resID);
                    someDateText.setText(Integer.toString(i));
                    textDateCountLast--;
                }
                else
                {
                    break;
                }
            }
        }

        //步驟一，設定當月的日期(步驟一跟二對調)
        for(int i=1; i<=MONTH_LENGTH_LIST[month-1]; ++i)//抓出陣列裡面對應的月份(從0開始所以要-1)，接著從1號開始迴圈到該月份的最後一天
        {
            String data;
            data=String.valueOf(i);
            mylist.add(data);

            String foo = "day_" + textDateCount;//設定一個字串(起始日的星期幾)=DateText+星期幾
            Log.d( "MyLog" , "使用ID為"+foo);
            int resID = context.getResources().getIdentifier(foo , "id" ,context.getPackageName());
            TextView someDateText = (TextView) view.findViewById(resID);//找到TextView
            someDateText.setText(Integer.toString(i));//設定TextView
            Log.d( "來猜第二次吧" , "使用ID為"+day);
            Log.d( "來猜第二次吧" , "使用ID為"+day);
            if(i==day){
                someDateText.setTextColor(0xffff0000);
            }
            textDateCount++;//往下一個DAY
        }
//步驟三：設定下個月日期(最初幾天)
        //(刪)設定下個月的日期，12月會有問題
        //(刪)int i = whatDay + MONTH_LENGTH_LIST[monthGot-1]+1;
        //(刪)Log.d( "MyLog" , "下個月的開始dateBlock編號為"+i);
        // (刪)在12月設定下個月的日期時會有問題，所以要把12月的情況特地挑出來寫
        //(刪) 會發生的問題是....?
        int newMonthDate = 1;
        for(int i = whatDay + MONTH_LENGTH_LIST[month-1]+1; i<=42; ++i){
            // MONTH_LENGTH_LIST[monthGot-1]這個是陣列裡面第X個月，由於陣列從0開始，所以要求自己的月份要-1
            // /本月起始日的星期+本月天數，最後再+1=42格裡面剩下幾個是下個月初的格子
            //i的起始值為本月月初是星期幾，加上本月天數可算出本月結束是星期幾，

            //-------------
            String data;
            data=String.valueOf(newMonthDate);
            mylist.add(data);
            //-------------


            String foo = "day_" + i+"_0";
            Log.d( "MyLog" , "使用ID為"+foo);
            int resID = context.getResources().getIdentifier(foo , "id" , context.getPackageName());
            TextView someDateText = (TextView) view.findViewById(resID);
            //Log.d( "MyLog" , "someDateText======"+someDateText);
            someDateText.setText(Integer.toString(newMonthDate));
            newMonthDate++;
            Log.d( "MyLog" , "newMonthDate==============="+newMonthDate);
            Log.d( "MyLog" , "someDateText==============="+someDateText.getText());
        }

//        for (int i = 0; i < 3; i++) {
//            GridView gridView = new GridView(this);
//            calendar_baseadapter adapter = new calendar_baseadapter(dataList, i,MainActivity.this);
////            gridView.setNumColumns(7);//一星期有七天
////            gridView.setAdapter(adapter);
//             gridList.add(gridView);
//
//        }

       // calendar_baseadapter adapter = new calendar_baseadapter(mylist);//要記得塞東西進去，不然就是空的 (如何塞呢
        ListView lv_calendar=new ListView(context);

        //Log.d( "MyLdsdssdog" ,"mAdapter================"+String.valueOf(mAdapter));
        //要把adapter用一個list裝起來丟到mAdapter的add裡面去(那邊的方法需求類型是list,我訂的)

        //lv_calendar.setAdapter(mylist);

        calendar_baseadapterList.add(mylist);//這邊要加元素類型是view的list後面才能用
       // Log.d( "MyLog" , "adapter==============="+adapter);
        mAdapter.add(calendar_baseadapterList);
        mAdapter.add(calendar_baseadapterList);



        vp.setAdapter(mAdapter);

    }


    public int get_Day_of_the_week(int year,int month,int day){//求某日期是星期幾

        for (int i = 2000; i < year ; i++) {//迴圈次數等於參數的年距離2000年有幾年，進而求出要加幾天
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {//判斷這一年要不要潤
                DAY_2000_1_1 = (DAY_2000_1_1 + 366) % 7;//潤的話這年就是+366天，接著取7餘數判斷出是星期幾
            } else {
                DAY_2000_1_1 = (DAY_2000_1_1 + 365) % 7;////不潤的話這年就是+365天，接著取7餘數判斷出是星期幾
            }
            //每次回圈決定下一年的  是星期幾
        }
        int Day_of_the_week=(DAY_2000_1_1)%7;
        Log.d("GFDHDFGHGJGH",String.valueOf(Day_of_the_week));
        return Day_of_the_week;
    }

    public int get_Days_After_2000_1_1(int year,int month,int day){//求某日期是第幾周
        int week;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//求那年的二月有幾天
            feb_days = 29;

        } else {
            feb_days = 28;

        }

        //int[] space ={0, first_space, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int i = 2000; i < year; i++)//得到年分
        {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                day_after_2000_1_1 += 366;
            } else {
                day_after_2000_1_1 += 365;
            }
        }

        for(int i=0; i<month-1; i++){//得到月份的開頭
            day_after_2000_1_1 += MONTH_LENGTH_LIST[i];
        }

//        if((month)==1)
//        {
//            Log.d( "SetDayLog" , "在"+(year-1)+"年"+(12)+"月底時，過了"+day_after_2000_1_1+"天");
//        }
//        else
//        {
//            Log.d("SetDayLog", "在" + year + "年" + (month) + "月底時，過了" + day_after_2000_1_1 + "天");
//        }
//        day_after_2000_1_1= day_after_2000_1_1 % 365;
//        day_after_2000_1_1=day_after_2000_1_1 /7;
        week=day_after_2000_1_1;
        return week;
    }


}
