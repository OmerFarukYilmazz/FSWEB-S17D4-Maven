package com.workintech.sqlintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class SqlIntroApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		String jdbcUrl = "jdbc:mysql://localhost:3306/postgres"; // Veritabanı ismini değiştirin
		String username = "root"; // MySQL kullanıcı adınız
		String password = "OM5321er?_"; // MySQL şifreniz

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
			if (connection != null) {
				System.out.println("Bağlantı başarılı!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SpringApplication.run(SqlIntroApplication.class, args);

	}

}
