package com.hanigone.hanigone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hanigone.hanigone.mapper.HMapper;
import com.hanigone.hanigone.service.HService;


@Service
@Transactional
public class HServiceImpl implements HService {

	@Autowired
	public HMapper hMapper;

	
}
