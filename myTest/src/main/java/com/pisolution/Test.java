package com.pisolution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description
 * @Author weicai.yan
 * @Date 2020/9/6 16:53
 * @Version 1.0
 **/
public class Test {

	public static void main(String[] args) {
		/**
		 * 1.创建工厂对象
		 * 2.创建默认加载器
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		/**
		 * 分析配置注解
		 */
		annotationConfigApplicationContext.register(AppConfig.class);
		/**
		 * 分析具体注解并实例化
		 */
		annotationConfigApplicationContext.refresh();
		TestService testService = annotationConfigApplicationContext.getBean(TestService.class);
		testService.test();
	}
}
