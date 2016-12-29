package com.example.adapter;

import java.util.List;

import com.example.listview.R;
import com.example.model.Item;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Myadapter extends BaseAdapter{
	private List<Item> data;
	private Context context;
	public Myadapter(List<Item> data,Context context){
		this.context=context;
		this.data=data;
	}
	@Override
	public int getCount() {
		// TODO �Զ����ɵķ������
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO �Զ����ɵķ������
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO �Զ����ɵķ������
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view=LayoutInflater.from(context).inflate(R.layout.textview, null);
		ImageView iv=(ImageView) view.findViewById(R.id.item_iv);
		TextView tv=(TextView) view.findViewById(R.id.item_tv);
		iv.setImageResource(data.get(position).getImgID());
		tv.setText(data.get(position).getName());
		return view;
	}

}
