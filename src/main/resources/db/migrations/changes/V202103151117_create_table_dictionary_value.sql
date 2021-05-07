create table dictionary_value
(
    id                uuid         not null,
    dictionary_id     uuid         not null,
    value             varchar(255) not null,
    value_description varchar(1024),
    created_date      timestamp    not null,
    updated_date      timestamp    not null,
    version           integer      not null,
    constraint dictionary_value_pk
        primary key (id),
    constraint fk_dictionary_id
        foreign key (dictionary_id) references dictionary
);

comment on table dictionary_value is 'словарь константных значений';