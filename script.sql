create table if not exists users(
id serial  primary key,
username varchar(50) not null ,
first_name varchar(100) not null,
last_name varchar(100) not null,
password varchar(255) not null,
email varchar(100) not null 
);
INSERT INTO users (username, first_name,last_name,"password",email) VALUES
    ('limanor44', 'Vitali', 'Khlulp', '1985-02-10', 'Comedy'),
    ('HG120', 'The Dinner Game', '444', 'dfefwer2332', 'Comedy');
    
    create table if not exists roles(
id serial primary key,
role_name varchar(100) not null
);


create table if not exists user_roles(
user_id bigint,
roles_id bigint,
foreign key (user_id) references users(id) on delete cascade on update restrict ,
foreign key (roles_id) references roles(id) on delete cascade on update restrict
);
