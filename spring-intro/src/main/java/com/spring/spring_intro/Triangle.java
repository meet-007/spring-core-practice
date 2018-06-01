package com.spring.spring_intro;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.io.Resource;

public class Triangle implements Shape {
	// @Autowired
	// @Resource
	// @Qualifier("A")
	//	@Inject
	private Point pointA;
	// @Autowired
	//	@Resource
	// @Qualifier("B")
	//	@Inject
	private Point pointB;
	// @Autowired
	// @Resource
	// @Qualifier("C")
	// @Inject
	private Point pointC;
	@Autowired
	Resource myResource;
	@Autowired
	private MessageSource messageSource;
	// Triangle(final Point pointA, final Point pointB, final Point pointC) {
	// this.pointA = pointA;
	// this.pointB = pointB;
	// this.pointC = pointC;
	// }
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(final Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(final Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(final Point pointC) {
		this.pointC = pointC;
	}

	// protected abstract Point createPointa();
	// protected abstract Point createPointb();
	// protected abstract Point createPointc();
	// @Autowired(required)
	// @Autowired
	// @Nullable
	// private Map<String, Point> points;
	//
	// //
	// //
	// //
	// public HashMap<String, Point> getPoints() {
	// return (HashMap<String, Point>) points;
	// }
	//
	// public void setPoints(final Map<String, Point> points) {
	// this.points = points;
	// }

	public void draw() {
		System.out.println("point A =" + "x is " + pointA.getX() + " , " + "y is " + pointA.getY());
		System.out.println("point B =" + "x is " + pointB.getX() + " , " + "y is " + pointB.getY());
		System.out.println("point C =" + "x is " + pointC.getX() + " , " + "y is " + pointC.getY());
		System.out.println();
		/** now iterate over list of points */
		//
		// for (final Map.Entry<String, Point> entry : points.entrySet()) {
		// System.out.println("key is"+entry.getKey());
		// System.out.println("point =" + "x is " + entry.getValue().getX() + " , " + "y
		// is " +
		// entry.getValue().getY());
		System.out.println("demo message from message source 2 -->"+messageSource.getMessage("demo.message22",new Object[] {"meet"}, "default demo msg 2", new Locale("es", "ES")));
		System.out.println(myResource.getDescription());
	}

	@PostConstruct
	public void jsrTriangleInit() {
		System.out.println("spring independent jsr-250 annotation inti method");
	}

	@PreDestroy
	public void jsrTriangleDestroy() {
		System.out.println("spring independent jsr-250 annotation destroy method");

	}

}
