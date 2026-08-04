CREATE INDEX idx_covering_doctor_report
ON appointments (doctor_id, appointment_date, status);

EXPLAIN SELECT doctor_id, appointment_date, status
FROM appointments
WHERE doctor_id = 5
ORDER BY appointment_date;