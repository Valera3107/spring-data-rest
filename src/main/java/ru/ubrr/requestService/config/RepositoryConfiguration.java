package ru.ubrr.requestService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import ru.ubrr.requestService.domain.*;

@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Address.class,
                Applicant.class,
                Delivery.class,
                Document.class,
                Limit.class,
                Passport.class,
                PredLimit.class,
                Request.class,
                Work.class,
                EsiaApplicant.class,
                EsiaAddress.class,
                EsiaContact.class,
                EsiaDocument.class,
                Lead.class,
                Bki.class,
                Dictionary.class,
                DictionaryValue.class,
                RequestCall.class,
                RequestSms.class);
    }
}
