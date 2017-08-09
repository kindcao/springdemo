package demo.swagger2.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kind on 2017/8/8.
 */
@XmlRootElement(name = "User", namespace = "http://springdemo/swagger2/xml")
@ApiModel(value = "User", description = "User对象")
public class User {

    @XmlElement
    @ApiModelProperty(value = "id", example = "1000")
    private Long id;

    @XmlElement
    @ApiModelProperty(value = "username", example = "username1000")
    private String username;

    @XmlElement
    @ApiModelProperty(value = "password", example = "password1000")
    private String password;

    //must
    public User() {
    }

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
