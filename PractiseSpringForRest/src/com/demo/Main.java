package com.demo;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= "com.demo")
public class Main {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.prints();

	}

}
