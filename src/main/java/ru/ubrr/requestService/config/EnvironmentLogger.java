package ru.ubrr.requestService.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Objects;
import java.util.stream.Stream;

@Component
public class EnvironmentLogger {

    private static final Logger log = LoggerFactory.getLogger(EnvironmentLogger.class);

    private final ConfigurableEnvironment environment;

    public EnvironmentLogger(Environment environment) {
        this.environment = (ConfigurableEnvironment) environment;
    }

    @PostConstruct
    public void init() {
        printProperties(environment);
    }

    public void printProperties(ConfigurableEnvironment environment) {
        environment.getPropertySources().stream()
                .filter(propertySource -> propertySource instanceof EnumerablePropertySource)
                .map(propertySource -> (EnumerablePropertySource<?>) propertySource)
                .forEach(propertySource -> {
                    log.info("****** " + propertySource.getName() + " ******");
                    Stream.of(propertySource.getPropertyNames())
                            .sorted()
                            .forEach(propertyName -> {
                                String resolvedProperty = environment.getProperty(propertyName);
                                String sourceProperty = Objects.requireNonNull(propertySource.getProperty(propertyName)).toString();
                                if (Objects.equals(resolvedProperty, sourceProperty)) {
                                    log.info("{} = {}", propertyName, resolvedProperty);
                                } else {
                                    log.info("{} = {} OVERRIDDEN to {}", propertyName, sourceProperty, resolvedProperty);
                                }
                            });
                });
    }
}
