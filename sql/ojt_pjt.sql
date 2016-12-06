CREATE TABLE CINEMA
(
	c_num                NUMBER PRIMARY KEY ,
  cou_num              NUMBER NOT NULL ,
	c_title              VARCHAR2(200) NOT NULL ,
	c_runningtime        NUMBER NOT NULL ,
	c_summary            BLOB NOT NULL ,
	c_count              NUMBER DEFAULT 0,
	c_age                VARCHAR2(20) NOT NULL ,
	c_original_file_name VARCHAR2(100) NULL ,
	c_stored_file_name   VARCHAR2(200) NULL ,
  c_playtime           NUMBER DEFAULT 0
);

ALTER TABLE CINEMA
MODIFY (c_summary CLOB);

MODIFY (c_summary NOT NULL);

MODIFY (c_runningtime NOT NULL);

MODIFY (c_count NUMBER DEFAULT 0);

ALTER TABLE CINEMA
ADD (c_playdate NUMBER DEFAULT 0);

ALTER TABLE CINEMA
DROP COLUMN c_playdate;

ALTER TABLE CINEMA
DROP COLUMN c_summary;

ALTER TABLE CINEMA
ADD (c_summary CLOB NOT NULL);

COMMIT;
--CINEMA END


CREATE TABLE COUNTRY
(
  cou_num              NUMBER PRIMARY KEY,
	cou_name             VARCHAR2(30) NOT NULL
);

--COUNTRY END

CREATE TABLE ACTOR
(
  ac_num               NUMBER PRIMARY KEY,
	a_chracter           VARCHAR2(50) NOT NULL ,
	c_num                NUMBER NOT NULL ,
	a_part               VARCHAR2(20) NOT NULL ,
	ac_code              NUMBER NOT NULL 
);

--ACTOR END

CREATE TABLE ACTOR_CATEGORY
(
	ac_code              NUMBER PRIMARY KEY ,
	ac_name              VARCHAR2(50) NOT NULL 
);

--ACTOR_CATEGORY END


CREATE TABLE DIRECTOR
(
  d_num                NUMBER PRIMARY KEY ,
	c_num                NUMBER NOT NULL ,
	dc_code              NUMBER NOT NULL 
);

--DIRECTOR END

CREATE TABLE DIRECTOR_CATEGORY
(
	dc_code              NUMBER PRIMARY KEY ,
	dc_name              VARCHAR2(50) NOT NULL 
);

--DIRECTOR_CATEGORY END

CREATE TABLE GENRE
(
  g_num                NUMBER PRIMARY KEY ,
	c_num                NUMBER NOT NULL ,
	gc_code              NUMBER NOT NULL
);

--GENRE END

CREATE TABLE GENRE_CATEGORY
(
  gc_code              NUMBER PRIMARY KEY ,
	gc_name              VARCHAR2(20) NOT NULL 
);

--GENRE_CATEGORY END

COMMIT;
