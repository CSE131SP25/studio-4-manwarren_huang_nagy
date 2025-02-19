package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
		if (shape.equals ("ellipse")) {
			if (in.nextBoolean() == true) {
				StdDraw.filledEllipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else {
				StdDraw.ellipse(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		else if (shape.equals ("rectangle")) {
			if (in.nextBoolean() == true) {
				StdDraw.filledRectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
			else {
				StdDraw.rectangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			}
		}
		else if (shape.equals ("triangle")) {
			if (in.nextBoolean() == true) {
				double[] x = new double[3];
				double[] y = new double[3];
				x[0] = in.nextDouble();
				y[0] = in.nextDouble();
				x[1] = in.nextDouble();
				y[1] = in.nextDouble();
				x[2] = in.nextDouble();
				y[2] = in.nextDouble();
				StdDraw.filledPolygon(x, y);
			}
			else {
				double[] x = new double[3];
				double[] y = new double[3];
				x[0] = in.nextDouble();
				y[0] = in.nextDouble();
				x[1] = in.nextDouble();
				y[1] = in.nextDouble();
				x[2] = in.nextDouble();
				y[2] = in.nextDouble();
				StdDraw.polygon(x, y);
			}
		}
		StdDraw.show();
	}
}
