package dao.repository;

import java.util.ArrayList;
import java.util.List;

import dao.model.Test;
import dao.service.DaoService;

public class TestRepository implements DaoService<Test, Integer> {
  List<Test> testsBook = new ArrayList<>();

  @Override
  public void save(Test data) {
    // TODO Auto-generated method stub
    testsBook.add(data);
  }

  @Override
  public List<Test> findAll() {
    // TODO Auto-generated method stub
    return testsBook;
  }

  @Override
  public Test findById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void update(Test data, Integer id) {
    // TODO Auto-generated method stub

  }

  @Override
  public void delete(Integer id) {
    // TODO Auto-generated method stub

  }

}
