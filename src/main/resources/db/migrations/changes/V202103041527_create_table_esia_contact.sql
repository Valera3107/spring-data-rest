create table esia_contact
(
    id              uuid         not null,
    type            varchar(255) not null,
    vrfstu          varchar(255),
    value           varchar(255),
    vrfvalstu       varchar(255),
    verifying_value varchar(255),
    applicant_id    uuid         not null,
    created_date    timestamp    not null,
    updated_date    timestamp    not null,
    version         integer      not null,
    constraint esia_contact_pk
        primary key (id),
    constraint fk_esia_applicant_id
        foreign key (applicant_id) references esia_applicant
);

comment on table esia_contact is 'Контакты заявителя с источника ESIA';