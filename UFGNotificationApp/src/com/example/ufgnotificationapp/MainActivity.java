package com.example.ufgnotificationapp;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<String> listItems = new ArrayList<>();

		ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
				android.R.layout.simple_list_item_1, listItems);
		setListAdapter(adapter);

		listItems.add("Reitoria");
		listItems.add("Pro Reitoria");
		listItems.add("Biblioteca");
		listItems.add("Persistência");
		listItems.add("Concorrência");
		listItems.add("DSC");
		listItems.add("DSP");
		adapter.notifyDataSetChanged();
	}
}
