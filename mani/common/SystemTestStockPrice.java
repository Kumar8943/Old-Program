package com.mani.common;
import java.util.ArrayList;
import java.util.List;

public class SystemTestStockPrice {

	public static void main(String[] args) {

		List<StockPrice> stockPriceList = new ArrayList<StockPrice>();
		stockPriceList.add(new StockPrice("101", 1, 1, 20));
		stockPriceList.add(new StockPrice("101", 1, 2, 45));
		stockPriceList.add(new StockPrice("101", 1, 3, 40));
		stockPriceList.add(new StockPrice("101", 1, 4, 15));
		stockPriceList.add(new StockPrice("101", 1, 5, 70));
		stockPriceList.add(new StockPrice("101", 1, 6, 80));
		stockPriceList.add(new StockPrice("101", 1, 7, 85));
		stockPriceList.add(new StockPrice("101", 1, 8, 12));
		stockPriceList.add(new StockPrice("101", 1, 9, 34));
		stockPriceList.add(new StockPrice("101", 1, 10, 36));

		calculate(stockPriceList);
	}

	public static void calculate(List<StockPrice> stockPriceList) {


		int goodDayToPurchase = 0, goodDayToSale = 0;
		float purchasePrice = 0, salePrice = 0, profit = 0;

		int badDayToPurchase = 0, badDayToSale = 0;
		float badPurchasePrice = 0, badSalePrice = 0, loss = 999999;

		for (int i=0;i< stockPriceList.size(); i++) {
			StockPrice sp1 = stockPriceList.get(i);
			
			for (int j=i+1; j<stockPriceList.size();j++) {
				StockPrice sp2 = stockPriceList.get(j);

				float tempProfit = sp2.getPrice() - sp1.getPrice();
				if (tempProfit > profit) {
					profit = tempProfit;
					goodDayToPurchase = sp1.getDayOfMonth();
					purchasePrice = sp1.getPrice();
					goodDayToSale = sp2.getDayOfMonth();
					salePrice = sp2.getPrice();
				}
				
				if(tempProfit<loss) {
					loss = tempProfit;
					badDayToPurchase = sp1.getDayOfMonth();
					badPurchasePrice = sp1.getPrice();
					badDayToSale = sp2.getDayOfMonth();
					badSalePrice = sp2.getPrice();
				}
				
			}

		}

		System.out.println("Good day to Purchase " +
				goodDayToPurchase + "(price:" + purchasePrice + ") Good day to Sale " + goodDayToSale + "(price:" + salePrice + "), Profit   " + profit);
		System.out.println("Bad day to Purchase " +
				badDayToPurchase + "(price:" + badPurchasePrice + ") Bad day to Sale " + badDayToSale + "(price:" + badSalePrice + "), Loss   " + loss);

	}

}

class StockPrice {
	private String stockID;
	private int month;
	private int dayOfMonth;
	private float price;

	public StockPrice(String stockID, int month, int dayOfMonth, float price) {
		this.stockID = stockID;
		this.month = month;
		this.dayOfMonth = dayOfMonth;
		this.price = price;
	}

	public String getStockID() {
		return stockID;
	}

	public void setStockID(String stockID) {
		this.stockID = stockID;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
