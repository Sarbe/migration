package com.amtrix.migration.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "application")
@Getter
@Setter
@NoArgsConstructor
public class App {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String column0;
	private String column1;
	private String column2;
	private String column3;
	private Date column4;
	private Date column5;
	private String column6;
	private String column7;

	public App(String column0, String column1, String column2, String column3, Date column4, Date column5,
			String column6, String column7) {
		super();
		this.column0 = column0;
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
		this.column4 = column4;
		this.column5 = column5;
		this.column6 = column6;
		this.column7 = column7;
	}

	public App(String column0, String column1, String column2, String column3, Date column4, Date column5) {
		super();
		this.column0 = column0;
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
		this.column4 = column4;
		this.column5 = column5;
	}

}
