package projectPart1;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import projectPart1.DataPoint;

public class DummyPredictor extends Predictor {
//	private Double goodf1;
//	private Double goodf2;
//	private Double badf1;
//	private Double badf2;	
//	private Double avgDiff1;
//	private Double avgDiff2;
	@Override
	public ArrayList<DataPoint> readData(String filename) {
		ArrayList<DataPoint> list = new ArrayList<DataPoint>();
		try {
			Scanner sc = new Scanner(new File("file.txt"));
			while(sc.hasNextLine()) {
				double f1 = sc.nextDouble();
				double f2 = sc.nextDouble();
				String label = sc.next();
				boolean isTest = sc.nextBoolean();
				DataPoint data = new DataPoint(f1, f2, label, isTest);
				list.add(data);
			
		}
												
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
//		Double f1Avg = 0.0;
//		Double f2Avg = 0.0;
//		Double goodCount = 0.0;
//		Double badCount = 0.0;
//		
//		Double goodf1 = 0.0;
//		Double goodf2 = 0.0;
//		Double badf1 = 0.0;
//		Double badf2 = 0.0;
//		for (int i = 0; i < list.size(); i++) {
//			DataPoint d = list.get(i);
//			Double f= d.getF1();
//			Double f2 = d.getF2();
//			String label = d.getLabel();
//			//Compute avg here based on the label
//			if (label == "Good") {
//				goodf1 += f;
//				goodf2+=f2;
//				++goodCount;
//				
//				
//				
//				
//			} else {
//				badf1 += f;
//				badf2+=f2;
//				++badCount;
//					
//			}
//		}
//			
//				
//				this.goodf1 = goodf1/goodCount;
//				this.goodf2 = goodf2/goodCount;
//				this.badf1 = badf1/badCount;
//				this.badf2 = badf2/badCount;
//				this.avgDiff1 = this.goodf1 - this.goodf2;
//				this.avgDiff2 = this.badf1 - this.badf2;
//				//System.out.println(this.greenAvg);
//				//System.out.println(this.blueAvg);
//				//System.out.println(this.avgDiff)
		
		return list;
		
	}
	
			


	@Override
	public String test(DataPoint data) {

			return "This is bad.";
		}
		
	

	@Override
	public Double getAccuracy(ArrayList<DataPoint> data) {
		// TODO Auto-generated method stub
		return 1.0;
	}
	@Override
	public Double getPrecision(ArrayList<DataPoint> data) {
		// TODO Auto-generated method stub
		return 2.0;
	}

	

}
