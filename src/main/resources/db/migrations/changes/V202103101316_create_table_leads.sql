create table leads
(
    id             uuid      not null,
    form_name      varchar(255),
    design         varchar(255),
    product        varchar(255),
    lead_generator varchar(255),
    utm_source     varchar(255),
    utm_medium     varchar(255),
    utm_campaign   varchar(255),
    link           varchar(1024),
    browser        varchar(255),
    bki_id         uuid      not null,
    created_date   timestamp not null,
    updated_date   timestamp not null,
    version        integer   not null,
    constraint leads_pk
        primary key (id),
    constraint fk_bki_id
        foreign key (bki_id) references bki
);

comment on table leads is 'Источника трафика';