create table delivery
(
    id           uuid      not null,
    channel      varchar(255),
    note         varchar(1024),
    request_id   uuid      not null,
    address_id   uuid      not null,
    created_date timestamp not null,
    updated_date timestamp not null,
    version      integer   not null,
    constraint delivery_pk
        primary key (id),
    constraint fk_address_id
        foreign key (address_id) references address,
    constraint fk_request_id
        foreign key (request_id) references request
);

comment on table delivery is 'Способ доставки';