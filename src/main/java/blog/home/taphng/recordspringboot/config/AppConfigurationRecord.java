package blog.home.taphng.recordspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public record AppConfigurationRecord(
        String hostUrl,
        Integer maxRequest,
        Integer pageSize,
        DatabaseConfigurationRecord database
) {

    public record DatabaseConfigurationRecord (
            String host,
            String user,
            String password
    ) { }
}
