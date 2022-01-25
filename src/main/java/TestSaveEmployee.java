import com.dzhenetl.entity.Employee;
import com.dzhenetl.util.SessionManager;
import org.hibernate.*;

public class TestSaveEmployee {

    public static void main(final String[] args) throws Exception {
        try (Session session = SessionManager.getSession()) {
            Employee employee = new Employee("Ivan", "Ivanov", "OK", 100500);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}