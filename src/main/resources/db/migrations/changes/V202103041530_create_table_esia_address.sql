create table esia_address
(
    id                   uuid      not null,
    type                 varchar(255),
    country              varchar(255),
    address_str          varchar(255),
    post_code            varchar(255),
    region               varchar(255),
    region_group         varchar(255),
    city                 varchar(255),
    district             varchar(255),
    settlement           varchar(255),
    street               varchar(255),
    addition_area        varchar(255),
    addition_area_street varchar(255),
    house_num            varchar(255),
    building             varchar(255),
    frame                varchar(255),
    fias_code            varchar(255),
    applicant_id         uuid      not null,
    created_date         timestamp not null,
    updated_date         timestamp not null,
    version              integer   not null,
    constraint esia_address_pk
        primary key (id),
    constraint fk_esia_applicant_id
        foreign key (applicant_id) references esia_applicant
);

comment on table esia_address is 'Адрес заявителя с источника ESIA';