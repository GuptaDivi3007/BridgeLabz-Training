CREATE USER 'gdivya3007@gmail.com'@'%' IDENTIFIED BY 'Divya@1234';

-- Grant a user SELECT and INSERT permission on our database
GRANT SELECT, INSERT ON health_clinic_db.* TO 'gdivya3007@gmail.com'@'%';

-- Revoke a permission
REVOKE INSERT ON health_clinic_db.* FROM 'gdivya3007@gmail.com'@'%';