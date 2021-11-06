package com.ze.myThymeleaf.controller;

import com.ze.myThymeleaf.model.Board;
import com.ze.myThymeleaf.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/list")
    public String list(Model model) {
        List<Board> boardList = boardRepository.findAll(); /*모든 데이터를 가져온다*/
        model.addAttribute("boardList", boardList);
        return "board/list";
    }

}
