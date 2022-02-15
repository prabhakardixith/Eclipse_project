package com.SpringBoot.CrudDemo.SpringBootCrudPractise.rest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.CrudDemo.SpringBootCrudPractise.entity.User;

@RestController
@RequestMapping("/test")
public class RestControllerDemo {
	@Autowired
	EntityManager entityManager;
	List<User> list = new LinkedList<User>();
	
	@PostMapping("/boot")
	@Transactional
	public String addUser(@RequestBody User user) {
//		list.add(user);
		Session ses = entityManager.unwrap(Session.class);
		ses.save(user);
		return user.toString();
	}

	@GetMapping("/boot")
	@Transactional
	public List<User> GetAllUser() {
		list.clear();
		Session ses = entityManager.unwrap(Session.class);
		
		list = ses.createQuery("from User", User.class).getResultList();
	
		return list;
	}

	@PutMapping("/boot/{name}")
	@Transactional
	public String updateUser(@RequestBody User user, @PathVariable String name) {
		System.out.println(name);
		Session ses = entityManager.unwrap(Session.class);
		
		ses.update(user);
		return "User Updated";
	}

	@DeleteMapping("/boot/{name}")
	@Transactional
	public String deleteUser(@PathVariable String name) {
		System.out.println(name);
		Session ses = entityManager.unwrap(Session.class);
		User user = ses.get(User.class,name);
		if(user != null)
		{
			ses.delete(user);
			return "User Deleted"+user.getfName();
		}
		
		return "User does not exist"+name;
	}

}
