package playhaikyu.user.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
@Table
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //使用者編號

    private String name; //使用者名稱

    private String mima; //使用者qassworb

    private String email; //使用者信箱

    @CreationTimestamp
    @Column(name="user_datetime", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false, updatable = false, insertable = false)
    private Date userregidate;

    private Integer role; //使用者權限


    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMima() {
        return mima;
    }

    public void setAge(String mima) {
        this.mima = mima;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
