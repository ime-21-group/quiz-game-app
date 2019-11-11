package com.gplenty.quiz.connection.messageBuilders;

import com.gplenty.quiz.domain.Question;
import com.gplenty.quiz.domain.Quiz;

public class QuizMessageBuilder {
	public static String build(Quiz quiz)
	{
		StringBuilder result = new StringBuilder();
		String name = quiz.getQuizName();
		String subject = quiz.getSubject();
		String subjectMatter = quiz.getSubjectMatter();
		String author = quiz.getAuthor().getUsername();
		
		result.append("{name:" + name + ";subject:" + subject + ";subjectMatter:" + subjectMatter
					+ ";author:" + author + ";questions:[");
		
		for (Question question : quiz.getQuestions()) 
		{
			result.append(QuestionMessageBuilder.build(question));
		}
		
		result.append("]}");
		
		return result.toString();
	}
}
