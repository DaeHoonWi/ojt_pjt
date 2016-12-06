
--CINEMA TABLE TEST DATA
INSERT INTO CINEMA (C_NUM, COU_NUM, C_TITLE, C_RUNNINGTIME, C_SUMMARY 
                    , C_COUNT, C_AGE, C_ORIGINAL_FILE_NAME, C_STORED_FILE_NAME, C_PLAYDATE)
            VALUES (C_NUM_SEQ.NEXTVAL
            , 1
            , 'TESTTITLE'
            , 123
            , 'TESTTESTTEST'
            , 1
            , 1
            , 'TEST'
            , 'TEST'
            , 161206
            );
--CINEMA TABLE TEST DATA END

--COUNTRY TABLE TEST DATA            
INSERT INTO COUNTRY (COU_NUM, COU_NAME)
            VALUES (COU_NUM_SEQ.NEXTVAL, 'USA');
--COUNTRY TABLE TEST DATA END