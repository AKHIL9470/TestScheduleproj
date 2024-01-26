package com.imarticus.intest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Tests implements Serializable,Comparable<Tests>{
	private int testCode;
	private String testName;
	private Date testDate;
	private int testDuration;
	private int testMarks;
	private int questionCount;
	/**
	 * @return the testCode
	 */
	public int getTestCode() {
		return testCode;
	}
	/**
	 * @param testCode the testCode to set
	 */
	public void setTestCode(int testCode) {
		this.testCode = testCode;
	}
	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}
	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/**
	 * @return the testDate
	 */
	public Date getTestDate() {
		return testDate;
	}
	/**
	 * @param testDate the testDate to set
	 */
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	/**
	 * @return the testDuration
	 */
	public int getTestDuration() {
		return testDuration;
	}
	/**
	 * @param testDuration the testDuration to set
	 */
	public void setTestDuration(int testDuration) {
		this.testDuration = testDuration;
	}
	/**
	 * @return the testMarks
	 */
	public int getTestMarks() {
		return testMarks;
	}
	/**
	 * @param testMarks the testMarks to set
	 */
	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}
	/**
	 * @return the questionCount
	 */
	public int getQuestionCount() {
		return questionCount;
	}
	/**
	 * @param questionCount the questionCount to set
	 */
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	@Override
	public String toString() {
		return "Tests [testCode=" + testCode + ", testName=" + testName + ", testDate=" + testDate + ", testDuration="
				+ testDuration + ", testMarks=" + testMarks + ", questionCount=" + questionCount + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(questionCount, testCode, testDate, testDuration, testMarks, testName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Tests)) {
			return false;
		}
		Tests other = (Tests) obj;
		return questionCount == other.questionCount && testCode == other.testCode
				&& Objects.equals(testDate, other.testDate) && testDuration == other.testDuration
				&& testMarks == other.testMarks && Objects.equals(testName, other.testName);
	}
	@Override
	public int compareTo(Tests o) {
		@SuppressWarnings("removal")
		int result=new Integer(testCode).compareTo(new Integer(o.getTestCode()));
		// 0 <0 >0
		return result;
	}
}

