CREATE TABLE CATEGORY(ID INT, NAME VARCHAR(50),DESCRIPTION VARCHAR (100) PRIMARY KEY(ID) );
CREATE TABLE CATEGORY_SUBCATEGORY_MAP(PARENT_CATEGORY_ID INT, CHILD_CATEGORY_ID);