package demo.greeting;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by kind on 2017/5/22.
 */
@XmlRootElement(name = "greeting", namespace = "http://springdemo/greeting/xml")
public class GreetingXML {

    @XmlElement
    private long id;

    @XmlElement
    private String content;

    public GreetingXML() {
    }

    public GreetingXML(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
