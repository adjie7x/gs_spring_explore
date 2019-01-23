package hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration("customXmlConfiguration")
@ImportResource({"classpath*:applicationContext.xml"})
public class XmlConfiguration {

}
