package com.wpengkang.springboot.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneratorDisplayUtil {
   
	private final Logger log =  LoggerFactory.getLogger(GeneratorDisplayUtil.class);
	
	public static void main(String[] args) {
		GeneratorDisplayUtil util = new GeneratorDisplayUtil();
		util.generator();
	}

	public void generator(){
		try{
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			//指定逆向工程配置文件
			File configFile = new File("src/main/resources/generatorConfig.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myGenerator = new MyBatisGenerator(config, callback, warnings);
			myGenerator.generate(null);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
