package com.irestads;

import java.util.List;

import com.irestads.dao.AdsItemDAO;
import com.irestads.dao.CategoryAdsDAO;
import com.irestads.model.AdsItemModel;
import com.irestads.model.CategoryAdsModel;

import android.annotation.SuppressLint;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class AdsBookListCategoriesFragment extends ListFragment {
	AdsBookActivity adsBookActivity;
	AdsItemDAO adsItemDAO;
	CategoryAdsDAO categoryAdsDAO;
	List<CategoryAdsModel> categoryAdsModels;
	String[] values;
	static int currentIndex = 0;

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		adsBookActivity = (AdsBookActivity) getActivity();
		categoryAdsDAO = new CategoryAdsDAO(adsBookActivity);
		categoryAdsDAO.open();
		categoryAdsModels = categoryAdsDAO.getAllCategory(1);
		categoryAdsDAO.close();
		values = new String[categoryAdsModels.size()];
		for (int i = 0; i < categoryAdsModels.size(); i++) {
			values[i] = categoryAdsModels.get(i).getCategoryAdsName();
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,
				values);
		setListAdapter(adapter);
		if (categoryAdsModels.size() > 0) {
			adsBookActivity.setCurrentCategoryId(categoryAdsModels.get(0).getCategoryAdsId());
		} else {
			adsBookActivity.setCurrentCategoryId(Long.valueOf(-1));
		}
		adsItemDAO = new AdsItemDAO(adsBookActivity);
		// adsBookActivity.updateDataByCategory(categoryAdsModels.get(currentIndex).getCategoryAdsId());
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		currentIndex = position;
		adsBookActivity.setCurrentCategoryId(categoryAdsModels.get(currentIndex).getCategoryAdsId());
		adsBookActivity.onClickCategory();
	}
}
