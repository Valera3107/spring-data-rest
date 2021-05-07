create table esia_document
(
    id             uuid      not null,
    type           varchar(255),
    series         varchar(255),
    number         varchar(255),
    entry_date     date,
    institute_code varchar(255),
    expiry_date    date,
    act_no         varchar(255),
    last_name      varchar(255),
    first_name     varchar(255),
    vrfstu         varchar(255),
    applicant_id   uuid      not null,
    created_date   timestamp not null,
    updated_date   timestamp not null,
    version        integer   not null,
    constraint esia_document_pk
        primary key (id),
    constraint fk_esia_applicant_id
        foreign key (applicant_id) references esia_applicant
);

comment on table esia_document is 'Документ заявителя с источника ESIA';