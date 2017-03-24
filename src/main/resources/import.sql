drop table if exists city;
drop table if exists hotel;

-- ----------------------------
-- Table structure for city
-- ----------------------------
CREATE TABLE `city` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `state` varchar(255) default NULL,
  `country` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hotel
-- ----------------------------
CREATE TABLE `hotel` (
  `city` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `zip` varchar(255) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records
-- ----------------------------

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

-- ----------------------------
-- Records
-- ----------------------------
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001');
insert into hotel(city, name, address, zip) values (2, 'The Margate Resort', '76 Lake St', '1001');
insert into hotel(city, name, address, zip) values (3, 'Holiday Inn Express and Suites Merrimack', '4 Amherst Road', '5232');


