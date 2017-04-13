package com.niit.watchesbackend.DAO;

import com.niit.watchesbackend.model.Category;

public interface CategoryDAO {
	public boolean saveorUpdate(Category category);
	public boolean delete(Category category);

}
