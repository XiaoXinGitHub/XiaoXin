package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.SchoolMateMapper;
import edu.hunau.love.pojo.SchoolMate;
import edu.hunau.love.service.SchoolMateBiz;
@Service
public class SchoolMateBizImpl implements SchoolMateBiz {
	@Autowired
	private SchoolMateMapper schoolMateMapper;
	@Override
	public List<SchoolMate> findAllAlreadyChecked() {
		List<SchoolMate> list = schoolMateMapper.selectAllAlreadyChecked();
		return list;
	}
	@Override
	public void insertImg(SchoolMate schoolmate) {
		schoolMateMapper.insert(schoolmate);
	}

}
