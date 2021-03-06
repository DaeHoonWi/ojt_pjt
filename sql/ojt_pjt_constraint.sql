ALTER TABLE CINEMA
ADD CONSTRAINT FK_CINEMA_COU_NUM FOREIGN KEY(COU_NUM) 
REFERENCES COUNTRY(COU_NUM);

--CINEMA END

ALTER TABLE ACTOR
ADD CONSTRAINT FK_ACTOR_AC_CODE FOREIGN KEY(AC_CODE) 
REFERENCES ACTOR_CATEGORY(AC_CODE);

ALTER TABLE ACTOR
ADD CONSTRAINT FK_ACTOR_C_NUM FOREIGN KEY(C_NUM) 
REFERENCES CINEMA(C_NUM);

--ACTOR END

ALTER TABLE GENRE
ADD CONSTRAINT FK_GENRE_GC_CODE FOREIGN KEY(GC_CODE)
REFERENCES GENRE_CATEGORY(GC_CODE);

ALTER TABLE GENRE
ADD CONSTRAINT FK_GENRE_C_NUM FOREIGN KEY(C_NUM)
REFERENCES CINEMA(C_NUM);

--GENRE END

ALTER TABLE DIRECTOR
ADD CONSTRAINT FK_DIRECTOR_DC_CODE FOREIGN KEY(DC_CODE)
REFERENCES DIRECTOR_CATEGORY(DC_CODE);

ALTER TABLE DIRECTOR
ADD CONSTRAINT FK_DIRECTOR_C_NUM FOREIGN KEY(C_NUM)
REFERENCES CINEMA(C_NUM);

--DIRECTOR END

COMMIT;