package demo.cfgprop.company;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by kind on 2017/3/29.
 */
// prefix设置key的前缀;
@ConfigurationProperties(prefix = "com.kfit.company", locations = "classpath:company.properties")
@Component
public class CompanyProperties {

    @NotNull
    private String name;

    private String location;

    private String mobile;

    @Max(value = 1000)
    @Min(value = 1)
    private int employCount;

    // 对应：com.kfit.company.firstName = lin
    private String firstName;

    // 对应：com.kfit.company.logo-path = d:/data/files/logo.png
    private String logoPath;

    // 对应：com.kfit.company.COMPANY_FULLNAME = 北京知远科技公司
    private String companyFullname;

    private List<String> employs = new ArrayList<String>();

    @URL
    private String url;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getCompanyFullname() {
        return companyFullname;
    }

    public void setCompanyFullname(String companyFullname) {
        this.companyFullname = companyFullname;
    }

    public List<String> getEmploys() {
        return employs;
    }

    public void setEmploys(List<String> employs) {
        this.employs = employs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getEmployCount() {
        return employCount;
    }

    public void setEmployCount(int employCount) {
        this.employCount = employCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CompanyProperties [name=" + name + ", location=" + location + ", mobile=" + mobile + ", employCount="
                + employCount + ", firstName=" + firstName + ", logoPath=" + logoPath + ", companyFullname="
                + companyFullname + ", employs=" + employs + "]";
    }
}
