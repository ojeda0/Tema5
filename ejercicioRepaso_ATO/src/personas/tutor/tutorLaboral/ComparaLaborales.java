package personas.tutor.tutorLaboral;

import java.util.Comparator;

public class ComparaLaborales implements Comparator<TutorLaboral>{

	@Override
	public int compare(TutorLaboral o1, TutorLaboral o2) {
		
		int cargo = o1.getCargo().compareTo(o2.getCargo());
		
		if(cargo == 0) {
			
			return o1.getApellidos().compareTo(o2.getApellidos());
			
		}
		
		return cargo;
		
	}

}
