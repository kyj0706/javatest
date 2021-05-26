
public class Ex0524_01 {

	public static void main(String[] args) {
		// 3개의 점을 만듭니다.
		// ex1 (0,0) (10,5) (5,40)
		// ex2 (0,0,0) (10,5,3) (5,40,20)
		
		//      참조변수명
		Point3D p3d_1 = new Point3D();
		p3d_1.p2d.x=0;
		p3d_1.p2d.y=0;
		p3d_1.z=0;
		Point3D p3d_2 = new Point3D();
		p3d_2.p2d.x=0;
		p3d_2.p2d.y=0;
		p3d_2.z=3;		
		Point3D p3d_3 = new Point3D();
		p3d_3.p2d.x=0;
		p3d_3.p2d.y=0;
		p3d_3.z=20;

		
		
		
		//베열로도 가능
//		Point3D[] p1 = new Point3D[3];
//		p1[0] = new Point3D();
//		p1[0].p.x = 0;
//		p1[0].p.y = 0;
//		p1[0].z = 0;
//		p1[1] = new Point3D();
//		p1[1].p.x = 0;
//		p1[1].p.y = 0;
//		p1[1].z = 0;
//		p1[2] = new Point3D();
//		p1[2].p.x = 0;
//		p1[2].p.y = 0;
//		p1[2].z = 0;
		
		//ex2
//		Point3D  p1 = new Point3D();
//		p1.x = 0;
//		p1.y = 0;
//		p1.z = 0;
//		Point3D  p2 = new Point3D();
//		p2.x = 0;
//		p2.y = 0;
//		p2.z = 0;
//		Point3D  p3 = new Point3D();
//		p3.x = 0;
//		p3.y = 0;
//		p3.z = 0;
		
		//ex1
//		Point p1 = new Point();
//		p1.x =0;
//		p1.y =0;
//		Point p2 = new Point();
//		p2.x =10;
//		p2.y =5;
//		Point p3 = new Point();
//		p3.x =5;
//		p3.y =40;

		
	}

}
