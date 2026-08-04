EXPLAIN SELECT * FROM appointments WHERE status = 'Completed';

EXPLAIN SELECT * FROM appointments WHERE patient_id = 250;

EXPLAIN SELECT * FROM appointments
WHERE doctor_id = 5 AND appointment_date BETWEEN '2026-01-01' AND '2026-01-02';