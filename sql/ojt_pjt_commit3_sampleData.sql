--DERECTOR TABLE RESET
DELETE FROM DIRECTOR;
--DIRECTOR_CATEGORY TABLE RESET
DELETE FROM DIRECTOR_CATEGORY;
--CINEMA TALBE RESET
DELETE FROM CINEMA;
--COUNTRY TABLE RESET
DELETE FROM COUNTRY;



--DROP SEQUENCE
DROP SEQUENCE C_NUM_SEQ;
DROP SEQUENCE COU_NUM_SEQ;
DROP SEQUENCE AC_CODE_SEQ;
DROP SEQUENCE D_NUM_SEQ;

--CREATE SEQUENCE
CREATE SEQUENCE C_NUM_SEQ;
CREATE SEQUENCE COU_NUM_SEQ;
CREATE SEQUENCE AC_CODE_SEQ;
CREATE SEQUENCE D_NUM_SEQ;

--SELECT SEQUENCE DATA
SELECT  * 
FROM    USER_SEQUENCES
WHERE   SEQUENCE_NAME = UPPER('C_NUM_SEQ');

SELECT  * 
FROM    USER_SEQUENCES
WHERE   SEQUENCE_NAME = UPPER('COU_NUM_SEQ');

SELECT  * 
FROM    USER_SEQUENCES
WHERE   SEQUENCE_NAME = UPPER('AC_CODE_SEQ');

SELECT  * 
FROM    USER_SEQUENCES
WHERE   SEQUENCE_NAME = UPPER('D_NUM_SEQ');

--COUNTRY TABLE TEST DATA
INSERT INTO COUNTRY VALUES (COU_NUM_SEQ.NEXTVAL, 'Korea');
INSERT INTO COUNTRY VALUES (COU_NUM_SEQ.NEXTVAL, 'Japan');
INSERT INTO COUNTRY VALUES (COU_NUM_SEQ.NEXTVAL, 'China');
INSERT INTO COUNTRY VALUES (COU_NUM_SEQ.NEXTVAL, 'USA');
INSERT INTO COUNTRY VALUES (COU_NUM_SEQ.NEXTVAL, 'UK');
INSERT INTO COUNTRY VALUES (COU_NUM_SEQ.NEXTVAL, 'UK, USA');
--COUNTRY TABLE TEST DATA END

--DIRECTOR_CATEGORY TABLE TEST DATA
INSERT INTO DIRECTOR_CATEGORY VALUES (AC_CODE_SEQ.NEXTVAL, 'Park Jungwoo');
INSERT INTO DIRECTOR_CATEGORY VALUES (AC_CODE_SEQ.NEXTVAL, 'Damien Chazelle');
INSERT INTO DIRECTOR_CATEGORY VALUES (AC_CODE_SEQ.NEXTVAL, 'Lee Eonhee');
INSERT INTO DIRECTOR_CATEGORY VALUES (AC_CODE_SEQ.NEXTVAL, 'David Yates');
INSERT INTO DIRECTOR_CATEGORY VALUES (AC_CODE_SEQ.NEXTVAL, 'Edward Zwick');
--DIRECTOR_CATEGORY TABLE TEST DATA END

--CINEMA TABLE TEST DATA
INSERT 		INTO CINEMA (C_NUM, COU_NUM, C_TITLE, C_RUNNINGTIME, C_SUMMARY, C_COUNT, C_AGE, C_ORIGINAL_FILE_NAME, C_STORED_FILE_NAME, C_PLAYDATE)
          VALUES      (C_NUM_SEQ.NEXTVAL, 1, 'Pandora', 136, 'summary test1', 0, 12, 'FNOrigin test1', 'FNStored test1', 161207);
INSERT 		INTO CINEMA (C_NUM, COU_NUM, C_TITLE, C_RUNNINGTIME, C_SUMMARY, C_COUNT, C_AGE, C_ORIGINAL_FILE_NAME, C_STORED_FILE_NAME, C_PLAYDATE)
          VALUES      (C_NUM_SEQ.NEXTVAL, 4, 'La La Land', 127, 'summary test2', 0, 12, 'FNOrigin test2', 'FNStored test2', 161207);
INSERT 		INTO CINEMA (C_NUM, COU_NUM, C_TITLE, C_RUNNINGTIME, C_SUMMARY, C_COUNT, C_AGE, C_ORIGINAL_FILE_NAME, C_STORED_FILE_NAME, C_PLAYDATE)
          VALUES      (C_NUM_SEQ.NEXTVAL, 1, 'Missing', 100, 'summary test3', 0, 15, 'FNOrigin test3', 'FNStored test3', 161130);
INSERT 		INTO CINEMA (C_NUM, COU_NUM, C_TITLE, C_RUNNINGTIME, C_SUMMARY, C_COUNT, C_AGE, C_ORIGINAL_FILE_NAME, C_STORED_FILE_NAME, C_PLAYDATE)
          VALUES      (C_NUM_SEQ.NEXTVAL, 6, 'Fantastic Beasts and Where to Find Them', 132, 'summary test4', 0, 12, 'FNOrigin test4', 'FNStored test4', 161116);
INSERT 		INTO CINEMA (C_NUM, COU_NUM, C_TITLE, C_RUNNINGTIME, C_SUMMARY, C_COUNT, C_AGE, C_ORIGINAL_FILE_NAME, C_STORED_FILE_NAME, C_PLAYDATE)
          VALUES      (C_NUM_SEQ.NEXTVAL, 4, 'Jack Reacher : Never Go Back', 118, 'summary test4', 0, 15, 'FNOrigin test4', 'FNStored test4', 161130);
--CINEMA TABLE TEST DATA END

--DIRECTOR TABLE TEST DATA
INSERT INTO DIRECTOR VALUES (D_NUM_SEQ.NEXTVAL, 1, 1);
INSERT INTO DIRECTOR VALUES (D_NUM_SEQ.NEXTVAL, 2, 2);
INSERT INTO DIRECTOR VALUES (D_NUM_SEQ.NEXTVAL, 3, 3);
INSERT INTO DIRECTOR VALUES (D_NUM_SEQ.NEXTVAL, 4, 4);
INSERT INTO DIRECTOR VALUES (D_NUM_SEQ.NEXTVAL, 5, 5);
--DIRECTOR TABLE TEST DATA END


commit;