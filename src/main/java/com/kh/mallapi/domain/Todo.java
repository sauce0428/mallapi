package com.kh.mallapi.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tbl_todo")  
@SequenceGenerator(name ="TODO_SEQ_GEN", // 시퀀스 제너레이터 이름 
	sequenceName = "TODO_SEQ", // 시퀀스 이름  
	initialValue = 1,  // 시작값 
	allocationSize = 1) // 메모리를 통해 할당할 범위 사이즈 
@Getter 
@ToString  
@Builder  
@AllArgsConstructor 
@NoArgsConstructor 
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_SEQ_GEN") 
	private Long tno; 
	private String title; 
	private String writer; 
	private boolean complete; 
	private LocalDate dueDate;
	
	public void changeTitle(String string) {
		// TODO Auto-generated method stub
		
	}
	public void changeComplete(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void changeDueDate(LocalDate of) {
		// TODO Auto-generated method stub
		
	}
}
