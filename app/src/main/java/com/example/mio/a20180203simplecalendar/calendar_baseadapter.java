package com.example.mio.a20180203simplecalendar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by mio on 2018/2/3.
 */

public class calendar_baseadapter extends BaseAdapter {
    Calendar_Helper CH;
    Context context;
    ArrayList<String> my_list;
    ViewPager vp;
    public calendar_baseadapter(ViewPager vp,Context context, ArrayList<String> datas){//建構式裡的兩個參數代表要新增這個物件必須要給這兩個類型的參數
        this.context=context;
        this.my_list=my_list;
        this.vp=vp;


    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            view=inflater.inflate(R.layout.test,null);
            viewHolder=new ViewHolder();


            //------------------------------------------------------

            viewHolder.tv0 = view.findViewById(R.id.day_1_0);
            viewHolder.tv1 = view.findViewById(R.id.day_1_1);
            viewHolder.tv2 = view.findViewById(R.id.day_1_2);
            viewHolder.tv3 = view.findViewById(R.id.day_1_3);
            viewHolder.tv4 = view.findViewById(R.id.day_2_0);
            viewHolder.tv5 = view.findViewById(R.id.day_2_1);
            viewHolder.tv6 = view.findViewById(R.id.day_2_2);
            viewHolder.tv7 = view.findViewById(R.id.day_2_3);
            viewHolder.tv8 = view.findViewById(R.id.day_3_0);
            viewHolder.tv9 = view.findViewById(R.id.day_3_1);
            viewHolder.tv10 = view.findViewById(R.id.day_3_2);
            viewHolder.tv11 = view.findViewById(R.id.day_3_3);
            viewHolder.tv12 = view.findViewById(R.id.day_4_0);
            viewHolder.tv13 = view.findViewById(R.id.day_4_1);
            viewHolder.tv14 = view.findViewById(R.id.day_4_2);
            viewHolder.tv15 = view.findViewById(R.id.day_4_3);
            viewHolder.tv16 = view.findViewById(R.id.day_5_0);
            viewHolder.tv17 = view.findViewById(R.id.day_5_1);
            viewHolder.tv18 = view.findViewById(R.id.day_5_2);
            viewHolder.tv19 = view.findViewById(R.id.day_5_3);
            viewHolder.tv20 = view.findViewById(R.id.day_6_0);
            viewHolder.tv21 = view.findViewById(R.id.day_6_1);
            viewHolder.tv22 = view.findViewById(R.id.day_6_2);
            viewHolder.tv23 = view.findViewById(R.id.day_6_3);
            viewHolder.tv24 = view.findViewById(R.id.day_7_0);
            viewHolder.tv25 = view.findViewById(R.id.day_7_1);
            viewHolder.tv26 = view.findViewById(R.id.day_7_2);
            viewHolder.tv27 = view.findViewById(R.id.day_7_3);
            viewHolder.tv28 = view.findViewById(R.id.day_8_0);
            viewHolder.tv29 = view.findViewById(R.id.day_8_1);
            viewHolder.tv30 = view.findViewById(R.id.day_8_2);
            viewHolder.tv31 = view.findViewById(R.id.day_8_3);
            viewHolder.tv32 = view.findViewById(R.id.day_9_0);
            viewHolder.tv33 = view.findViewById(R.id.day_9_1);
            viewHolder.tv34 = view.findViewById(R.id.day_9_2);
            viewHolder.tv35 = view.findViewById(R.id.day_9_3);
            viewHolder.tv36 = view.findViewById(R.id.day_10_0);
            viewHolder.tv37 = view.findViewById(R.id.day_10_1);
            viewHolder.tv38 = view.findViewById(R.id.day_10_2);
            viewHolder.tv39 = view.findViewById(R.id.day_10_3);
            viewHolder.tv40 = view.findViewById(R.id.day_11_0);
            viewHolder.tv41 = view.findViewById(R.id.day_11_1);
            viewHolder.tv42 = view.findViewById(R.id.day_11_2);
            viewHolder.tv43 = view.findViewById(R.id.day_11_3);
            viewHolder.tv44 = view.findViewById(R.id.day_12_0);
            viewHolder.tv45 = view.findViewById(R.id.day_12_1);
            viewHolder.tv46 = view.findViewById(R.id.day_12_2);
            viewHolder.tv47 = view.findViewById(R.id.day_12_3);
            viewHolder.tv48 = view.findViewById(R.id.day_13_0);
            viewHolder.tv49 = view.findViewById(R.id.day_13_1);
            viewHolder.tv50 = view.findViewById(R.id.day_13_2);
            viewHolder.tv51 = view.findViewById(R.id.day_13_3);
            viewHolder.tv52 = view.findViewById(R.id.day_14_0);
            viewHolder.tv53 = view.findViewById(R.id.day_14_1);
            viewHolder.tv54 = view.findViewById(R.id.day_14_2);
            viewHolder.tv55 = view.findViewById(R.id.day_14_3);
            viewHolder.tv56 = view.findViewById(R.id.day_15_0);
            viewHolder.tv57 = view.findViewById(R.id.day_15_1);
            viewHolder.tv58 = view.findViewById(R.id.day_15_2);
            viewHolder.tv59 = view.findViewById(R.id.day_15_3);
            viewHolder.tv60 = view.findViewById(R.id.day_16_0);
            viewHolder.tv61 = view.findViewById(R.id.day_16_1);
            viewHolder.tv62 = view.findViewById(R.id.day_16_2);
            viewHolder.tv63 = view.findViewById(R.id.day_16_3);
            viewHolder.tv64 = view.findViewById(R.id.day_17_0);
            viewHolder.tv65 = view.findViewById(R.id.day_17_1);
            viewHolder.tv66 = view.findViewById(R.id.day_17_2);
            viewHolder.tv67 = view.findViewById(R.id.day_17_3);
            viewHolder.tv68 = view.findViewById(R.id.day_18_0);
            viewHolder.tv69 = view.findViewById(R.id.day_18_1);
            viewHolder.tv70 = view.findViewById(R.id.day_18_2);
            viewHolder.tv71 = view.findViewById(R.id.day_18_3);
            viewHolder.tv72 = view.findViewById(R.id.day_19_0);
            viewHolder.tv73 = view.findViewById(R.id.day_19_1);
            viewHolder.tv74 = view.findViewById(R.id.day_19_2);
            viewHolder.tv75 = view.findViewById(R.id.day_19_3);
            viewHolder.tv76 = view.findViewById(R.id.day_20_0);
            viewHolder.tv77 = view.findViewById(R.id.day_20_1);
            viewHolder.tv78 = view.findViewById(R.id.day_20_2);
            viewHolder.tv79 = view.findViewById(R.id.day_20_3);
            viewHolder.tv80 = view.findViewById(R.id.day_21_0);
            viewHolder.tv81 = view.findViewById(R.id.day_21_1);
            viewHolder.tv82 = view.findViewById(R.id.day_21_2);
            viewHolder.tv83 = view.findViewById(R.id.day_21_3);
            viewHolder.tv84 = view.findViewById(R.id.day_22_0);
            viewHolder.tv85 = view.findViewById(R.id.day_22_1);
            viewHolder.tv86 = view.findViewById(R.id.day_22_2);
            viewHolder.tv87 = view.findViewById(R.id.day_22_3);
            viewHolder.tv88 = view.findViewById(R.id.day_23_0);
            viewHolder.tv89 = view.findViewById(R.id.day_23_1);
            viewHolder.tv90 = view.findViewById(R.id.day_23_2);
            viewHolder.tv91 = view.findViewById(R.id.day_23_3);
            viewHolder.tv92 = view.findViewById(R.id.day_24_0);
            viewHolder.tv93 = view.findViewById(R.id.day_24_1);
            viewHolder.tv94 = view.findViewById(R.id.day_24_2);
            viewHolder.tv95 = view.findViewById(R.id.day_24_3);
            viewHolder.tv96 = view.findViewById(R.id.day_25_0);
            viewHolder.tv97 = view.findViewById(R.id.day_25_1);
            viewHolder.tv98 = view.findViewById(R.id.day_25_2);
            viewHolder.tv99 = view.findViewById(R.id.day_25_3);
            viewHolder.tv100 = view.findViewById(R.id.day_26_0);
            viewHolder.tv101 = view.findViewById(R.id.day_26_1);
            viewHolder.tv102 = view.findViewById(R.id.day_26_2);
            viewHolder.tv103 = view.findViewById(R.id.day_26_3);
            viewHolder.tv104 = view.findViewById(R.id.day_27_0);
            viewHolder.tv105 = view.findViewById(R.id.day_27_1);
            viewHolder.tv106 = view.findViewById(R.id.day_27_2);
            viewHolder.tv107 = view.findViewById(R.id.day_27_3);
            viewHolder.tv108 = view.findViewById(R.id.day_28_0);
            viewHolder.tv109 = view.findViewById(R.id.day_28_1);
            viewHolder.tv110 = view.findViewById(R.id.day_28_2);
            viewHolder.tv111 = view.findViewById(R.id.day_28_3);
            viewHolder.tv112 = view.findViewById(R.id.day_29_0);
            viewHolder.tv113 = view.findViewById(R.id.day_29_1);
            viewHolder.tv114 = view.findViewById(R.id.day_29_2);
            viewHolder.tv115 = view.findViewById(R.id.day_29_3);
            viewHolder.tv116 = view.findViewById(R.id.day_30_0);
            viewHolder.tv117 = view.findViewById(R.id.day_30_1);
            viewHolder.tv118 = view.findViewById(R.id.day_30_2);
            viewHolder.tv119 = view.findViewById(R.id.day_30_3);
            viewHolder.tv120 = view.findViewById(R.id.day_31_0);
            viewHolder.tv121 = view.findViewById(R.id.day_31_1);
            viewHolder.tv122 = view.findViewById(R.id.day_31_2);
            viewHolder.tv123 = view.findViewById(R.id.day_31_3);
            viewHolder.tv124 = view.findViewById(R.id.day_32_0);
            viewHolder.tv125 = view.findViewById(R.id.day_32_1);
            viewHolder.tv126 = view.findViewById(R.id.day_32_2);
            viewHolder.tv127 = view.findViewById(R.id.day_32_3);
            viewHolder.tv128 = view.findViewById(R.id.day_33_0);
            viewHolder.tv129 = view.findViewById(R.id.day_33_1);
            viewHolder.tv130 = view.findViewById(R.id.day_33_2);
            viewHolder.tv131 = view.findViewById(R.id.day_33_3);
            viewHolder.tv132 = view.findViewById(R.id.day_34_0);
            viewHolder.tv133 = view.findViewById(R.id.day_34_1);
            viewHolder.tv134 = view.findViewById(R.id.day_34_2);
            viewHolder.tv135 = view.findViewById(R.id.day_34_3);
            viewHolder.tv136 = view.findViewById(R.id.day_35_0);
            viewHolder.tv137 = view.findViewById(R.id.day_35_1);
            viewHolder.tv138 = view.findViewById(R.id.day_35_2);
            viewHolder.tv139 = view.findViewById(R.id.day_35_3);
            viewHolder.tv140 = view.findViewById(R.id.day_36_0);
            viewHolder.tv141 = view.findViewById(R.id.day_36_1);
            viewHolder.tv142 = view.findViewById(R.id.day_36_2);
            viewHolder.tv143 = view.findViewById(R.id.day_36_3);
            viewHolder.tv144 = view.findViewById(R.id.day_37_0);
            viewHolder.tv145 = view.findViewById(R.id.day_37_1);
            viewHolder.tv146 = view.findViewById(R.id.day_37_2);
            viewHolder.tv147 = view.findViewById(R.id.day_37_3);
            viewHolder.tv148 = view.findViewById(R.id.day_38_0);
            viewHolder.tv149 = view.findViewById(R.id.day_38_1);
            viewHolder.tv150 = view.findViewById(R.id.day_38_2);
            viewHolder.tv151 = view.findViewById(R.id.day_38_3);
            viewHolder.tv152 = view.findViewById(R.id.day_39_0);
            viewHolder.tv153 = view.findViewById(R.id.day_39_1);
            viewHolder.tv154 = view.findViewById(R.id.day_39_2);
            viewHolder.tv155 = view.findViewById(R.id.day_39_3);
            viewHolder.tv156 = view.findViewById(R.id.day_40_0);
            viewHolder.tv157 = view.findViewById(R.id.day_40_1);
            viewHolder.tv158 = view.findViewById(R.id.day_40_2);
            viewHolder.tv159 = view.findViewById(R.id.day_40_3);
            viewHolder.tv160 = view.findViewById(R.id.day_41_0);
            viewHolder.tv161 = view.findViewById(R.id.day_41_1);
            viewHolder.tv162 = view.findViewById(R.id.day_41_2);
            viewHolder.tv163 = view.findViewById(R.id.day_41_3);
            viewHolder.tv164 = view.findViewById(R.id.day_42_0);
            viewHolder.tv165 = view.findViewById(R.id.day_42_1);
            viewHolder.tv166 = view.findViewById(R.id.day_42_2);
            viewHolder.tv167 = view.findViewById(R.id.day_42_3);
            //------------------------------------------------------

            view.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)view.getTag();
        }

    CH=new Calendar_Helper(vp,context,my_list);

        return view;
    }

    @Nullable
    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }
}

