package com.pisolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BeanService
 * @Description
 * @Author weicai.yan
 * @Date 2020/9/7 14:42
 * @Version 1.0
 **/
@Service
public class BeanService {

	@Autowired
	private IndexService indexService;
}
