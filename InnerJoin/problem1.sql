SELECT * FROM student 
INNER JOIN class ON class.class_title = student.class_title
--WHERE class.id = 1;