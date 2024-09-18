package com.JBK.EmployeeManagmentSystem.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.JBK.EmployeeManagmentSystem.Model.TableEmployeeMaster;

@Controller
public class EmployeeController {

	@Autowired
	SessionFactory sf;
	Session ss;
	Transaction tx;
	TableEmployeeMaster tem;

	@RequestMapping("employeetable") // table view page
	public ModelAndView viewtable() {

		ss = sf.openSession();

		Query query = ss.createQuery("from TableEmployeeMaster");

		List<TableEmployeeMaster> al = query.list();
		al.forEach(System.out::println); // console table

		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		// System.out.println(al);
		view.setViewName("employeetable");

		return view;
	}

	@RequestMapping("/employeeinsert") // Save page action & new table view
	ModelAndView saveEmployee(@ModelAttribute TableEmployeeMaster employee) {
		ss = sf.openSession();
		tx = ss.beginTransaction();
		ss.save(employee);
		tx.commit();
		System.out.println("New customer save :- " + employee);

		Query query = ss.createQuery("from TableEmployeeMaster");

		List<TableEmployeeMaster> al = query.list();
		al.forEach(System.out::println); // console table
		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		// System.out.println(al);
		view.setViewName("employeetable");

		return view;
	}

	@RequestMapping("/employeeupdate") // Save page action & new table view
	ModelAndView updateEmployee(@ModelAttribute TableEmployeeMaster employee) {
		ss = sf.openSession();
		tx = ss.beginTransaction();
		ss.update(employee);
		tx.commit();

		Query query = ss.createQuery("from TableEmployeeMaster");

		List<TableEmployeeMaster> al = query.list();
		al.forEach(System.out::println); // console table
		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		// System.out.println(al);
		view.setViewName("employeetable");

		return view;
	}
	
	@RequestMapping("/updatepage") // Save page action & new table view
	String updatepage(@ModelAttribute TableEmployeeMaster employee) {
		
		return "employeeupdate";
	}

	@RequestMapping("/employeedelete") // Save page action & new table view
	ModelAndView deleteEmployee(String eid) {
		ss = sf.openSession();
		tx = ss.beginTransaction();
		tem = ss.get(TableEmployeeMaster.class, eid);
		ss.delete(tem);
		tx.commit();
		System.out.println("Employee Id " + eid + " Deleted..");

		Query query = ss.createQuery("from TableEmployeeMaster");

		List<TableEmployeeMaster> al = query.list();
		al.forEach(System.out::println); // console table
		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		// System.out.println(al);
		view.setViewName("employeetable");

		return view;
	}

//	@RequestMapping("jspPage") // table view page
//	ModelAndView m() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("employeeinsert");
//		return modelAndView;
//	}
//
//	@RequestMapping("employeetable") // table view page action
//	public ModelAndView viewtable() {
//
//		ss = sf.openSession();
//
//		Query query = ss.createQuery("from TableEmployeeMaster");
//
//		List<TableEmployeeMaster> al = query.list();
//		al.forEach(System.out::println); //console table 
//
//		ModelAndView view = new ModelAndView();
//		view.addObject("al", al);
//		//System.out.println(al);
//		view.setViewName("employeetable");
//
//		return view;
//	}

}
