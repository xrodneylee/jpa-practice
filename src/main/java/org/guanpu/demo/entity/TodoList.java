package org.guanpu.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "TODO_LIST")
@XmlAccessorType(XmlAccessType.FIELD)
public class TodoList {
	
	@Id
	@GeneratedValue
	@XmlTransient
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@XmlElement
	@Column(name = "ITEM")
	private String item;
	
	@XmlElement
	@Column(name = "DETAIL")
	private String detail;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getItem() {
		return this.item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public String getDetail() {
		return this.detail;
	}
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
