--DROP TABLE
--DROP TABLE GENRE_CATEGORY;
--DROP TABLE GENRE;
--DROP TABLE DIRECTOR_CATEGORY;
--DROP TABLE DIRECTOR;
--DROP TABLE ACTOR_CATEGORY;
--DROP TABLE ACTOR;
DROP TABLE COUNTRY;
DROP TABLE CINEMA;

--CREATE TALBE
CREATE TABLE CINEMA
(
	c_num                NUMBER PRIMARY KEY ,
  cou_num              NUMBER NOT NULL ,
	c_title              VARCHAR2(200) NOT NULL ,
	c_runningtime        NUMBER NOT NULL ,
	c_summary            CLOB NOT NULL ,
	c_count              NUMBER DEFAULT 0,
	c_age                VARCHAR2(20) NOT NULL ,
	c_original_file_name VARCHAR2(100) NULL ,
	c_stored_file_name   VARCHAR2(200) NULL ,
  c_playdate           NUMBER DEFAULT 0
);
--CINEMA END

CREATE TABLE COUNTRY
(
  cou_num              NUMBER PRIMARY KEY,
	cou_name             VARCHAR2(30) NOT NULL
);

--COUNTRY END

COMMIT;
