package com.college.collegedb.service;

import com.college.collegedb.dto.FacultyDTO;
import com.college.collegedb.entity.Faculty;
import com.college.collegedb.exception.ResourceNotFoundException;
import com.college.collegedb.mapper.FacultyMapper;
import com.college.collegedb.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final StudentService studentService; //facultyService need StudentService
    private final FacultyRepository facultyRepository;
    private final FacultyMapper facultyMapper;

    public FacultyServiceImpl(FacultyRepository facultyRepository,FacultyMapper facultyMapper,
                              StudentService studentService) {
        this.facultyRepository = facultyRepository;
        this.facultyMapper = facultyMapper;
        this.studentService = studentService;
    }

    @Override
    public FacultyDTO getFacultyById(Integer id){
        Faculty getFacultyEntity = facultyRepository.getReferenceById(id);
        return facultyMapper.toDTO(getFacultyEntity);
    }

    @Override
    public List<FacultyDTO> getAllFaculty(){
        return facultyRepository.findAll()
                .stream()
                .map(facultyMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public FacultyDTO createFaculty(FacultyDTO facultyDTO){
        Faculty entity = facultyMapper.toEntity(facultyDTO);
        return facultyMapper.toDTO(facultyRepository.save(entity));

    }

    @Override
    public void deleteFacultyById(Integer id){
        if(id==null){
            throw new ResourceNotFoundException(id);
        }
        facultyRepository.deleteById(id);
        return;
    }

    @Override
    public FacultyDTO updateFaculty(FacultyDTO facultyDTO){
        Faculty existingFacultyEntity = facultyRepository.findById(facultyDTO.getFacultyId())
                .orElseThrow(() -> new RuntimeException("Faculty not found"));
        Faculty updatedFacultyEntity = facultyMapper.updateEntityFromDTO(facultyDTO,existingFacultyEntity);
        Faculty savedFacultyEntity = facultyRepository.save(updatedFacultyEntity);
        return facultyMapper.toDTO(savedFacultyEntity);
    }
}