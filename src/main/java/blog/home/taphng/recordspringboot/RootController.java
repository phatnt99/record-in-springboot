package blog.home.taphng.recordspringboot;

import blog.home.taphng.recordspringboot.config.AppConfiguration;
import blog.home.taphng.recordspringboot.config.AppConfigurationRecord;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @Autowired
    private AppConfiguration appConfiguration;

    @Autowired
    private AppConfigurationRecord appConfigurationRecord;


    @PostConstruct
    public void setup() {
        System.out.println("pk");
    }
}
