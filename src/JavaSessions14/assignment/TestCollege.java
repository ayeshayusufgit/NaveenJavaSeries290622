package JavaSessions14.assignment;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IITCollege iitcol=new IITCollege();
		//from IndianEduBody interface
		iitcol.environmentalScienceEngCourse();
		iitcol.medicalElectronicsEngCourse();
		iitcol.industrialEngCourse();
		IndianEduBody.canteen();
		iitcol.payment();
		iitcol.professor();
		iitcol.fees();
		//from UKEduBody interface
		iitcol.electronicsEngCourse();
		iitcol.electricalEngCourse();
		iitcol.polymerScienceEngCourse();
		//from USEduBody interface
		iitcol.compScienceEngCourse();
		iitcol.infoScienceEngCourse();
		iitcol.instrumentationEngCourse();
		//from Education class
		iitcol.funding();
		//from GlobalEduBody interface
		iitcol.quarterlySemExams();
		iitcol.syllabus();
		//methods from iit class
		iitcol.hostel();
		iitcol.placementCell();
		iitcol.timetable();
		iitcol.admissionGuidelines();
		Education.admissionGuidelines();
		
		IndianEduBody col1=new IITCollege();
		col1.environmentalScienceEngCourse();
		col1.industrialEngCourse();
		col1.medicalElectronicsEngCourse();
		col1.timetable();
		col1.payment();
		col1.professor();
		
		col1.quarterlySemExams();
		col1.syllabus();
		col1.fees();
		
		//IndianEduBody col2=new IndianEduBody();
		
		//IITCollege col3=new IndianEduBody(); 		
		
		
	}

}
