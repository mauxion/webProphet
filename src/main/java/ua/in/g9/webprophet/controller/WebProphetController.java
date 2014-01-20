package ua.in.g9.webprophet.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class WebProphetController {
  
 @RequestMapping(method=RequestMethod.GET, value="/home")
 public String handleRequest(){
  return "welcome";
 }
}