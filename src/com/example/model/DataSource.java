package com.example.model;

import java.util.ArrayList;
import java.util.List;

import com.example.listview.R;





public class DataSource {
	private static List<Item> data=new ArrayList<Item>();

	public static List<Item> getData() {
		
		data.add(new Item("����",R.drawable.imgb));
		data.add(new Item("��Ȼ",R.drawable.imgc));
		data.add(new Item("����",R.drawable.imgd));
		data.add(new Item("è��",R.drawable.imge));
		data.add(new Item("����",R.drawable.imgf));
		
		data.add(new Item("����",R.drawable.imgb));
		data.add(new Item("��Ȼ",R.drawable.imgc));
		data.add(new Item("����",R.drawable.imgd));
		data.add(new Item("è��",R.drawable.imge));
		data.add(new Item("����",R.drawable.imgf));
	
		data.add(new Item("����",R.drawable.imgb));
		data.add(new Item("��Ȼ",R.drawable.imgc));
		data.add(new Item("����",R.drawable.imgd));
		data.add(new Item("è��",R.drawable.imge));
		data.add(new Item("����",R.drawable.imgf));
		
		data.add(new Item("����",R.drawable.imgb));
		data.add(new Item("��Ȼ",R.drawable.imgc));
		data.add(new Item("����",R.drawable.imgd));
		data.add(new Item("è��",R.drawable.imge));
		data.add(new Item("����",R.drawable.imgf));
		
		return data;
	}

	
}
