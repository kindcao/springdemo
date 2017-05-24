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
insert into city (name, state, country) values ('Montgomery','AL','US');
insert into city (name, state, country) values ('Juneau','AK','US');
insert into city (name, state, country) values ('Phoenix','AZ','US');
insert into city (name, state, country) values ('Little rock','AR','US');
insert into city (name, state, country) values ('Sacramento','CA','US');
insert into city (name, state, country) values ('Denver','CO','US');
insert into city (name, state, country) values ('Hartford','CT','US');
insert into city (name, state, country) values ('Dover','DE','US');
insert into city (name, state, country) values ('Tallahassee','FL','US');
insert into city (name, state, country) values ('Atlanta','GA','US');
insert into city (name, state, country) values ('Honolulu','HI','US');
insert into city (name, state, country) values ('Boise','ID','US');
insert into city (name, state, country) values ('Springfield','IL','US');
insert into city (name, state, country) values ('Indianapolis','IN','US');
insert into city (name, state, country) values ('Des Moines','IA','US');
insert into city (name, state, country) values ('Topeka','KS','US');
insert into city (name, state, country) values ('Frankfort','KY','US');
insert into city (name, state, country) values ('Baton Rouge','LA','US');
insert into city (name, state, country) values ('Augusta','ME','US');
insert into city (name, state, country) values ('Annapolis','MD','US');
insert into city (name, state, country) values ('Boston','MA','US');
insert into city (name, state, country) values ('Lansing','MI','US');
insert into city (name, state, country) values ('St. Paul','MN','US');
insert into city (name, state, country) values ('Jackson','MS','US');
insert into city (name, state, country) values ('Jefferson City','MO','US');
insert into city (name, state, country) values ('Helena','MT','US');
insert into city (name, state, country) values ('Lincoln','NE','US');
insert into city (name, state, country) values ('Carson City','NV','US');
insert into city (name, state, country) values ('Concord','NH','US');
insert into city (name, state, country) values ('Trenton','NJ','US');
insert into city (name, state, country) values ('Santa Fe','NM','US');
insert into city (name, state, country) values ('Albany','NY','US');
insert into city (name, state, country) values ('Raleigh','NC','US');
insert into city (name, state, country) values ('Bismarck','ND','US');
insert into city (name, state, country) values ('Columbus','OH','US');
insert into city (name, state, country) values ('Oklahoma City','OK','US');
insert into city (name, state, country) values ('Salem','OR','US');
insert into city (name, state, country) values ('Harrisburg','PA','US');
insert into city (name, state, country) values ('Providence','RI','US');
insert into city (name, state, country) values ('Columbia','SC','US');
insert into city (name, state, country) values ('Pierre','SD','US');
insert into city (name, state, country) values ('Nashville','TN','US');
insert into city (name, state, country) values ('Austin','TX','US');
insert into city (name, state, country) values ('Salt Lake City','UT','US');
insert into city (name, state, country) values ('Montpelier','VT','US');
insert into city (name, state, country) values ('Richmond','VA','US');
insert into city (name, state, country) values ('Olympia','WA','US');
insert into city (name, state, country) values ('Charleston','WV','US');
insert into city (name, state, country) values ('Madison','WI','US');
insert into city (name, state, country) values ('Cheyenne','WY','US');

-- ----------------------------
-- Records
-- ----------------------------
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001');
insert into hotel(city, name, address, zip) values (2, 'The Margate Resort', '76 Lake St', '1001');
insert into hotel(city, name, address, zip) values (3, 'Holiday Inn Express and Suites Merrimack', '4 Amherst Road', '5232');


