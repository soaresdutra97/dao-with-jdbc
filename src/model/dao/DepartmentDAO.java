package model.dao;

import entities.Department;

import java.util.List;

public interface DepartmentDAO {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer Id);
    List<Department> findAll();

}
