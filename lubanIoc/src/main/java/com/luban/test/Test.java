package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @date 2019/5/20 - 15:00
 */
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
		annotationConfigApplicationContext.register(Appconfig.class);
		/**
		 * 分析具体注解,并实例化
		 */
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.getBean(IndexDao.class);
	}
}
