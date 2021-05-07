create table request_call
(
    id           uuid      not null,
    category     varchar(3),
    estat        varchar(5),
    queue        varchar(255),
    object_id    integer,
    request_id   uuid      not null,
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint request_call_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table request_call is 'коммуникация по звонку с клиентом';