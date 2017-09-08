CREATE PROCEDURE TEST_INSERT_USER (
	IN p_id int,
	IN p_name varchar(100),
	IN p_age int
)
BEGIN
	INSERT INTO USER (ID, NAME, AGE)
VALUES
	(p_id, p_name, p_age);

END;