package com.regan.optional;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.regan.bean.Employee;

public class TestOptional {
	/**
	 * 如果当前的对象是null,会throw NoSuchElementException
	 */
	@Test
	public void testOfNullable() {
		Optional<Object> optional = Optional.ofNullable(null);
		// java.util.NoSuchElementException: No value present
		System.out.println(optional.get());
	}

	@Test
	public void test() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\test.txt")));
			List<String> collect = reader.lines().collect(Collectors.toList());
			collect.forEach(item->System.out.println(item));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
