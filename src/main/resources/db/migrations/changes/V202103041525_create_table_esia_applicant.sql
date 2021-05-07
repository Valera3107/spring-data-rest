create table esia_applicant
(
    id           uuid      not null,
    first_name   varchar(255),
    second_name  varchar(255),
    last_name    varchar(255),
    status       varchar(255),
    birth_date   date,
    birth_place  varchar(255),
    sex          varchar(7),
    nationality  varchar(255),
    trusted      varchar(255),
    riddoc       varchar(255),
    snils        varchar(255),
    inn          varchar(255),
    verifying    varchar(255),
    request_id   uuid      not null,
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer not null,
    constraint esia_applicant_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table esia_applicant is 'Заявитель с источника ESIA';