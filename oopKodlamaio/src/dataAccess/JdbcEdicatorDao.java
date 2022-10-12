
package dataAccess;

import entities.Edicator;


public class JdbcEdicatorDao implements  EdicatorDao{

    @Override
    public void add(Edicator edicator) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
    
}
