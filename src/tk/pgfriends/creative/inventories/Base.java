package tk.pgfriends.creative.inventories;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Base implements InventoryHolder {
	private Inventory inv; // Declares Inventory object to use throughout the class
	
	public Base() // This is the 'root directory' of the GUI interface thing I guess
	{
		inv = Bukkit.createInventory(this, 27, "MC Bingo"); // Initiates the declared Inventory object
		init(); // Build the inventory
	}
	
	private void init() // This is where we create the inventory // For organization
	{
		ItemStack testItem = createItem("Test Item", Material.BIRCH_SIGN, createLore("This should be on line 1", "line 2, this is on")); // Creates an ItemStack with a name, Material, and Lore
		inv.addItem(testItem);
	}
	
	private ItemStack createItem(String name, Material mat, List<String> lore)
	{
		ItemStack item = new ItemStack(mat, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	private List<String> createLore(String line1, String line2) // Creates a List<String> that represents lore // I want to be organized and not have this code for every ItemStack I want to create with a lore  -.-
	{
		List<String> lore = new ArrayList<String>();
		lore.add(line1);
		lore.add(line2);
		return lore;
	}

	@Override
	public Inventory getInventory() { return inv; } // Returns the built inventory
}
