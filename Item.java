import java.math.BigDecimal;

public class Item {
	private static String itemName;
	private static BigDecimal itemPrice;
	private static int itemQuantity;
	public BigDecimal getItemPrice;
	public BigDecimal setItemPrice;
	public String getItemName;
	public String setItemName;
	public int getItemQuantity;
	public int setItemQuantity;
	
	private Item(String itemName, BigDecimal itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemPrice =itemPrice;
		this.itemQuantity = itemQuantity;
	}
	
	public static String getItemName() {
		return itemName;
	}

	public static void setItemName(String itemName) {
		Item.itemName = itemName;
	}

	public static BigDecimal getItemPrice() {
		return itemPrice;
	}

	public static void setItemPrice(BigDecimal itemPrice) {
		Item.itemPrice = itemPrice;
	}

	public static int getItemQuantity() {
		return itemQuantity;
	}

	public static void setItemQuantity(int itemQuantity) {
		Item.itemQuantity = itemQuantity;
	}
}
