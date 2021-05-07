create table request_applicant_work
(
    id                uuid          not null,
    org_inn           varchar(255)  not null,
    org_name          varchar(255)  not null,
    org_time          varchar(255)  not null,
    org_phone         varchar(11)   not null,
    applicant_id      uuid          not null,
    address_id        uuid,
    marriage_state    varchar(255)  not null,
    post              varchar(255)  not null,
    income            integer,
    branch            varchar(255)  not null,
    created_date      timestamp     not null,
    updated_date      timestamp     not null,
    version           integer       not null,
    constraint request_applicant_work_pk
        primary key (id),
    constraint fk_address_id
        foreign key (address_id) references address,
    constraint fk_applicant_id
        foreign key (applicant_id) references request_applicant
);

comment on table request is 'Информация о работе заявителя';