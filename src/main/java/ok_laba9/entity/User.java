package ok_laba9.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by toshiba_admin on 04.05.2017.
 */

@Entity
@Table(name = "user")
public class User implements Serializable{

    private static final long serialVersionUID = 1798070786993154676L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "login", length = 30)
    private String login;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "fullname", length = 50)
    private String fullname;

    @ManyToOne(targetEntity = Role.class)
    private Role role;

    @ManyToOne(targetEntity = Course.class)
    private Course course;

    public User (){

        super();
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullname;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
