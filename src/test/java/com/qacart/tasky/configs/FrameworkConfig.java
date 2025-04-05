package com.qacart.tasky.configs;


import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:env",
        "system:properties",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("https://tasky-be.qacart.com/api")
    @Key("api.url")
    String apiURL();

    @DefaultValue("https://tasky.qacart.com")
    @Key("pageBase.url")
    String pageBaseURL();
}
