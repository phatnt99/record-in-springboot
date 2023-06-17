package blog.home.taphng.recordspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "app")
public class AppConfiguration {
    private String hostUrl;
    private Integer maxRequest;
    private Integer pageSize;

    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    public Integer getMaxRequest() {
        return maxRequest;
    }

    public void setMaxRequest(Integer maxRequest) {
        this.maxRequest = maxRequest;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
