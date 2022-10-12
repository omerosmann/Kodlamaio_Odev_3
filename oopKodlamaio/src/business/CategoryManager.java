package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;
import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {

        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;

    }

    public void add(Category category) throws Exception {
        for (Category categor : categories) {
            if (categor.getCategoryName().equals(categor.getCategoryName())) {
                throw new Exception("Kategori ismi aynı olamaz.");
            }

        }

        categoryDao.add(category);
        categories.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());

        }

    }
}
