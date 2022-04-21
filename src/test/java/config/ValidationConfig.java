package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${typeProperties}.properties"
})
public interface ValidationConfig extends Config {

    String user();

    String password();

    String app();

    String url();
}
