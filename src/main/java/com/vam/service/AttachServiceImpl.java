package com.vam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.AttachMapper;
import com.vam.model.AttachImageVO;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class AttachServiceImpl implements AttachService {

	@Autowired
	private AttachMapper attachMapper;

	@Override
	public List<AttachImageVO> getAttachList(int bookId) {
		log.info("getAttachList.........");

		return attachMapper.getAttachList(bookId);
	}

}
