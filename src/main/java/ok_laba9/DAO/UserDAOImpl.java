package ok_laba9.DAO;

import ok_laba9.entity.Course;
import ok_laba9.entity.Role;

import java.util.List;

/**
 * Created by toshiba_admin on 12.05.2017.
 */
public class UserDAOImpl implements UserDAO {
    public boolean create(Object entity, Role role, Course course) throws DAOException {
        return false;
    }

    public boolean deleteFromUser(Object id) throws DAOException {
        return false;
    }

    public Object update(Object entity) throws DAOException {
        return null;
    }

    public Object getUserFindInfoForUser(Object id, Object user) throws DAOException {
        return null;
    }

    public Object getIdByLoginAndPassword(String login, String password) throws DAOException {
        return null;
    }

    public List getAllUserByIdCourse(Course course) throws DAOException {
        return null;
    }
}
