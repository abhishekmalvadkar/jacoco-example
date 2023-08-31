package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Always remember that we have to write unit test for business logic only, don't write pointless
 * unit test like for this class we don't have to write unit test because here we don't have any business logic
 * so to get coverage for this class don't jump and start writing unit test
 *
 * If yod don't need to write unit test for some classes then you have to tell those classes to
 * jacoco, so it will not include those classes in total coverage count so your coverage will increase,
 * and you don't need to write pointless unit tests
 *
 * Always remember jacoco creates coverage from your class files not from your source files
 * Always remember jacoco looks your class files and folders but not your sources files and packages
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
