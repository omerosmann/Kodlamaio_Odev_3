
package dataAccess;


public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(CourseDao course) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
    
}
