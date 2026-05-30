import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.*;
public class BookDAO {

    public void saveBook(Book book) {

        Session session =
                HibernateUtil.getFactory().openSession();

        Transaction tx = session.beginTransaction();

        session.persist(book);

        tx.commit();
        session.close();
    }
}