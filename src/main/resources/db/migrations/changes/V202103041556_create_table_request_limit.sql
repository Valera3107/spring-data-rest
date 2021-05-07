create table request_limit
(
    id           uuid      not null,
    request_id   uuid      not null,
    text_client  varchar(1024),
    prc          integer,
    credit_limit integer,
    term         integer,
    result       integer,
    rtmd_id      bigint,
    text_midl    varchar(1024),
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint request_limit_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table request_limit is 'Лимит по заявке';