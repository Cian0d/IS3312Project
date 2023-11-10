DROP TABLE "USERDATA";
CREATE TABLE "USERDATA"
(
"USER_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
"EMAIL" VARCHAR(50), 
"PASSWORD" VARCHAR(50), 
"FNAME" VARCHAR(50),   
"LNAME" VARCHAR(50),
"USERTYPE" VARCHAR(10)
);
DROP TABLE "PRODUCTS";
CREATE TABLE "PRODUCTS"
(
"PRODUCT_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),
"NAME" VARCHAR(50),
"DESCRIPTION" VARCHAR(600),
"CATEGORY" VARCHAR(30),
"SIZE" VARCHAR(100),      
"MATERIAL" VARCHAR(100),  
"AGE" VARCHAR(100),     
"PRICE" VARCHAR(100), 
"IMAGE_LOCATION" VARCHAR(100)
); 