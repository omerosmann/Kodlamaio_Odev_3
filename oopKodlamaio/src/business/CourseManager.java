package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;
import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {

        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
        }
        for (Course cour : courses) {
            if (cour.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Kurs ismi aynı olamaz.");
            }

        }

        
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());

        }
    }
}
