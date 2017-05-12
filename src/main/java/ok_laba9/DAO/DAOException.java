package ok_laba9.DAO;

/**
 * Created by toshiba_admin on 12.05.2017.
 */
public class DAOException extends Exception {

    private Exception e;

    public DAOException() {
        super();
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Exception e) {
        super(message, e);
    }

    Exception getDAOException() {
        return e;
    }
}
