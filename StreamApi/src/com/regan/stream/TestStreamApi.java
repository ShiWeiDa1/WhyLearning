package com.regan.stream;

import java.util.stream.Stream;

import org.junit.Test;

import com.regan.bean.Employee;

/**
 * 学习Stream的操作
 * @author regan
 *
 */
public class TestStreamApi {

	@Test
	public void testCreateStream() {
		/**
		 * Stream 的创建方式
		 */
		//1.Stream.of的方式创建流
		Stream stream = Stream.of("1","tom",3,"sandy");
		
		//
	}
	
}
