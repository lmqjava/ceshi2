package com.car.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.car.pojo.LbImage;
import com.car.service.ContentService;
import com.car.utils.LayUiUtils;

@Controller
public class LbimageController {

	@Autowired
	private ContentService contentService;
	
/*	@RequestMapping("/selectAll2")
	public String selectAll(@RequestParam(name = "pn", defaultValue = "1") Integer pn,Model model){
		PageHelper.startPage(pn, 5);
		List<LbImage> imgList=contentService.selectAll();
		PageInfo<LbImage> pageInfo=new PageInfo<>(imgList);
		System.out.println(pageInfo);
		model.addAttribute("pageInfo", pageInfo);
		return "guanggaoimg";
	}*/
	
	@RequestMapping("/selectAll")
	@ResponseBody
	public LayUiUtils selectAll(@RequestParam(name="page", defaultValue="1") int pageNum, @RequestParam(name="limit", defaultValue="10") int pageSize){
		LayUiUtils utils = contentService.selectAll(pageNum,pageSize);
		return utils;
	}
	
	@RequestMapping("/addImg")
	public String addUser(LbImage lbImage,MultipartFile file,HttpServletRequest request) throws IOException {

		String filePath = request.getSession().getServletContext().getRealPath("/upload");; //定义图片上传后的路径
		String newFileName = fileOperate(file,filePath);
		lbImage.setLbImg(newFileName);
		
		contentService.insertLbImage(lbImage);
		return "tj_tupian";
	}
	
	
	@RequestMapping("/toUpdateUser")
	public String toUpdateUserPage(Integer imgId,ModelMap map) {
		System.out.println("id:"+imgId);
		LbImage lbImage = contentService.selectById(imgId);
		
		map.addAttribute("lbImage",lbImage);
		return "xg_img";
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public void updateUser(@RequestParam(name="imgId")Integer imgId,
			@RequestParam(name="imgAddress")String  imgAddress,
			@RequestParam(name="lbImg")String lbImg,
			MultipartFile file,HttpServletRequest request) throws Exception{
		imgAddress = new String(imgAddress.getBytes("iso-8859-1"), "UTF-8");
		LbImage lbImage=new LbImage(imgId, imgAddress, lbImg);
		
		String filePath = request.getSession().getServletContext().getRealPath("/upload");; //定义图片上传后的路径
		System.out.println(filePath);
	/*	String newFileName = fileOperate(file,filePath);
		System.out.println(newFileName);
		lbImage.setLbImg(newFileName);*/
		
		contentService.updateLbImage(lbImage);
		/*return "redirect:/rtj_tupian";*/
	}
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public void deleteUser(@RequestParam("id")Integer imgId) {
		System.out.println("id"+imgId);
		contentService.deleteLbImage(imgId);
		
	}

	private String fileOperate(MultipartFile file,String filePath) {
		String originalFileName = file.getOriginalFilename();

		String newFileName = UUID.randomUUID()+originalFileName;  
		
		File targetFile = new File(filePath,newFileName); 
		try {
			file.transferTo(targetFile); 
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}   
		return newFileName;
	}
}
