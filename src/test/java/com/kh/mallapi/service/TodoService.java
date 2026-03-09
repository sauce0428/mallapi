package com.kh.mallapi.service;

import com.kh.mallapi.dto.TodoDTO;

public interface TodoService {
	Long register(TodoDTO todoDTO);

	void modify(TodoDTO todoDTO);

	void remove(Long tno);
	
	TodoDTO get(Long tno);
}
