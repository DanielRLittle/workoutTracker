package com.qa.seleniumCRUD;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({Cat2.class})
@SuiteClasses({CRUD.class})
public class Runner {
	
}
