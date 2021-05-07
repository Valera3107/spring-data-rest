create table dictionary
(
    id           uuid         not null,
    code         varchar(100) not null,
    name         varchar(255) not null,
    created_date timestamp    not null,
    updated_date timestamp    not null,
    version      integer      not null,
    constraint dictionary_pk
        primary key (id)
);

comment on table dictionary is 'словарь констант';