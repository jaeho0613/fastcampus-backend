drop table if exists users;

create table users
(
    userid   varchar(12) not null,
    password varchar(12) not null,
    name     varchar(20) not null,
    email    varchar(50),

    primary key (userid)
)