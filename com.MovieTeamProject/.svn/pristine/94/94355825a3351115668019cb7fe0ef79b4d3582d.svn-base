
CREATE TABLE ACTOR
(
	a_chracter           VARCHAR2(50) NOT NULL ,
	c_num                NUMBER NOT NULL ,
	a_part               VARCHAR2(20) NOT NULL ,
	ac_num               NUMBER NOT NULL ,
	ac_code              NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK배우 ON ACTOR
(ac_num   ASC);



ALTER TABLE ACTOR
	ADD CONSTRAINT  XPK배우 PRIMARY KEY (ac_num);



CREATE TABLE ACTOR_CATEGORY
(
	ac_code              NUMBER NOT NULL ,
	ac_name              VARCHAR2(50) NOT NULL 
);



CREATE UNIQUE INDEX XPK배우카테고리 ON ACTOR_CATEGORY
(ac_code   ASC);



ALTER TABLE ACTOR_CATEGORY
	ADD CONSTRAINT  XPK배우카테고리 PRIMARY KEY (ac_code);



CREATE TABLE CINEMA
(
	c_num                NUMBER NOT NULL ,
	c_title              VARCHAR2(200) NOT NULL ,
	c_runningtime        NUMBER NULL ,
	c_summary            BLOB NULL ,
	c_count              NUMBER NOT NULL ,
	c_age                VARCHAR2(20) NOT NULL ,
	c_original_file_name VARCHAR2(100) NULL ,
	c_stored_file_name   VARCHAR2(200) NULL ,
	cou_num              NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK영화정보 ON CINEMA
(c_num   ASC);



ALTER TABLE CINEMA
	ADD CONSTRAINT  XPK영화정보 PRIMARY KEY (c_num);



CREATE TABLE COUNTRY
(
	cou_name             VARCHAR2(30) NOT NULL ,
	cou_num              NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK국가 ON COUNTRY
(cou_num   ASC);



ALTER TABLE COUNTRY
	ADD CONSTRAINT  XPK국가 PRIMARY KEY (cou_num);



CREATE TABLE DIRECTOR
(
	c_num                NUMBER NOT NULL ,
	d_num                NUMBER NOT NULL ,
	dc_code              NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK감독 ON DIRECTOR
(d_num   ASC);



ALTER TABLE DIRECTOR
	ADD CONSTRAINT  XPK감독 PRIMARY KEY (d_num);



CREATE TABLE DIRECTOR_CATEGORY
(
	dc_code              NUMBER NOT NULL ,
	dc_name              VARCHAR2(50) NOT NULL 
);



CREATE UNIQUE INDEX XPK감독카테고리 ON DIRECTOR_CATEGORY
(dc_code   ASC);



ALTER TABLE DIRECTOR_CATEGORY
	ADD CONSTRAINT  XPK감독카테고리 PRIMARY KEY (dc_code);



CREATE TABLE GENRE
(
	c_num                NUMBER NOT NULL ,
	gc_code              NUMBER NOT NULL ,
	g_num                NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK장르 ON GENRE
(g_num   ASC);



ALTER TABLE GENRE
	ADD CONSTRAINT  XPK장르 PRIMARY KEY (g_num);



CREATE TABLE GENRE_CATEGORY
(
	gc_name              VARCHAR2(20) NOT NULL ,
	gc_code              NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK장르_카테고리 ON GENRE_CATEGORY
(gc_code   ASC);



ALTER TABLE GENRE_CATEGORY
	ADD CONSTRAINT  XPK장르_카테고리 PRIMARY KEY (gc_code);



CREATE TABLE MEMBER
(
	m_password           VARCHAR2(128 BYTE) NOT NULL ,
	m_birthday           DATE NULL ,
	m_authorty           NUMBER NULL ,
	m_id                 VARCHAR2(50 BYTE) NOT NULL 
);



CREATE UNIQUE INDEX XPK회원 ON MEMBER
(m_id   ASC);



ALTER TABLE MEMBER
	ADD CONSTRAINT  XPK회원 PRIMARY KEY (m_id);



CREATE TABLE QNA
(
	q_num                NUMBER NOT NULL ,
	q_title              VARCHAR2(100 BYTE) NOT NULL ,
	q_hit_count          NUMBER NOT NULL ,
	q_date               DATE NULL ,
	q_content            CLOB NOT NULL ,
	q_original_file_name VARCHAR2(260 BYTE) NOT NULL ,
	q_stored_file_name   VARCHAR2(36 BYTE) NOT NULL ,
	q_parent             NUMBER NOT NULL ,
	q_group_num          NUMBER NOT NULL ,
	m_id                 VARCHAR2(50 BYTE) NOT NULL ,
	q_category           VARCHAR2(50) NOT NULL 
);



CREATE UNIQUE INDEX XPK질문 ON QNA
(q_num   ASC);



ALTER TABLE QNA
	ADD CONSTRAINT  XPK질문 PRIMARY KEY (q_num);



CREATE TABLE REIVIEW
(
	r_num                NUMBER NOT NULL ,
	r_title              VARCHAR2(100 BYTE) NOT NULL ,
	r_content            CLOB NOT NULL ,
	r_date               DATE NOT NULL ,
	r_count              NUMBER NOT NULL ,
	r_like               NUMBER NOT NULL ,
	m_id                 VARCHAR2(50 BYTE) NOT NULL ,
	r_path               VARCHAR2(100 BYTE) NULL ,
	c_num                NUMBER NOT NULL 
);



CREATE UNIQUE INDEX XPK리뷰 ON REIVIEW
(r_num   ASC);



ALTER TABLE REIVIEW
	ADD CONSTRAINT  XPK리뷰 PRIMARY KEY (r_num);



CREATE TABLE REVIEW_COMMENT
(
	rc_num               NUMBER NOT NULL ,
	rc_content           CLOB NOT NULL ,
	rc_date              DATE NOT NULL ,
	r_num                NUMBER NOT NULL ,
	m_id                 VARCHAR2(50 BYTE) NOT NULL 
);



CREATE UNIQUE INDEX XPK리뷰댓글 ON REVIEW_COMMENT
(rc_num   ASC);



ALTER TABLE REVIEW_COMMENT
	ADD CONSTRAINT  XPK리뷰댓글 PRIMARY KEY (rc_num);



CREATE TABLE REVIEW_LIKE
(
	rl_date              DATE NOT NULL ,
	r_num                NUMBER NOT NULL ,
	m_id                 VARCHAR2(50 BYTE) NOT NULL 
);



ALTER TABLE ACTOR
	ADD (CONSTRAINT R_15 FOREIGN KEY (c_num) REFERENCES CINEMA (c_num));



ALTER TABLE ACTOR
	ADD (CONSTRAINT R_41 FOREIGN KEY (ac_code) REFERENCES ACTOR_CATEGORY (ac_code));



ALTER TABLE CINEMA
	ADD (CONSTRAINT R_43 FOREIGN KEY (cou_num) REFERENCES COUNTRY (cou_num));



ALTER TABLE DIRECTOR
	ADD (CONSTRAINT R_12 FOREIGN KEY (c_num) REFERENCES CINEMA (c_num));



ALTER TABLE DIRECTOR
	ADD (CONSTRAINT R_42 FOREIGN KEY (dc_code) REFERENCES DIRECTOR_CATEGORY (dc_code));



ALTER TABLE GENRE
	ADD (CONSTRAINT R_1 FOREIGN KEY (c_num) REFERENCES CINEMA (c_num));



ALTER TABLE GENRE
	ADD (CONSTRAINT R_39 FOREIGN KEY (gc_code) REFERENCES GENRE_CATEGORY (gc_code));



ALTER TABLE QNA
	ADD (CONSTRAINT R_57 FOREIGN KEY (m_id) REFERENCES MEMBER (m_id));



ALTER TABLE REIVIEW
	ADD (CONSTRAINT R_26 FOREIGN KEY (m_id) REFERENCES MEMBER (m_id));



ALTER TABLE REIVIEW
	ADD (CONSTRAINT R_72 FOREIGN KEY (c_num) REFERENCES CINEMA (c_num));



ALTER TABLE REVIEW_COMMENT
	ADD (CONSTRAINT R_29 FOREIGN KEY (r_num) REFERENCES REIVIEW (r_num));



ALTER TABLE REVIEW_COMMENT
	ADD (CONSTRAINT R_30 FOREIGN KEY (m_id) REFERENCES MEMBER (m_id));



ALTER TABLE REVIEW_LIKE
	ADD (CONSTRAINT R_49 FOREIGN KEY (r_num) REFERENCES REIVIEW (r_num));



ALTER TABLE REVIEW_LIKE
	ADD (CONSTRAINT R_50 FOREIGN KEY (m_id) REFERENCES MEMBER (m_id));



CREATE  TRIGGER tI_ACTOR BEFORE INSERT ON ACTOR for each row
-- ERwin Builtin Trigger
-- INSERT trigger on ACTOR 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* CINEMA  ACTOR on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001e6b0", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_15", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM CINEMA
      WHERE
        /* %JoinFKPK(:%New,CINEMA," = "," AND") */
        :new.c_num = CINEMA.c_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ACTOR because CINEMA does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* ACTOR_CATEGORY  ACTOR on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="ACTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_41", FK_COLUMNS="ac_code" */
    SELECT count(*) INTO NUMROWS
      FROM ACTOR_CATEGORY
      WHERE
        /* %JoinFKPK(:%New,ACTOR_CATEGORY," = "," AND") */
        :new.ac_code = ACTOR_CATEGORY.ac_code;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert ACTOR because ACTOR_CATEGORY does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_ACTOR AFTER UPDATE ON ACTOR for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on ACTOR 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* CINEMA  ACTOR on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001e336", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_15", FK_COLUMNS="c_num" */
  SELECT count(*) INTO NUMROWS
    FROM CINEMA
    WHERE
      /* %JoinFKPK(:%New,CINEMA," = "," AND") */
      :new.c_num = CINEMA.c_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ACTOR because CINEMA does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* ACTOR_CATEGORY  ACTOR on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="ACTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_41", FK_COLUMNS="ac_code" */
  SELECT count(*) INTO NUMROWS
    FROM ACTOR_CATEGORY
    WHERE
      /* %JoinFKPK(:%New,ACTOR_CATEGORY," = "," AND") */
      :new.ac_code = ACTOR_CATEGORY.ac_code;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update ACTOR because ACTOR_CATEGORY does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_ACTOR_CATEGORY AFTER DELETE ON ACTOR_CATEGORY for each row
-- ERwin Builtin Trigger
-- DELETE trigger on ACTOR_CATEGORY 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* ACTOR_CATEGORY  ACTOR on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000ccdf", PARENT_OWNER="", PARENT_TABLE="ACTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_41", FK_COLUMNS="ac_code" */
    SELECT count(*) INTO NUMROWS
      FROM ACTOR
      WHERE
        /*  %JoinFKPK(ACTOR,:%Old," = "," AND") */
        ACTOR.ac_code = :old.ac_code;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete ACTOR_CATEGORY because ACTOR exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_ACTOR_CATEGORY AFTER UPDATE ON ACTOR_CATEGORY for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on ACTOR_CATEGORY 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* ACTOR_CATEGORY  ACTOR on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0000f063", PARENT_OWNER="", PARENT_TABLE="ACTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_41", FK_COLUMNS="ac_code" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.ac_code <> :new.ac_code
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ACTOR
      WHERE
        /*  %JoinFKPK(ACTOR,:%Old," = "," AND") */
        ACTOR.ac_code = :old.ac_code;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update ACTOR_CATEGORY because ACTOR exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_CINEMA BEFORE INSERT ON CINEMA for each row
-- ERwin Builtin Trigger
-- INSERT trigger on CINEMA 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* COUNTRY  CINEMA on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0000e48c", PARENT_OWNER="", PARENT_TABLE="COUNTRY"
    CHILD_OWNER="", CHILD_TABLE="CINEMA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_43", FK_COLUMNS="cou_num" */
    SELECT count(*) INTO NUMROWS
      FROM COUNTRY
      WHERE
        /* %JoinFKPK(:%New,COUNTRY," = "," AND") */
        :new.cou_num = COUNTRY.cou_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert CINEMA because COUNTRY does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER  tD_CINEMA AFTER DELETE ON CINEMA for each row
-- ERwin Builtin Trigger
-- DELETE trigger on CINEMA 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* CINEMA  GENRE on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00037355", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_1", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM GENRE
      WHERE
        /*  %JoinFKPK(GENRE,:%Old," = "," AND") */
        GENRE.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete CINEMA because GENRE exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* CINEMA  DIRECTOR on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_12", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM DIRECTOR
      WHERE
        /*  %JoinFKPK(DIRECTOR,:%Old," = "," AND") */
        DIRECTOR.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete CINEMA because DIRECTOR exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* CINEMA  ACTOR on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_15", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM ACTOR
      WHERE
        /*  %JoinFKPK(ACTOR,:%Old," = "," AND") */
        ACTOR.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete CINEMA because ACTOR exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* CINEMA  REIVIEW on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_72", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM REIVIEW
      WHERE
        /*  %JoinFKPK(REIVIEW,:%Old," = "," AND") */
        REIVIEW.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete CINEMA because REIVIEW exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_CINEMA AFTER UPDATE ON CINEMA for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on CINEMA 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* CINEMA  GENRE on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0004fb88", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_1", FK_COLUMNS="c_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.c_num <> :new.c_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM GENRE
      WHERE
        /*  %JoinFKPK(GENRE,:%Old," = "," AND") */
        GENRE.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update CINEMA because GENRE exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* CINEMA  DIRECTOR on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_12", FK_COLUMNS="c_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.c_num <> :new.c_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM DIRECTOR
      WHERE
        /*  %JoinFKPK(DIRECTOR,:%Old," = "," AND") */
        DIRECTOR.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update CINEMA because DIRECTOR exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* CINEMA  ACTOR on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="ACTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_15", FK_COLUMNS="c_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.c_num <> :new.c_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM ACTOR
      WHERE
        /*  %JoinFKPK(ACTOR,:%Old," = "," AND") */
        ACTOR.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update CINEMA because ACTOR exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* CINEMA  REIVIEW on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_72", FK_COLUMNS="c_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.c_num <> :new.c_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM REIVIEW
      WHERE
        /*  %JoinFKPK(REIVIEW,:%Old," = "," AND") */
        REIVIEW.c_num = :old.c_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update CINEMA because REIVIEW exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* COUNTRY  CINEMA on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="COUNTRY"
    CHILD_OWNER="", CHILD_TABLE="CINEMA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_43", FK_COLUMNS="cou_num" */
  SELECT count(*) INTO NUMROWS
    FROM COUNTRY
    WHERE
      /* %JoinFKPK(:%New,COUNTRY," = "," AND") */
      :new.cou_num = COUNTRY.cou_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update CINEMA because COUNTRY does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_COUNTRY AFTER DELETE ON COUNTRY for each row
-- ERwin Builtin Trigger
-- DELETE trigger on COUNTRY 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* COUNTRY  CINEMA on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000d085", PARENT_OWNER="", PARENT_TABLE="COUNTRY"
    CHILD_OWNER="", CHILD_TABLE="CINEMA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_43", FK_COLUMNS="cou_num" */
    SELECT count(*) INTO NUMROWS
      FROM CINEMA
      WHERE
        /*  %JoinFKPK(CINEMA,:%Old," = "," AND") */
        CINEMA.cou_num = :old.cou_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete COUNTRY because CINEMA exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_COUNTRY AFTER UPDATE ON COUNTRY for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on COUNTRY 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* COUNTRY  CINEMA on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0000fa86", PARENT_OWNER="", PARENT_TABLE="COUNTRY"
    CHILD_OWNER="", CHILD_TABLE="CINEMA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_43", FK_COLUMNS="cou_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.cou_num <> :new.cou_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM CINEMA
      WHERE
        /*  %JoinFKPK(CINEMA,:%Old," = "," AND") */
        CINEMA.cou_num = :old.cou_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update COUNTRY because CINEMA exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_DIRECTOR BEFORE INSERT ON DIRECTOR for each row
-- ERwin Builtin Trigger
-- INSERT trigger on DIRECTOR 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* CINEMA  DIRECTOR on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="000201fa", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_12", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM CINEMA
      WHERE
        /* %JoinFKPK(:%New,CINEMA," = "," AND") */
        :new.c_num = CINEMA.c_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert DIRECTOR because CINEMA does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* DIRECTOR_CATEGORY  DIRECTOR on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="DIRECTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_42", FK_COLUMNS="dc_code" */
    SELECT count(*) INTO NUMROWS
      FROM DIRECTOR_CATEGORY
      WHERE
        /* %JoinFKPK(:%New,DIRECTOR_CATEGORY," = "," AND") */
        :new.dc_code = DIRECTOR_CATEGORY.dc_code;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert DIRECTOR because DIRECTOR_CATEGORY does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_DIRECTOR AFTER UPDATE ON DIRECTOR for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on DIRECTOR 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* CINEMA  DIRECTOR on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001f77d", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_12", FK_COLUMNS="c_num" */
  SELECT count(*) INTO NUMROWS
    FROM CINEMA
    WHERE
      /* %JoinFKPK(:%New,CINEMA," = "," AND") */
      :new.c_num = CINEMA.c_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update DIRECTOR because CINEMA does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* DIRECTOR_CATEGORY  DIRECTOR on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="DIRECTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_42", FK_COLUMNS="dc_code" */
  SELECT count(*) INTO NUMROWS
    FROM DIRECTOR_CATEGORY
    WHERE
      /* %JoinFKPK(:%New,DIRECTOR_CATEGORY," = "," AND") */
      :new.dc_code = DIRECTOR_CATEGORY.dc_code;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update DIRECTOR because DIRECTOR_CATEGORY does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_DIRECTOR_CATEGORY AFTER DELETE ON DIRECTOR_CATEGORY for each row
-- ERwin Builtin Trigger
-- DELETE trigger on DIRECTOR_CATEGORY 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* DIRECTOR_CATEGORY  DIRECTOR on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000db77", PARENT_OWNER="", PARENT_TABLE="DIRECTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_42", FK_COLUMNS="dc_code" */
    SELECT count(*) INTO NUMROWS
      FROM DIRECTOR
      WHERE
        /*  %JoinFKPK(DIRECTOR,:%Old," = "," AND") */
        DIRECTOR.dc_code = :old.dc_code;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete DIRECTOR_CATEGORY because DIRECTOR exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_DIRECTOR_CATEGORY AFTER UPDATE ON DIRECTOR_CATEGORY for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on DIRECTOR_CATEGORY 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* DIRECTOR_CATEGORY  DIRECTOR on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00010769", PARENT_OWNER="", PARENT_TABLE="DIRECTOR_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="DIRECTOR"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_42", FK_COLUMNS="dc_code" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.dc_code <> :new.dc_code
  THEN
    SELECT count(*) INTO NUMROWS
      FROM DIRECTOR
      WHERE
        /*  %JoinFKPK(DIRECTOR,:%Old," = "," AND") */
        DIRECTOR.dc_code = :old.dc_code;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update DIRECTOR_CATEGORY because DIRECTOR exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_GENRE BEFORE INSERT ON GENRE for each row
-- ERwin Builtin Trigger
-- INSERT trigger on GENRE 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* CINEMA  GENRE on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001f013", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_1", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM CINEMA
      WHERE
        /* %JoinFKPK(:%New,CINEMA," = "," AND") */
        :new.c_num = CINEMA.c_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert GENRE because CINEMA does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* GENRE_CATEGORY  GENRE on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="GENRE_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_39", FK_COLUMNS="gc_code" */
    SELECT count(*) INTO NUMROWS
      FROM GENRE_CATEGORY
      WHERE
        /* %JoinFKPK(:%New,GENRE_CATEGORY," = "," AND") */
        :new.gc_code = GENRE_CATEGORY.gc_code;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert GENRE because GENRE_CATEGORY does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_GENRE AFTER UPDATE ON GENRE for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on GENRE 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* CINEMA  GENRE on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001e9d7", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_1", FK_COLUMNS="c_num" */
  SELECT count(*) INTO NUMROWS
    FROM CINEMA
    WHERE
      /* %JoinFKPK(:%New,CINEMA," = "," AND") */
      :new.c_num = CINEMA.c_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update GENRE because CINEMA does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* GENRE_CATEGORY  GENRE on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="GENRE_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_39", FK_COLUMNS="gc_code" */
  SELECT count(*) INTO NUMROWS
    FROM GENRE_CATEGORY
    WHERE
      /* %JoinFKPK(:%New,GENRE_CATEGORY," = "," AND") */
      :new.gc_code = GENRE_CATEGORY.gc_code;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update GENRE because GENRE_CATEGORY does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_GENRE_CATEGORY AFTER DELETE ON GENRE_CATEGORY for each row
-- ERwin Builtin Trigger
-- DELETE trigger on GENRE_CATEGORY 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* GENRE_CATEGORY  GENRE on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0000d50c", PARENT_OWNER="", PARENT_TABLE="GENRE_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_39", FK_COLUMNS="gc_code" */
    SELECT count(*) INTO NUMROWS
      FROM GENRE
      WHERE
        /*  %JoinFKPK(GENRE,:%Old," = "," AND") */
        GENRE.gc_code = :old.gc_code;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete GENRE_CATEGORY because GENRE exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_GENRE_CATEGORY AFTER UPDATE ON GENRE_CATEGORY for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on GENRE_CATEGORY 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* GENRE_CATEGORY  GENRE on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0000f74c", PARENT_OWNER="", PARENT_TABLE="GENRE_CATEGORY"
    CHILD_OWNER="", CHILD_TABLE="GENRE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_39", FK_COLUMNS="gc_code" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.gc_code <> :new.gc_code
  THEN
    SELECT count(*) INTO NUMROWS
      FROM GENRE
      WHERE
        /*  %JoinFKPK(GENRE,:%Old," = "," AND") */
        GENRE.gc_code = :old.gc_code;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update GENRE_CATEGORY because GENRE exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER  tD_MEMBER AFTER DELETE ON MEMBER for each row
-- ERwin Builtin Trigger
-- DELETE trigger on MEMBER 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* MEMBER  REIVIEW on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0003730c", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_26", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM REIVIEW
      WHERE
        /*  %JoinFKPK(REIVIEW,:%Old," = "," AND") */
        REIVIEW.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete MEMBER because REIVIEW exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* MEMBER  REVIEW_COMMENT on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_30", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_COMMENT
      WHERE
        /*  %JoinFKPK(REVIEW_COMMENT,:%Old," = "," AND") */
        REVIEW_COMMENT.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete MEMBER because REVIEW_COMMENT exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* MEMBER  REVIEW_LIKE on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_50", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_LIKE
      WHERE
        /*  %JoinFKPK(REVIEW_LIKE,:%Old," = "," AND") */
        REVIEW_LIKE.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete MEMBER because REVIEW_LIKE exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* MEMBER  QNA on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="QNA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_57", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM QNA
      WHERE
        /*  %JoinFKPK(QNA,:%Old," = "," AND") */
        QNA.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete MEMBER because QNA exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_MEMBER AFTER UPDATE ON MEMBER for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on MEMBER 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* MEMBER  REIVIEW on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="000412d8", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_26", FK_COLUMNS="m_id" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.m_id <> :new.m_id
  THEN
    SELECT count(*) INTO NUMROWS
      FROM REIVIEW
      WHERE
        /*  %JoinFKPK(REIVIEW,:%Old," = "," AND") */
        REIVIEW.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update MEMBER because REIVIEW exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* MEMBER  REVIEW_COMMENT on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_30", FK_COLUMNS="m_id" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.m_id <> :new.m_id
  THEN
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_COMMENT
      WHERE
        /*  %JoinFKPK(REVIEW_COMMENT,:%Old," = "," AND") */
        REVIEW_COMMENT.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update MEMBER because REVIEW_COMMENT exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* MEMBER  REVIEW_LIKE on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_50", FK_COLUMNS="m_id" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.m_id <> :new.m_id
  THEN
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_LIKE
      WHERE
        /*  %JoinFKPK(REVIEW_LIKE,:%Old," = "," AND") */
        REVIEW_LIKE.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update MEMBER because REVIEW_LIKE exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* MEMBER  QNA on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="QNA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_57", FK_COLUMNS="m_id" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.m_id <> :new.m_id
  THEN
    SELECT count(*) INTO NUMROWS
      FROM QNA
      WHERE
        /*  %JoinFKPK(QNA,:%Old," = "," AND") */
        QNA.m_id = :old.m_id;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update MEMBER because QNA exists.'
      );
    END IF;
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_QNA BEFORE INSERT ON QNA for each row
-- ERwin Builtin Trigger
-- INSERT trigger on QNA 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* MEMBER  QNA on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0000df32", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="QNA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_57", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM MEMBER
      WHERE
        /* %JoinFKPK(:%New,MEMBER," = "," AND") */
        :new.m_id = MEMBER.m_id;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert QNA because MEMBER does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_QNA AFTER UPDATE ON QNA for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on QNA 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* MEMBER  QNA on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0000e017", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="QNA"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_57", FK_COLUMNS="m_id" */
  SELECT count(*) INTO NUMROWS
    FROM MEMBER
    WHERE
      /* %JoinFKPK(:%New,MEMBER," = "," AND") */
      :new.m_id = MEMBER.m_id;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update QNA because MEMBER does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_REIVIEW BEFORE INSERT ON REIVIEW for each row
-- ERwin Builtin Trigger
-- INSERT trigger on REIVIEW 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* MEMBER  REIVIEW on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001d7ef", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_26", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM MEMBER
      WHERE
        /* %JoinFKPK(:%New,MEMBER," = "," AND") */
        :new.m_id = MEMBER.m_id;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert REIVIEW because MEMBER does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* CINEMA  REIVIEW on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_72", FK_COLUMNS="c_num" */
    SELECT count(*) INTO NUMROWS
      FROM CINEMA
      WHERE
        /* %JoinFKPK(:%New,CINEMA," = "," AND") */
        :new.c_num = CINEMA.c_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert REIVIEW because CINEMA does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER  tD_REIVIEW AFTER DELETE ON REIVIEW for each row
-- ERwin Builtin Trigger
-- DELETE trigger on REIVIEW 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* REIVIEW  REVIEW_COMMENT on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="0001d6b1", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_29", FK_COLUMNS="r_num" */
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_COMMENT
      WHERE
        /*  %JoinFKPK(REVIEW_COMMENT,:%Old," = "," AND") */
        REVIEW_COMMENT.r_num = :old.r_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete REIVIEW because REVIEW_COMMENT exists.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* REIVIEW  REVIEW_LIKE on parent delete restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_49", FK_COLUMNS="r_num" */
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_LIKE
      WHERE
        /*  %JoinFKPK(REVIEW_LIKE,:%Old," = "," AND") */
        REVIEW_LIKE.r_num = :old.r_num;
    IF (NUMROWS > 0)
    THEN
      raise_application_error(
        -20001,
        'Cannot delete REIVIEW because REVIEW_LIKE exists.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_REIVIEW AFTER UPDATE ON REIVIEW for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on REIVIEW 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* REIVIEW  REVIEW_COMMENT on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="0003f56b", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_29", FK_COLUMNS="r_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.r_num <> :new.r_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_COMMENT
      WHERE
        /*  %JoinFKPK(REVIEW_COMMENT,:%Old," = "," AND") */
        REVIEW_COMMENT.r_num = :old.r_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update REIVIEW because REVIEW_COMMENT exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* REIVIEW  REVIEW_LIKE on parent update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_49", FK_COLUMNS="r_num" */
  IF
    /* %JoinPKPK(:%Old,:%New," <> "," OR ") */
    :old.r_num <> :new.r_num
  THEN
    SELECT count(*) INTO NUMROWS
      FROM REVIEW_LIKE
      WHERE
        /*  %JoinFKPK(REVIEW_LIKE,:%Old," = "," AND") */
        REVIEW_LIKE.r_num = :old.r_num;
    IF (NUMROWS > 0)
    THEN 
      raise_application_error(
        -20005,
        'Cannot update REIVIEW because REVIEW_LIKE exists.'
      );
    END IF;
  END IF;

  /* ERwin Builtin Trigger */
  /* MEMBER  REIVIEW on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_26", FK_COLUMNS="m_id" */
  SELECT count(*) INTO NUMROWS
    FROM MEMBER
    WHERE
      /* %JoinFKPK(:%New,MEMBER," = "," AND") */
      :new.m_id = MEMBER.m_id;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update REIVIEW because MEMBER does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* CINEMA  REIVIEW on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="CINEMA"
    CHILD_OWNER="", CHILD_TABLE="REIVIEW"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_72", FK_COLUMNS="c_num" */
  SELECT count(*) INTO NUMROWS
    FROM CINEMA
    WHERE
      /* %JoinFKPK(:%New,CINEMA," = "," AND") */
      :new.c_num = CINEMA.c_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update REIVIEW because CINEMA does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_REVIEW_COMMENT BEFORE INSERT ON REVIEW_COMMENT for each row
-- ERwin Builtin Trigger
-- INSERT trigger on REVIEW_COMMENT 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* REIVIEW  REVIEW_COMMENT on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001e506", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_29", FK_COLUMNS="r_num" */
    SELECT count(*) INTO NUMROWS
      FROM REIVIEW
      WHERE
        /* %JoinFKPK(:%New,REIVIEW," = "," AND") */
        :new.r_num = REIVIEW.r_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert REVIEW_COMMENT because REIVIEW does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* MEMBER  REVIEW_COMMENT on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_30", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM MEMBER
      WHERE
        /* %JoinFKPK(:%New,MEMBER," = "," AND") */
        :new.m_id = MEMBER.m_id;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert REVIEW_COMMENT because MEMBER does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_REVIEW_COMMENT AFTER UPDATE ON REVIEW_COMMENT for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on REVIEW_COMMENT 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* REIVIEW  REVIEW_COMMENT on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001e1f8", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_29", FK_COLUMNS="r_num" */
  SELECT count(*) INTO NUMROWS
    FROM REIVIEW
    WHERE
      /* %JoinFKPK(:%New,REIVIEW," = "," AND") */
      :new.r_num = REIVIEW.r_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update REVIEW_COMMENT because REIVIEW does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* MEMBER  REVIEW_COMMENT on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_COMMENT"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_30", FK_COLUMNS="m_id" */
  SELECT count(*) INTO NUMROWS
    FROM MEMBER
    WHERE
      /* %JoinFKPK(:%New,MEMBER," = "," AND") */
      :new.m_id = MEMBER.m_id;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update REVIEW_COMMENT because MEMBER does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/


CREATE  TRIGGER tI_REVIEW_LIKE BEFORE INSERT ON REVIEW_LIKE for each row
-- ERwin Builtin Trigger
-- INSERT trigger on REVIEW_LIKE 
DECLARE NUMROWS INTEGER;
BEGIN
    /* ERwin Builtin Trigger */
    /* REIVIEW  REVIEW_LIKE on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="0001db3d", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_49", FK_COLUMNS="r_num" */
    SELECT count(*) INTO NUMROWS
      FROM REIVIEW
      WHERE
        /* %JoinFKPK(:%New,REIVIEW," = "," AND") */
        :new.r_num = REIVIEW.r_num;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert REVIEW_LIKE because REIVIEW does not exist.'
      );
    END IF;

    /* ERwin Builtin Trigger */
    /* MEMBER  REVIEW_LIKE on child insert restrict */
    /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_50", FK_COLUMNS="m_id" */
    SELECT count(*) INTO NUMROWS
      FROM MEMBER
      WHERE
        /* %JoinFKPK(:%New,MEMBER," = "," AND") */
        :new.m_id = MEMBER.m_id;
    IF (
      /* %NotnullFK(:%New," IS NOT NULL AND") */
      
      NUMROWS = 0
    )
    THEN
      raise_application_error(
        -20002,
        'Cannot insert REVIEW_LIKE because MEMBER does not exist.'
      );
    END IF;


-- ERwin Builtin Trigger
END;
/

CREATE  TRIGGER tU_REVIEW_LIKE AFTER UPDATE ON REVIEW_LIKE for each row
-- ERwin Builtin Trigger
-- UPDATE trigger on REVIEW_LIKE 
DECLARE NUMROWS INTEGER;
BEGIN
  /* ERwin Builtin Trigger */
  /* REIVIEW  REVIEW_LIKE on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="0001dd10", PARENT_OWNER="", PARENT_TABLE="REIVIEW"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_49", FK_COLUMNS="r_num" */
  SELECT count(*) INTO NUMROWS
    FROM REIVIEW
    WHERE
      /* %JoinFKPK(:%New,REIVIEW," = "," AND") */
      :new.r_num = REIVIEW.r_num;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update REVIEW_LIKE because REIVIEW does not exist.'
    );
  END IF;

  /* ERwin Builtin Trigger */
  /* MEMBER  REVIEW_LIKE on child update restrict */
  /* ERWIN_RELATION:CHECKSUM="00000000", PARENT_OWNER="", PARENT_TABLE="MEMBER"
    CHILD_OWNER="", CHILD_TABLE="REVIEW_LIKE"
    P2C_VERB_PHRASE="", C2P_VERB_PHRASE="", 
    FK_CONSTRAINT="R_50", FK_COLUMNS="m_id" */
  SELECT count(*) INTO NUMROWS
    FROM MEMBER
    WHERE
      /* %JoinFKPK(:%New,MEMBER," = "," AND") */
      :new.m_id = MEMBER.m_id;
  IF (
    /* %NotnullFK(:%New," IS NOT NULL AND") */
    
    NUMROWS = 0
  )
  THEN
    raise_application_error(
      -20007,
      'Cannot update REVIEW_LIKE because MEMBER does not exist.'
    );
  END IF;


-- ERwin Builtin Trigger
END;
/

