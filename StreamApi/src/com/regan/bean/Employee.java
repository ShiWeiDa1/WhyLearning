package com.regan.bean;

import com.regan.enums.WorkStatus;

/**
 * @author regan
 */
public class Employee {
	private Long empId;
	private String name;
	private Integer age;
	private Integer salary;
	private WorkStatus workStatus;

	public Employee() {
	}

	public Employee(Long empId, String name, Integer age, Integer salary) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", workStatus="
				+ workStatus + "]";
	}

	public WorkStatus getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(WorkStatus workStatus) {
		this.workStatus = workStatus;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
