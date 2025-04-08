package Ques;

import java.util.LinkedList;
import java.util.Queue;

public class PatientMonitoring {
	private Queue<PatientData> queue=new LinkedList<PatientData>();
	final int assignPatient=5;
	
	public void addPatient(PatientData patient) {
		if(queue.size()<assignPatient) {
			queue.add(patient);
			System.out.println(patient.toString());
		}else {
			System.out.println("No slot available");
		}
		
	}
	public void visitingPatients() {
		if(!queue.isEmpty()) {
			while(!queue.isEmpty()) {
			PatientData patient=queue.poll();
			System.out.println("Name: "+patient.getName());
			System.out.println("Age: "+patient.getAge());
			System.out.println("Gender: "+patient.getGender());
			System.out.println("HeartRate: "+analyzeHeartRate(patient.getHeartRate()));
			System.out.println("GlucoseLevel: "+analyzeGlucoseLevel(patient.getGlucoseLevel()));
			System.out.println("Symptoms: "+patient.getSymptoms());
			System.out.println("------------------------------------------------------");
		}
		System.out.println("All patients completed to visit");
		}
		else {
			System.out.println("Assign patients");
		}
	}
	public String analyzeHeartRate(int HeartRate) {
		if (HeartRate<60 || HeartRate>100) {
			return "Alert:Abnormal HeartRate detected";
		}else {
			return "Normal HeartRate";
		}
	}
	public String analyzeGlucoseLevel(int GlucoseLevel) {
		return null;
	}
}


