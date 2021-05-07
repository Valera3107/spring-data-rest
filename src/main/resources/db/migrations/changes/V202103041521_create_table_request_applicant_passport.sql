create table request_applicant_passport
(
    id              uuid      not null,
    series          varchar(255),
    number          varchar(255),
    institute       varchar(255),
    entry_date      date,
    birth_place     varchar(255),
    applicant_id    uuid      not null,
    register_date   date,
    institute_code  varchar(255),
    nationality     varchar(255),
    address_reg     uuid,
    address_reg_res boolean default false,
    address_res     uuid,
    created_date    timestamp not null,
    updated_date    timestamp not null,
    version         integer   not null,
    constraint request_applicant_passport_pk
        primary key (id),
    constraint fk_applicant_id_fk
        foreign key (applicant_id) references request_applicant,
    constraint fk_address_reg_id
        foreign key (address_reg) references address,
    constraint fk_address_res_id
        foreign key (address_res) references address
);

comment on table request_applicant_passport is 'Паспортные данные заявителя';