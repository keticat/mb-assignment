package restaurant.menu.data;

import java.util.ArrayList;
import java.util.List;

import restaurant.menu.enums.MenuSortOptions;
import restaurant.menu.interfaces.ISort;

public class MenuList implements ISort {

	private List<Menu> menuList;

	public MenuList() {
		menuList = new ArrayList<Menu>();
	}

	public void addToMenu(Menu menu) {
		menuList.add(menu);
	}

	public void displayMenu() {
		menuList.forEach(m -> System.out
				.println("name: " + m.getName() + ", price: " + m.getPrice() + ", category: " + m.getCategory()));
	}

	@Override
	public void sortBy(MenuSortOptions options) {
		options.sort(menuList);
	}
}
