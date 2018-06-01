package com.spring.spring_intro;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrawingApp {
	//	@Autowired
	//	MessageSource messageSource;
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		// final Triangle triangle = new Triangle();
		// final Resource resource = new ClassPathResource("Spring.xml");
		// final BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("Spring.xml"));

		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");
		// -------------------------->>>>>>>>>>>>>>>
		// context.getEnvironment().getPropertySources()
		context.register(AppJavaConfig2.class, AppJavaConfig.class);
		context.refresh();
		context.registerShutdownHook();
		//System.out.println(context.getEnvironment().getProperty("owner.name").toString());

		System.out.println("demo message from message source 1 -->"+context.getMessage("demo.message", null, "default demo msg 1", null));
		final Locale spanish = new Locale("es", "ES");
		System.out.println("demo message from message source 2 -->"+context.getMessage("demo.message22",new Object[] {"meet"}, "default demo msg 2", spanish));

		//		final MutablePropertySources sources = context.getEnvironment().getPropertySources();
		//
		//		sources.addFirst();
		//		final Map<String, String> sysenv = System.getenv();
		//		for(final Map.Entry<String, String> entry : sysenv.entrySet()) {
		//			System.out.println(entry.getKey() +"----"+entry.getValue());
		//		}
		//		final Properties properties = System.getProperties();
		//		final Enumeration pname = properties.propertyNames();
		//		while (pname.hasMoreElements()) {
		//			System.out.println(pname.nextElement().toString());
		//		}
		final Shape shape = (Shape) context.getBean("triangle");
		// final Triangle triangle2 = (Triangle) context.getBean("triangle");
		// triangle.setPointA();
		// triangle.setPointB();
		// triangle.setPointC();
		shape.draw();
		// final Point point = new Point();
		// point.setX(50);
		// point.setY(50);
		// triangle2.setPointA(point);
		// triangle2.draw();
		// triangle.draw();
		// System.out.println(triangle+" "+triangle2);
		// System.out.println(triangle.getPointA()+" "+triangle2.getPointA());
		// System.out.println(context.getBean("pointA1"));
		// System.out.println(context.getBean("pointA1"));

		// System.out.println("T1 ="+triangle+" "+"T2 ="+triangle2);
		// System.out.println("triangle 1 A = "+triangle.getPointA());
		// System.out.println("triangle 1 B = "+triangle.getPointB());
		// System.out.println("triangle 1 C = "+triangle.getPointC());
		// triangle2.setPointA();
		// triangle2.setPointB();
		// triangle2.setPointC();
		// System.out.println("triangle 2 A = "+triangle2.getPointA());
		// System.out.println("triangle 2 B = "+triangle2.getPointB());
		// System.out.println("triangle 2 C = "+triangle2.getPointC());
		// System.out.println("-----------------------------------------------------------------");
		// System.out.println("triangle 1 A = "+triangle.getPointA());
		// System.out.println("triangle 1 B = "+triangle.getPointB());
		// System.out.println("triangle 1 C = "+triangle.getPointC());

	}

}
