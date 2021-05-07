alter table esia_applicant add sys_updated_date timestamp;
alter table esia_document add institute varchar(50);
alter table esia_address add flat varchar(20);
alter table request_service add sys_created_date timestamp;
alter table document add file_bucket varchar(1024);
alter table document add file_key varchar(1024);
alter table request_applicant_work add relation_phone varchar(15);