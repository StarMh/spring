package cn.wangtao34.spring;

import junit.framework.Test;

import junit.framework.TestCase;

import junit.framework.TestSuite;

import java.util.prefs.BackingStoreException;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wangtao34.output.OutputHelper;

/**
 * 
 * Unit test for simple App.
 * 
 */

public class AppTest

		extends TestCase

{

	/**
	 * 
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 * 
	 */

	public AppTest(String testName)

	{

		super(testName);

	}

	/**
	 * 
	 * @return the suite of tests being tested
	 * 
	 */

	public static Test suite()

	{

		return new TestSuite(AppTest.class);

	}

	/**
	 * 
	 * Rigourous Test :-)
	 * 
	 */

	public void testApp()

	{

		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		App at = (App) bf.getBean("app");
		System.out.println(at.getPerson().getName());
		System.out.println(at.getPerson().getAge());
		
		HelloWorld helloWorld = (HelloWorld) bf.getBean("helloBean");
		helloWorld.printHello();
		
		OutputHelper outputHelper = (OutputHelper) bf.getBean("outputHelperBean");
		outputHelper.generateOutput();

		assertTrue(true);

	}

}
