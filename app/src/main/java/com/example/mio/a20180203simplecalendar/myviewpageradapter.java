package com.example.mio.a20180203simplecalendar;

import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mio on 2018/2/3.
 */

public class myviewpageradapter extends PagerAdapter {

private List<ListView> viewList;
    myviewpageradapter(){
        viewList=new ArrayList<>();


    }

    void add(List<ListView> adapter){
        viewList.addAll(adapter);
        Log.d("TESTTTT","viewList================"+viewList.size());
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
    @Override////這段一定要加
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(viewList.get(position));//viewlist的裡面元素一定是要view才可以用這個抓出來
        return viewList.get(position);
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
