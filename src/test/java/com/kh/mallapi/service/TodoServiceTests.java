package com.kh.mallapi.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.mallapi.dto.TodoDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoServiceTests {
	@Autowired
	private TodoService todoService;

	@Test
	public void testGet() {
		Long tno = 101L;
		TodoDTO todoDTO = todoService.get(tno);
		log.info(todoDTO);
	}
}