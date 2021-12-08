package hibernatemaven.apis;


import org.hibernate.Session;
 
public class Test {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
 
        session.beginTransaction();
        Employee employee=new Employee();
        
        employee.setName("yam");
        employee.setSalary(3000);
 
        session.save(employee);
        session.getTransaction().commit();
 
    }
 
}