drop table if exists city;

CREATE TABLE `city` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `state` varchar(255) default NULL,
  `country` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;


insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into city (name, state, country) values ('Montgomery', 'AL', 'US');
insert into city (name, state, country) values ('Juneau', 'AK', 'US');
insert into city (name, state, country) values ('Sacramento', 'CA', 'US');
insert into city (name, state, country) values ('Tallahassee', 'FL', 'US');
insert into city (name, state, country) values ('Honolulu', 'HI', 'US');
insert into city (name, state, country) values ('Helena', 'MT', 'US');
insert into city (name, state, country) values ('Harrisburg', 'PA', 'US');
insert into city (name, state, country) values ('Salt Lake City', 'UT', 'US');
insert into city (name, state, country) values ('Columbia', 'SC', 'US');
insert into city (name, state, country) values ('Lincoln', 'NE', 'US');
insert into city (name, state, country) values ('Jefferson City', 'MO', 'US');
