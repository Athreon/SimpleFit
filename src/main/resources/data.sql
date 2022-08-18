-- INSERT USERS/ COACHES  -------------------------------------------
INSERT INTO users (id, role, email, password, username)
VALUES (1, 'ADMIN', 'adming@mmm.com', 'admin123', 'username');
INSERT INTO users (id, email, password, username, role, user_experience)
VALUES (2, 'userexample@mmm.com', '123456', 'userexample', 'USER', 'GYMRAT');
INSERT INTO coaches (id, email, password, username, age, first_name, last_name, role)
VALUES (3, 'coachexample@mmm.com', '123456', 'coachexample', '22', 'Kobrata', 'Pulev', 'COACH');


