CREATE OR REPLACE PROCEDURE TEST_INSERT_USER(p_id IN INT,
                                              p_name IN VARCHAR2,
                                              p_age IN INT)
IS
BEGIN
  insert into USER (ID, NAME, AGE) values (p_id, p_name, p_age);
END TEST_INSERT_USER;