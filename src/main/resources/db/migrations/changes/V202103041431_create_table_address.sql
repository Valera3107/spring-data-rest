create table address
(
    id           uuid      not null,
    post_code    integer,
    region       varchar(255),
    region_group varchar(255),
    city         varchar(255),
    city2        varchar(255),
    street       varchar(255),
    house        varchar(255),
    house2       varchar(255),
    room         varchar(255),
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint address_pk
        primary key (id)
);

comment on table address is 'Информация об адресе';