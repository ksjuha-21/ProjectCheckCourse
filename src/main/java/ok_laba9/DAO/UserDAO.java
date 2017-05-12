package ok_laba9.DAO;

import ok_laba9.DAO.DAOException;
import ok_laba9.entity.Course;
import ok_laba9.entity.Role;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * Created by toshiba_admin on 12.05.2017.
 */
public interface UserDAO<K,T> {
    boolean create(T entity, Role role, Course course) throws DAOException;


    boolean deleteFromUser (K id) throws DAOException;

    T update(T entity) throws DAOException;

    T getUserFindInfoForUser(K id, T user) throws DAOException;

    T getIdByLoginAndPassword(String login, String password) throws DAOException;

    List<T> getAllUserByIdCourse (Course course) throws DAOException;




}

