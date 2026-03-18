package com.kh.mallapi.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.mallapi.dto.ProductDTO;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class ProductServiceTests {

	@Autowired
	ProductService productService;


	@Test
	public void testRead() {
		// 실제 존재하는 번호로 테스트(DB에서 확인)
		Long pno = 9L;
		ProductDTO productDTO = productService.get(pno);
		log.info(productDTO);
		log.info(productDTO.getUploadFileNames());
	}
}
