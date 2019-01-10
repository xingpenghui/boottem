package com.qfedu.boottem.app;

import com.qfedu.boottem.entity.Work;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/10 09:36
 */
@Controller
public class HelloContorller {

    @GetMapping("helloapp.do")
    public String hello(Model model){
        model.addAttribute("num1",10001);
        model.addAttribute("str1","I Love Java");
        Work work=new Work();
        work.setCity("郑州");
        work.setId(100);
        work.setName("贾宁");
        model.addAttribute("work",work);
        List<Work> list=new ArrayList<>();
        for(int i=1;i<61;i++){
            Work work1=new Work();
            work1.setCity("郑州"+i);
            work1.setId(i);
            work1.setName("java1806"+i);
            list.add(work1);
        }
        model.addAttribute("works",list);
        model.addAttribute("user","张三");
        model.addAttribute("str2","DSSDSDSsdsds");
        model.addAttribute("date1",new Date());
        return "hello";
    }
    @GetMapping("hiapp.do")
    public String hi(Model model){
        model.addAttribute("num1",10001);
        model.addAttribute("str1","I Love Java");
        Work work=new Work();
        work.setCity("郑州");
        work.setId(100);
        work.setName("贾宁");
        model.addAttribute("work",work);
        List<Work> list=new ArrayList<>();
        for(int i=1;i<61;i++){
            Work work1=new Work();
            work1.setCity("郑州"+i);
            work1.setId(i);
            work1.setName("java1806"+i);
            list.add(work1);
        }
        model.addAttribute("works",list);
        model.addAttribute("user","张三");
        model.addAttribute("str2","DSSDSDSsdsds");
        model.addAttribute("date1",new Date());
        return "hi";
    }
}
