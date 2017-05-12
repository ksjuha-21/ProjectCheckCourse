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

    @ManyToOne(targetEntity = Role.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Role role;

    @ManyToOne(targetEntity = Course.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Course course;

    public User (){

        super();
    }

    public long getId() {
        return id;
    }



    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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
