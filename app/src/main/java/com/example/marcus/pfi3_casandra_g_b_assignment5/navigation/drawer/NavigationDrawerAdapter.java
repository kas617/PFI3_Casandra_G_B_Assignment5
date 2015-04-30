package com.example.marcus.pfi3_casandra_g_b_assignment5.navigation.drawer;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import se.k3.antonochisak.kd323bassignment5.R;

/**
 * Created by isak on 2015-04-24.
 */
public class NavigationDrawerAdapter extends BaseAdapter {
    ArrayList<String> mList;
    LayoutInflater mLayoutInflater;

    public NavigationDrawerAdapter(LayoutInflater layoutInflater, ArrayList<String> list) {
        this.mList = list;
        this.mLayoutInflater = layoutInflater;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder holder;
        if (convertView == null) {
            v = mLayoutInflater.inflate(R.layout.drawer_list_item, parent, false);
            holder = new ViewHolder(v);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }
        holder.itemTextView.setText(mList.get(position));
        return v;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder {
        @InjectView(R.id.item_list_text_view)
        TextView itemTextView;

        public ViewHolder(View base) {
            ButterKnife.inject(this, base);
        }
    }
}
