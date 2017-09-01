package cn.wangtao34.output;

/**
 * 
 * @author wangtao34
 * @time 2017年8月4日 上午11:28:22
 */
public class OutputHelper {
	IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
