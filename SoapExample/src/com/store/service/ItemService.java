package com.store.service;

import com.store.model.Item;

public interface ItemService {
	
	public boolean addItem(Item item);
	
	public boolean deleteItem(int itemId);
	
	public Item getItem(int itemId);
	
	public Item[] getAllItems();

}
