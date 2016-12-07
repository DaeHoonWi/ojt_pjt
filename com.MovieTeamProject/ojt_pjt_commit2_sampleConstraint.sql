--DROP CONSTRAINT
ALTER TABLE CINEMA DROP CONSTRAINT FK_CINEMA_COU_NUM CASCADE;

--CINEMA - COUNTRY CONSTRAINT
ALTER TABLE CINEMA
ADD CONSTRAINT FK_CINEMA_COU_NUM FOREIGN KEY(COU_NUM) 
REFERENCES COUNTRY(COU_NUM);
--CINEMA - COUNTRY END

COMMIT;