create table request
(
    id                   uuid        not null,
    phone                varchar(11) not null,
    credit_amount        integer,
    claim_link           varchar(255),
    type_income          varchar(2),
    claim_id             integer,
    status_id            uuid,
    status_description   varchar(1024),
    created_date         timestamp   not null,
    updated_date         timestamp   not null,
    version              integer     not null,
    constraint request_pk
        primary key (id),
    constraint fk_status_id
        foreign key (status_id) references dictionary_value
);

comment on table request is 'Заявка на кредит';