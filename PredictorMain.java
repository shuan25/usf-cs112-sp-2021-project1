package projectPart1;
import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.*;    // all of the Swing objects

import projectPart1.DataPoint;

import java.awt.*;       // more windowing components, including Container
import java.io.*;
import java.util.ArrayList;

public class PredictorMain {
	public static void main(String[] args) {
		//implementing the abstract methods
		JFrame myFrame = new JFrame();
		myFrame.setTitle("Data Points");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = myFrame.getContentPane();
		
		DummyPredictor data = new DummyPredictor();
		ArrayList<DataPoint> list = data.readData("file.txt");
		DataPoint trainPoint = list.get(0);
		DataPoint testPoint = list.get(1);
		DataPoint testData = new DataPoint(9.0, 2.8, "Good", true);
		System.out.println(data.test(testData));
		//System.out.println(data.test(testPoint));
		System.out.println(data.getAccuracy(list));
		System.out.println(data.getPrecision(list));
		
		JLabel precision = new JLabel("Precision is" + data.getPrecision(list));
		contentPane.add(precision);
		JLabel accuracy = new JLabel("Accuracy is" + data.getAccuracy(list));
		contentPane.add(accuracy);
		
		myFrame.setVisible(true);
		myFrame.setLayout(new GridLayout(2,2));
		myFrame.setSize(200,200);
	
	}
}



