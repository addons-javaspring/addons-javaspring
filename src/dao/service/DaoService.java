package dao.service;

import java.util.List;

public interface DaoService<T, K> {
  // CRUD
  void save(T data);

  List<T> findAll();

  T findById(K id);

  void update(T data, K id);

  void delete(K id);

}
