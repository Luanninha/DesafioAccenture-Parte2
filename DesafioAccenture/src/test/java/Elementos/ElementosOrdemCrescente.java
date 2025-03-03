package Elementos;

import org.openqa.selenium.By;

public class ElementosOrdemCrescente {

	private By campoInteractions = By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(5)");
	private By submenuSortable = By.cssSelector(":nth-child(5) > .element-list > .menu-list > #item-0");
	private By list = By.id("demo-tab-list");
	private By grid = By.cssSelector("#demo-tab-grid");
	private By One = By.cssSelector("#demo-tabpane-list > div > div:nth-child(1)");
	private By two = By.cssSelector("#demo-tabpane-list > div > div:nth-child(2)");
	private By three = By.cssSelector("#demo-tabpane-list > div > div:nth-child(3)");
	private By four = By.cssSelector("#demo-tabpane-list > div > div:nth-child(4)");
	private By five = By.cssSelector("#demo-tabpane-list > div > div:nth-child(5)");
	private By six = By.cssSelector("#demo-tabpane-list > div > div:nth-child(6)");

	public By getCampoInteractions() {
		return campoInteractions;
	}

	public By getSubmenuSortable() {
		return submenuSortable;
	}

	public By getList() {
		return list;
	}

	public By getGrid() {
		return grid;
	}

	// public By getMetodosordemcrescente() {
	// return metodosordemcrescente;}
	public By getOne() {
		return One;
	}

	public By getTwo() {
		return two;
	}

	public By getThree() {
		return three;
	}

	public By getFour() {
		return four;
	}

	public By getFive() {
		return five;
	}

	public By getSix() {
		return six;
	}
}
