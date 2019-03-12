package com.admin.file.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tool.FileUtils;
import com.tool.GeneralReturn;

import net.sf.json.JSONObject;

/**
 * @since file upload class
 * @author HuWang
 * 
 */
@RestController
@RequestMapping("/admin/File/")
public class FileController {

	/*
	 * @Autowired private UserInfo user;
	 */
	/**
	 * @since file upload method
	 * @param request
	 * @param file
	 * @param session
	 * @return
	 */
	@RequestMapping("/upload_File")
	public GeneralReturn upload_File(HttpServletRequest request,
			MultipartFile file, HttpSession session) {
		JSONObject resJson = new JSONObject();
		String path = request.getServletContext().getRealPath("/");
		System.out.println("path==" + path);
		String path2 = FileUtils.uploads(file, path);
		return GeneralReturn.build(1, "success", path2);
	}

}
