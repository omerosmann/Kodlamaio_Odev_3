
import business.CategoryManager;
import business.CourseManager;
import business.EdicatorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateEdicatorDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Edicator;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category1 = new Category(1, "Yazılım");
		List<Category> categoryDb = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryDb);
		categoryManager.add(category1);

		Course course1 = new Course(1, "Java", 1000);
		Course course2 = new Course(1, "Python", 1000);
		List<Course> courseDb = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.add(course1);
		courseManager.add(course2);
		
		Edicator edicator1 = new Edicator(1, "Engin", "Demiroğ");
		EdicatorManager edicatorManager = new EdicatorManager(new HibernateEdicatorDao(), loggers);
		edicatorManager.add(edicator1);
    }
}
