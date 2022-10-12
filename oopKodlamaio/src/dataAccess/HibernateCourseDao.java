
package dataAccess;


public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(CourseDao course) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    
}
