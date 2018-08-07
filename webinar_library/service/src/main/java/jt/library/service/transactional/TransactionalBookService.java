package jt.library.service.transactional;

import jt.library.model.dao.Dao;
import jt.library.model.entity.Book;
import jt.library.service.BookService;

import java.util.List;

public class TransactionalBookService implements BookService {
     private Dao<Book> bookDao;

    public TransactionalBookService(Dao<Book> bookDao) {
        this.bookDao = bookDao;
    }

    public void saveOrUpdate(Book persistent) {
        bookDao.saveOrUpdate(persistent);

    }

    public void delete(Long id) {

    }

    public void delete(Book persistent) {

    }

    public Book get(Long id) {
        return null;
    }

    public List<Book> getAll() {
        return null;
    }
}
