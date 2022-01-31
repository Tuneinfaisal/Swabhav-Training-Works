package com.monocept;

import java.util.ArrayList;

public class StockListView implements IView{
	
	ArrayList<Stock> stockListView = new ArrayList<Stock>();

//	@Override
//	public void displayStock()
//	{
//		for(Stock s : stockListView)
//		{
//			System.out.println(s.getName());
//			System.out.println(s.getPrice());
//		}
//	}
	
	@Override
	public void addStock(Stock s)
	{
		stockListView.add(s);
	}
	
	public void showAllStock()
	{
		for(Stock s : stockListView)
		{
			System.out.println(s.getName());
			System.out.println(s.getPrice());
			System.out.println();
		}
		
	}

}
