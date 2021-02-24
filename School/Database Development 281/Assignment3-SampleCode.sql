----------------------------Question 1---------------------------------------

--While Loop
WHILE <condition>
LOOP
    <statements>
END LOOP

--For Loop
--Numeric FOR Loop
FOR <condition> IN <lower_bound_value> .. <upper_bound_value>
  LOOP
     <statements>;
  END LOOP;

--Cursor FOR Loop
FOR <condition> IN (
     SELECT * FROM <table_name> WHERE <select_condition>)
LOOP
     <statements>;
END LOOP;

--IF..ELSE Loop
IF <condition>
THEN
--condition met
   <statements>;
ELSE
--condition not met
   <statements>;
END IF;

--CASE Statements
CASE <experession>
	WHEN <condition1> THEN
	   <statements>
	WHEN <condition2>  THEN
	   <statements>
	WHEN <condition3>  THEN
	   <statements>
	...
	ELSE
	   <statements>
END CASE;


----------------------------Question 2---------------------------------------
--Variable Declaration

--Oracle Declaration
DECLARE <variable_name1> DATATYPE;
		<variable_name2> DATATYPE;
		<variable_name3> DATATYPE;

--MS SQL Server Declaration
DECLARE @<variable_name1> DATATYPE,
		@<variable_name2> DATATYPE,
		@<variable_name3> DATATYPE

--Creating Stored Procedures

--Oracle Procedure
CREATE PROCEDURE <procedure_name>
(
	<parameterl IN/OUT <datatype>
)
[ IS | AS ]
	<declaration>
BEGIN
	<execution part>
EXCEPTION
	<exception handling>
END;

--MS SQL Server Procedure
CREATE PROCEDURE <procedure_name>
(
	<parameters>
)
AS
	<sql_statement>
GO;

--Using built-in functions

--Oracle built-in functions
SELECT SUBSTR('aeroplane',5,9) 
FROM tblPlanes

--MS SQL Server built-in functions
SELECT SUBSTRING('aeroplane',5,9) 
FROM tblPlanes
