create table request_pred_limit
(
    id                          uuid      not null,
    limit_start_date            date,
    limit_end_date              date,
    credit_amount_final         integer,
    limit_pd                    integer,
    limit_npd                   integer,
    prc                         double precision,
    zp                          boolean,
    request_id                  uuid      not null,
    result                      integer,
    rtmd_id                     bigint,
    text_midl                   varchar(1024),
    created_date                timestamp not null,
    updated_date                timestamp not null,
    version                     integer   not null,
    constraint request_pred_limit_pk
        primary key (id),
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table request_pred_limit is 'Предварительный лимит по заявке';