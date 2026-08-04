USE health_clinic_db;

CREATE TABLE rooms (
    room_id INT AUTO_INCREMENT PRIMARY KEY,
    room_number VARCHAR(10) NOT NULL UNIQUE,
    floor INT,
    room_type ENUM('Consultation', 'Procedure', 'Lab') DEFAULT 'Consultation'
);

-- Doctor <-> Room (M:N junction table)
CREATE TABLE doctor_room (
    doctor_id INT,
    room_id INT,
    PRIMARY KEY (doctor_id, room_id),
    FOREIGN KEY (doctor_id) REFERENCES doctors(doctor_id) ON DELETE CASCADE,
    FOREIGN KEY (room_id) REFERENCES rooms(room_id) ON DELETE CASCADE
);