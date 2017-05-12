package ok_laba9.DAO;

import ok_laba9.HibernateUtil;
import ok_laba9.entity.Course;
import ok_laba9.entity.Role;
import ok_laba9.entity.User;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by toshiba_admin on 12.05.2017.
 */
public class UserDAOImpl implements UserDAO<Long,User> {

    public Long create(User entity, Role role, Course course) throws DAOException {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        session.saveOrUpdate(entity);

        session.getTransaction().commit();

        return entity.getId();
    }

    public boolean deleteFromUser(Long id) throws DAOException {
        return false;
    }

    public User update(User entity) throws DAOException {

        return null;
    }

    public User getUserFindInfoForUser(Long id, User user) throws DAOException {
        return null;
    }

    public User getIdByLoginAndPassword(String login, String password) throws DAOException {
        return null;
    }

    public List<User> getAllUserByIdCourse(Course course) throws DAOException {
        return null;
    }
}
