package plugin;

import org.geotools.geometry.jts.JTS;

import com.vividsolutions.jts.geom.Envelope;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Polygon;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*CoordinateReferenceSystem sourceCRS = CRS.decode("EPSG:4326");
		GeometryBuilder bg = new GeometryBuilder(sourceCRS);
		double[] array = {0,0};
		PointArray points = bg.createPointArray(array);
		SurfaceBoundary sb = bg.createSurfaceBoundary(points);*/
		
		Envelope e = new Envelope(0,0,0,0);
		Object p = JTS.toGeometry(e);
		
		Geometry g = (Geometry)p;
		System.out.println(g);
	}

}
