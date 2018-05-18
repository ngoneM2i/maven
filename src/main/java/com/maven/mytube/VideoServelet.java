package com.maven.mytube;

import java.io.IOException;

import javax.persistence.metamodel.SetAttribute;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VideoServelet
 */
//@WebServlet("/video/id")
@WebServlet("/VideoServelet")
public class VideoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoServelet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		VideoRepository videoRepo = new VideoRepository();
		Video MyVideo = videoRepo.findVideoById(1); 
		request.setAttribute("MyVideo", MyVideo);
		
		Video MyVideo2 = videoRepo.findVideoWithComments(1); 
		request.setAttribute("MyVideo2", MyVideo2);
		
	
		request.getRequestDispatcher("/videoHibernate.jsp").forward(request, response);
	}
			
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
