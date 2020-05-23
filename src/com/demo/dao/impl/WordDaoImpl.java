package com.demo.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.swing.text.Utilities;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.demo.bean.Word;
import com.demo.dao.WordDao;
import com.demo.util.JDBCUtil;

public class WordDaoImpl implements WordDao {

	public List<Word> checkWord(String word) throws SQLException {

		// 1. 拿数据池，并且准备查询
		QueryRunner qr = new QueryRunner(JDBCUtil.getDataSource());
		// //2. 查询个数，返回结果为数据
		// Long result = (Long) qr.query("select count(*) from t_usr where
		// username=?", new ScalarHandler(), word);
		// //3. 判断数据是否大于0
		// return result > 0;
		String sql = "select * from t_word where word like ?";
		return qr.query(sql, new BeanListHandler<Word>(Word.class), word + "%");
	}

}
