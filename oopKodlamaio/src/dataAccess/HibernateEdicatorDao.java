
package dataAccess;

import entities.Edicator;


public class HibernateEdicatorDao implements EdicatorDao{

    @Override
    public void add(Edicator edicator) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
    
}
