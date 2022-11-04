package JavaSessions14.assignment;

public class IITCollege extends Education implements IndianEduBody,UKEduBody,USEduBody{

	//From USEduBody
	@Override
	public void infoScienceEngCourse() {
		// TODO Auto-generated method stub
		System.out.println("IIT--infoScienceEngCourse");
	}

	@Override
	public void instrumentationEngCourse() {
		System.out.println("IIT--instrumentationEngCourse");		
	}

	@Override
	public void compScienceEngCourse() {
		System.out.println("IIT--compScienceEngCourse");
	}

	
	@Override
	public void electronicsEngCourse() {
		System.out.println("IIT--electronicsEngCourse");
	}

	@Override
	public void electricalEngCourse() {
		System.out.println("IIT--electricalEngCourse");
	}

	@Override
	public void polymerScienceEngCourse() {
		System.out.println("IIT--polymerScienceEngCourse");
	}

	@Override
	public void environmentalScienceEngCourse() {
		System.out.println("IIT--environmentalScienceEngCourse");
	}

	@Override
	public void medicalElectronicsEngCourse() {
		System.out.println("IIT--medicalElectronicsEngCourse");
	}

	@Override
	public void industrialEngCourse() {
		// TODO Auto-generated method stub
		System.out.println("IIT--industrialEngCourse");
	}
	
	public void hostel() {
		System.out.println("IIT--Hostel");
	}
	public void placementCell() {
		System.out.println("IIT--placementCell");
	}

	@Override
	public void quarterlySemExams() {
		// TODO Auto-generated method stub
		System.out.println("IIT--quarterlySemExams");
	}

	@Override
	public void syllabus() {
		// TODO Auto-generated method stub
		System.out.println("IIT--syllabus");
	}

	@Override
	public void timetable() {
		// TODO Auto-generated method stub
		System.out.println("IIT--timetable");
	}
	
	@Override
	public void payment() {
		System.out.println("IIT--payment");
	}

	@Override
	public void professor() {
		// TODO Auto-generated method stub
		System.out.println("IIT--professor");
		
	}

	@Override
	public void fees() {
		// TODO Auto-generated method stub
		System.out.println("IIT--fees");
	}
}
