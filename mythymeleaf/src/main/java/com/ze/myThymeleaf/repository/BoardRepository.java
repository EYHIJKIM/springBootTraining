package com.ze.myThymeleaf.repository;


import com.ze.myThymeleaf.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> { /*<VO클래스, pk타입>*/


}
