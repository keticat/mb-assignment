package restaurant.menu;

import restaurant.menu.data.Menu;
import restaurant.menu.data.MenuList;
import restaurant.menu.enums.MenuSortOptions;

public class RestaurantMenuApp {

	public static void main(String[] args) {
		MenuList menuList = new MenuList();
		// These are the item list
		menuList.addToMenu(new Menu("Spaghetti", 120.0, "Pasta"));
		menuList.addToMenu(new Menu("Lasagna", 19.0, "Pasta"));
		menuList.addToMenu(new Menu("Nasi Lemak", 9.0, "Rice"));
		menuList.addToMenu(new Menu("Bee Hoon Goreng", 12.0, "Noodles"));
		// Sort depending on the options (name, category, price)
		menuList.sortBy(MenuSortOptions.NAME);
		// Display Menu
		menuList.displayMenu();
	}
}
