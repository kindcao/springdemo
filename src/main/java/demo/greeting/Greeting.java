package demo.greeting;

/**
 * Created by kind on 2017/3/21.
 */
public class Greeting {

    private long id;

    private String content;

    public Greeting() {
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
