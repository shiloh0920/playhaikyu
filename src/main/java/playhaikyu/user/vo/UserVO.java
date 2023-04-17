package playhaikyu.user.vo;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table
public class UserVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 會員編號

    private String name; // 會員名稱

    private String mima; // 會員qassworb

    private String email; // 會員信箱

    @CreationTimestamp
    @Column(name = "user_datetime", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false, updatable = false, insertable = false)
    private Date userregidate; // 會員註冊信箱

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Integer role; // 會員權限

    @Column(name = "reset_mima_token")
    private String resetMimaToken;

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