class ViewHolder{

    TextView tv0;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    TextView tv12;
    TextView tv13;
    TextView tv14;
    TextView tv15;
    TextView tv16;
    TextView tv17;
    TextView tv18;
    TextView tv19;
    TextView tv20;
    TextView tv21;
    TextView tv22;
    TextView tv23;
    TextView tv24;
    TextView tv25;
    TextView tv26;
    TextView tv27;
    TextView tv28;
    TextView tv29;
    TextView tv30;
    TextView tv31;
    TextView tv32;
    TextView tv33;
    TextView tv34;
    TextView tv35;
    TextView tv36;
    TextView tv37;
    TextView tv38;
    TextView tv39;
    TextView tv40;
    TextView tv41;
    TextView tv42;
    TextView tv43;
    TextView tv44;
    TextView tv45;
    TextView tv46;
    TextView tv47;
    TextView tv48;
    TextView tv49;
    TextView tv50;
    TextView tv51;
    TextView tv52;
    TextView tv53;
    TextView tv54;
    TextView tv55;
    TextView tv56;
    TextView tv57;
    TextView tv58;
    TextView tv59;
    TextView tv60;
    TextView tv61;
    TextView tv62;
    TextView tv63;
    TextView tv64;
    TextView tv65;
    TextView tv66;
    TextView tv67;
    TextView tv68;
    TextView tv69;
    TextView tv70;
    TextView tv71;
    TextView tv72;
    TextView tv73;
    TextView tv74;
    TextView tv75;
    TextView tv76;
    TextView tv77;
    TextView tv78;
    TextView tv79;
    TextView tv80;
    TextView tv81;
    TextView tv82;
    TextView tv83;
    TextView tv84;
    TextView tv85;
    TextView tv86;
    TextView tv87;
    TextView tv88;
    TextView tv89;
    TextView tv90;
    TextView tv91;
    TextView tv92;
    TextView tv93;
    TextView tv94;
    TextView tv95;
    TextView tv96;
    TextView tv97;
    TextView tv98;
    TextView tv99;
    TextView tv100;
    TextView tv101;
    TextView tv102;
    TextView tv103;
    TextView tv104;
    TextView tv105;
    TextView tv106;
    TextView tv107;
    TextView tv108;
    TextView tv109;
    TextView tv110;
    TextView tv111;
    TextView tv112;
    TextView tv113;
    TextView tv114;
    TextView tv115;
    TextView tv116;
    TextView tv117;
    TextView tv118;
    TextView tv119;
    TextView tv120;
    TextView tv121;
    TextView tv122;
    TextView tv123;
    TextView tv124;
    TextView tv125;
    TextView tv126;
    TextView tv127;
    TextView tv128;
    TextView tv129;
    TextView tv130;
    TextView tv131;
    TextView tv132;
    TextView tv133;
    TextView tv134;
    TextView tv135;
    TextView tv136;
    TextView tv137;
    TextView tv138;
    TextView tv139;
    TextView tv140;
    TextView tv141;
    TextView tv142;
    TextView tv143;
    TextView tv144;
    TextView tv145;
    TextView tv146;
    TextView tv147;
    TextView tv148;
    TextView tv149;
    TextView tv150;
    TextView tv151;
    TextView tv152;
    TextView tv153;
    TextView tv154;
    TextView tv155;
    TextView tv156;
    TextView tv157;
    TextView tv158;
    TextView tv159;
    TextView tv160;
    TextView tv161;
    TextView tv162;
    TextView tv163;
    TextView tv164;
    TextView tv165;
    TextView tv166;
    TextView tv167;



}

