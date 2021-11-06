package com.ze.myThymeleaf.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  /*DB연결 시 VO라는 것을 알려주기 위한 어노테이션*/
@Data /*lombok 라이브러리의 아노테이션, getter, setter없이도 vo관리를 용이하게 함*/
public class Board {

    @GeneratedValue(strategy = GenerationType.IDENTITY) /*DB의 auto-increment 값을 알아서 증가시켜주는..?*/
    @Id /*pk를 알려줌 - id*/
    private Long id;        /*글 번호, PK*/
    private String title;   /*글 제목*/
    private String content; /*글 내용*/
    private String writer;  /*글쓴이*/


}
