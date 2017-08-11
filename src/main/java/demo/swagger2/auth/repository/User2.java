package demo.swagger2.auth.repository;

import io.swagger.annotations.ApiModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by kind on 2017/8/10.
 */
@Entity
@Table(name = "user_")
@ApiModel(value = "User2", description = "User2对象")
public class User2 {
    //用户名

    @Column(name = "username_")
    private String username;

    //密码
    @Column(name = "password_")
    private String password;

    //用户id
    @Id
    @Column(name = "id_")
    private long id;

    //昵称
    @Column(name = "nickname_")
    private String nickname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
