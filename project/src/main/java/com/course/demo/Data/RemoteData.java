package com.course.demo.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "remote", ignoreUnknownFields = false)
@PropertySource("classpath:properties/remote.properties")
@Component
public class RemoteData {
    private int rechargeMoney;

    public int getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(int rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }
}
