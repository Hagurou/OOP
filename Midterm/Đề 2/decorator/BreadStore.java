package com.decorator;

import java.util.*;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		 /* TODO */
		for(int i = 0; i < 5; i++){
			Bread thickWithCheese = new Cheese(new ThickcrustBread());
			breads.add(thickWithCheese);
			Bread thickWithOlives = new Olives(new ThickcrustBread());
			breads.add(thickWithOlives);
			Bread thickWithCheeseAndOlives = new Olives(new Cheese(new ThickcrustBread()));
			breads.add(thickWithCheeseAndOlives);
			Bread thinWithCheese = new Cheese(new ThincrustBread());
			breads.add(thinWithCheese);
			Bread thinWithOlives = new Olives(new ThincrustBread());
			breads.add(thinWithOlives);
			Bread thinWithOlivesAndCheese = new Olives(new Cheese(new ThincrustBread()));
			breads.add(thinWithOlivesAndCheese);
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}
	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		/* TODO */
		for(int i = 0; i < breads.size(); i++){
			if(breads.get(i).cost() == bread.cost()){
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for(int i = 0; i < breads.size(); i++){
			System.out.println(breads.get(i).getDescription() + breads.get(i).cost());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> res = new ArrayList<>(breads);
		Collections.sort(res, new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				if(order){
					return Double.compare(o1.cost(), o2.cost());
				}else{
					return Double.compare(o2.cost(), o1.cost());
				}
			}
		});
		return res;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> sorted = sort(order);
		List<Bread> res = new ArrayList<>();
		if(order){
			for(int i = 0; i < howMany && i < sorted.size(); i++){
				res.add(sorted.get(sorted.size() - i - 1));
			}
		}else{
			for(int i = 0; i < howMany && i < sorted.size(); i++){
				res.add(breads.get(i));
			}
		}
		return res;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */
		Bread thickWithCheese = new Cheese(new ThickcrustBread());
		breadStore.add(thickWithCheese);
		Bread thinWithOlives = new Olives(new ThincrustBread());
		breadStore.add(thinWithOlives);

		breadStore.sell(thickWithCheese);
		breadStore.sell(thinWithOlives);

		List<Bread> sortedBreads = breadStore.sort(true);
		for (Bread bread : sortedBreads) {
			System.out.println(bread.getDescription() + ", Cost: " + bread.cost());
		}

		List<Bread> cheapestBreads = breadStore.filter(10, false);
		for (Bread bread : cheapestBreads) {
			System.out.println(bread.getDescription() + ", Cost: " + bread.cost());
		}
	}
}
