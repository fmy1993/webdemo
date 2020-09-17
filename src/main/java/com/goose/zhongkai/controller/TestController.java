package com.goose.zhongkai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.goose.zhongkai.entity.Goose;
import com.goose.zhongkai.service.IGooseService;
import com.goose.zhongkai.service.IPageService;


@RestController
public class TestController {
	final int PAGESIZE=10;
	final int PAGENUM=0;
	@Autowired
	private IGooseService gooseservice;
	
 	@ResponseBody
	@RequestMapping("/GetList") 	
	public ResponseEntity<List<Goose>> getAllGoose(@RequestParam("currentp") int currentp){//<Goose>
 		
 		List<Goose> all_listgoose=gooseservice.getAllGoose(10*(currentp-1), PAGESIZE);
 		
 		ResponseEntity<List<Goose>> Resentity= new ResponseEntity<List<Goose>>(all_listgoose,HttpStatus.OK);		
		return Resentity;
	}
 	@RequestMapping("/delete")
 	public void deleteGooseByid(@RequestParam("id")int id){
		
 		gooseservice.deleteGoose(id);
 		//return ""+id; 		
 	}
 	@RequestMapping("/update")
 	public ResponseEntity updateGooseByid(@RequestBody Goose goose){
 		//System.out.println(goose.getId()+"");
 		try {
			gooseservice.updateGoose(goose);
		} catch (Exception e) {
			
			//e.printStackTrace();
			return (ResponseEntity) ResponseEntity.status(500);
		}
 		
 		return ResponseEntity.ok(HttpStatus.OK);
 	}
 	@RequestMapping("/new")
 	public ResponseEntity addNewGoose(@RequestBody Goose goose){
 		try {
			gooseservice.addGoose(goose);
		} catch (Exception e) {	
			return (ResponseEntity) ResponseEntity.status(500);
		}
 		return ResponseEntity.ok(HttpStatus.OK);
 	}
 	
}
