package com.luban.test;

import com.luban.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.Applet;

/**
 * @author
 * @date 2019/5/12 - 13:21
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register();
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.getBean(IndexDao.class);
	}
}
