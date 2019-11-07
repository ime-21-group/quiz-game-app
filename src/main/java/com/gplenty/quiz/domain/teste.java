package com.gplenty.quiz.domain;

import java.util.List;

import com.gplenty.quiz.daos.UserDao;

public class teste {

	public static void main (String[] args) {
	UserDao ud = new UserDao();
		
	List<User> users = ud.retrieveByUsarnameAndPassword("Gabriel", "borginhosS2");
	
	QuizDao quizdao = new QuizDao();
	//Quiz quiz = new Quiz();
	//quiz = quizdao.retrieveById(3);
	
	List<Quiz> quizes = quizdao.retrieveByQuizName("SegundoQuiz");
	
	
	for(Quiz quiz: quizes) {
	System.out.println(quiz.getQuiz_id() +"  "+ quiz.getAuthor().getUsername() +"  "+ quiz.getQuizName() +"  "+ quiz.getSubject() +" "+ quiz.getSubjectMatter());
	}	

}
		
}
