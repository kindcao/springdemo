package demo.swagger2.auth.model;

/**
 * Created by kind on 2017/8/10.
 */
public enum ResultStatus {
    SUCCESS(0, "成功"),
    USERNAME_NOT_FOUND(-1000, "用户不存在"),
    PASSWORD_ERROR(-1001, "密码错误"),
    USER_NOT_LOGIN(-1002, "用户未登录");

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回结果描述
     */
    private String message;

    ResultStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}