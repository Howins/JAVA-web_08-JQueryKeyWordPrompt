package com.demo.dao;

import java.sql.SQLException;
import java.util.List;

import com.demo.bean.Word;

public interface WordDao {
	/**
	 * 用于检测当前输入的关键字是否存在数据库
	 * 
	 * @param word
	 * @return 返回找到的关键字列表
	 */
	List<Word> checkWord(String word) throws SQLException;
}
