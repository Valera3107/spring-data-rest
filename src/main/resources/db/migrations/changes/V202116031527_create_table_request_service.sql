create table request_service
(
    id           uuid      not null,
    estat        varchar(5),
    object_id    integer,
    request_id   uuid      not null,
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint request_service_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table request_service is 'сервисные заявки';