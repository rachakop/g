CREATE TABLE vacation (
  id INT AUTO_INCREMENT(1,5) NOT NULL,
   name VARCHAR(255),
   num INT,
   hj BOOLEAN,
   CONSTRAINT pk_vacation PRIMARY KEY (id)
);

--ALTER TABLE vacation AUTO_INCREMENT = 10001;

--CREATE SEQUENCE article_seq
--  START WITH 50
--  INCREMENT BY 50;
CREATE TABLE leave (
  id BIGINT AUTO_INCREMENT NOT NULL,
   start_date TIMESTAMP,
   end_date TIMESTAMP,
   number_of_leaves_approved INT,
   CONSTRAINT pk_leave PRIMARY KEY (id)
);

--ALTER TABLE leave AUTO_INCREMENT = 10001;

CREATE TABLE department (
  id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255),
   CONSTRAINT pk_department PRIMARY KEY (id)
);


CREATE TABLE employee (
  id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255),
   age INT,
   department_id BIGINT,
   CONSTRAINT pk_employee PRIMARY KEY (id)
);

ALTER TABLE employee ADD CONSTRAINT FK_EMPLOYEE_ON_DEPARTMENT FOREIGN KEY (department_id) REFERENCES department (id);


CREATE TABLE phone (
  id BIGINT AUTO_INCREMENT NOT NULL,
   number VARCHAR(255),
   employee_id BIGINT,
   CONSTRAINT pk_phone PRIMARY KEY (id)
);

ALTER TABLE phone ADD CONSTRAINT FK_PHONE_ON_EMPLOYEE FOREIGN KEY (employee_id) REFERENCES employee (id);