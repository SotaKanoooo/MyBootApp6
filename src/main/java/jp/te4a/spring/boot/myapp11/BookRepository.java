package jp.te4a.spring.boot.myapp11;

import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.List;


public interface BookRepository extends JpaRepository<BookBean, Integer>{

}