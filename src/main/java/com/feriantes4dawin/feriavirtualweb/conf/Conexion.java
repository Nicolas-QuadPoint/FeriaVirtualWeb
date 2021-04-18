package com.feriantes4dawin.feriavirtualweb.conf;

import java.sql.Connection;
import java.sql.SQLException;

import  javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Conexion {


	@Autowired
	private  DataSource ds;
	
	public Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}
