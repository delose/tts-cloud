create table if not exists ARTICLE (
    summary varchar(500) not null,
    country varchar(50) not null,
    author varchar(100) not null,
    link varchar(500) not null,
    language varchar(50) not null,
    media varchar(500) not null,
    title varchar(250) not null,
    mediaContent varchar(50) not null,
    cleanUrl varchar(250) not null,
    rights varchar(50) not null,
    rank varchar(50) not null,
    topic varchar(50) not null,
    publishedDate varchar(50) not null,
    id identity
);