package restaurant.menu.enums;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import restaurant.menu.data.Menu;

public enum MenuSortOptions {

	CATEGORY {
		@Override
		public void sort(List<Menu> menu) {
			Collections.sort(menu, Comparator.comparing(Menu::getCategory));
		}
	},
	PRICE {
		@Override
		public void sort(List<Menu> menu) {
			Collections.sort(menu, Comparator.comparing(Menu::getPrice));
		}
	},
	NAME {
		@Override
		public void sort(List<Menu> menu) {
			Collections.sort(menu, Comparator.comparing(Menu::getName));
		}
	};

	public abstract void sort(List<Menu> menu);
}
