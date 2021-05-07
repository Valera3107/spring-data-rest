create table request_applicant
(
    id             uuid not null,
    dp             varchar(10),
    first_name     varchar(255),
    second_name    varchar(255),
    last_name      varchar(255),
    old_full_name  varchar(255),
    birth_date     date,
    request_id     uuid not null,
    email          varchar(255),
    sex            varchar(255),
    created_date   timestamp not null,
    updated_date   timestamp not null,
    version        integer not null,
    constraint request_applicant_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table request_applicant is 'Заявитель';