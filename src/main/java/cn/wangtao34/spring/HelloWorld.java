package cn.wangtao34.spring;

/**
 * 
 * @author wangtao34
 * @time 2017年8月4日 上午11:13:33
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}
}
