package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.bean.Word;
import com.demo.dao.WordDao;
import com.demo.dao.impl.WordDaoImpl;

/**
 * Servlet implementation class FindWordServlet
 */
public class FindWordServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//1.获取参数
			String word = request.getParameter("word");
			//2.查询结果
			WordDao dao = new WordDaoImpl();
			List<Word> wordList = dao.checkWord(word);
			request.setAttribute("wordList", wordList);
			request.getRequestDispatcher("list.jsp").forward(request, response);
//			response.setContentType("text/html;charset=utf-8");
//			response.getWriter().write("返回了数据");
			
			for (Word word2 : wordList) {
				System.out.println(word2.getWord());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
