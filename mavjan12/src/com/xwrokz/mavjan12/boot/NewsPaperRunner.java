package com.xwrokz.mavjan12.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xwrokz.mavjan12.configuration.NewsPaperConfiguration;
import com.xwrokz.mavjan12.thing.Engine;
import com.xwrokz.mavjan12.thing.Ghost;
import com.xwrokz.mavjan12.thing.NewsPaper;
import com.xwrokz.mavjan12.thing.Snake;

public class NewsPaperRunner {

	public static void main(String[] args) {
		ApplicationContext npr = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);

		NewsPaper nw = npr.getBean(NewsPaper.class);
		System.out.println(nw);
		
		System.out.println("\n");
		Snake sn = npr.getBean(Snake.class);
		System.out.println(sn);

		System.out.println("\n");
		Engine en = npr.getBean(Engine.class);
		System.out.println(en);
		
		System.out.println("\n");
		Ghost g = npr.getBean(Ghost.class);
		System.out.println(g);
	}

}
