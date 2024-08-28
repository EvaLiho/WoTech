
create table persons
(id INTEGER PRIMARY KEY, name varchar);  

-- varchar is string
-- PRIMARY KEY menas that there can only be one
______________________________________________________________________
insert into persons(name) VALUES (
  'oskars'
);
_______________________________________________________________________
SELECT * from persons
_____________________________________________________________________
AUTO INCREMENT

1. Oskars
2. Anna
3. Laila
4. Andrey

Delete where id = 3

1. Oskars
2. Anna
4. Andrey

Add Laila

1. Oskars
2. Anna
4. Andrey
5. Laila

Delete where id = 5

1. Oskars
2. Anna
4. Andrey

Add Laila again

1. Oskars
2. Anna
4. Andrey
6. Laila
___________________________________________________________________________

  ORM - framework to add items to a database
  
