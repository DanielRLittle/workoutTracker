package com.qa.seleniumCRUD;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
//@IncludeCategory({Cat1.class, Cat3.class})
@ExcludeCategory({Cat4.class})
@SuiteClasses({CRUD.class})
public class Runner {
	
}
