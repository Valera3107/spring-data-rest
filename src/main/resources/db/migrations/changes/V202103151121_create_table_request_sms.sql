create table request_sms
(
    id         uuid not null,
    request_id uuid not null,
    text       text,
    isms_id    integer,
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint request_sms_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table request_call is 'коммуникация по смс с клиентом';