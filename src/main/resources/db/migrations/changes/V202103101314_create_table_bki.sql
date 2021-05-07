create table bki
(
    id            uuid                  not null,
    claim_type    varchar(255)          not null,
    bki_send      boolean default false not null,
    bki_send_date date                  not null,
    request_id    uuid                  not null,
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint bki_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table bki is 'Заявка типа BKI';