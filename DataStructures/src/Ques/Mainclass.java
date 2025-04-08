package Ques;

public class Mainclass{
	public static void main(String[] args) {
		PatientMonitoring patient=new PatientMonitoring();
		patient.addPatient(new PatientData("Abc",15,"Male",54,104,"Cold"));
		patient.addPatient(new PatientData("Def",34,"Femle",46,78,"Fever"));
		patient.addPatient(new PatientData("Ghi",56,"Male",73,94,"Dengue"));
		patient.addPatient(new PatientData("Jkl",38,"Female",10,104,"Colera"));
		patient.addPatient(new PatientData("Mno",12,"Male",79,89,"Malaria"));
		patient.addPatient(new PatientData("Pqr",12,"Male",79,89,"Malaria"));
		patient.visitingPatients();
	}
}
