# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table post (
  id                        integer auto_increment not null,
  name                      varchar(255),
  post                      varchar(255),
  constraint pk_post primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table post;

SET FOREIGN_KEY_CHECKS=1;

