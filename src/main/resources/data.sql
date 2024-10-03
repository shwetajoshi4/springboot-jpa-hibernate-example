insert into user_details (id,birth_date,name) values(1001,current_date(),'shweta');
insert into user_details (id,birth_date,name) values(1002,current_date(),'rajendra');
insert into user_details (id,birth_date,name) values(1003,current_date(),'joshi');

insert into posts(id,description, user_id) values(2001,'shweta post', 1001);
insert into posts(id,description, user_id) values(2004,'shweta another post', 1001);
insert into posts(id,description, user_id) values(2002,'rajendra post', 1002);
insert into posts(id,description, user_id) values(2003,'joshi post', 1003);