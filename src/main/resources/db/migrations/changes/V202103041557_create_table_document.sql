create table document
(
    id            uuid          not null,
    folder        varchar(255)  not null,
    mimetype      varchar(255)  not null,
    link_document varchar(1024) not null,
    applicant_id  uuid          not null,
    created_date  timestamp     not null,
    updated_date  timestamp     not null,
    version       integer       not null,
    constraint document_pk
        primary key (id),
    constraint fk_applicant_id
        foreign key (applicant_id) references request_applicant
);

comment on table document is 'Документ заявителя';