package com.syntax.class20;

public class Task9 {

	 /*
	Write a Java program called Teacher.
	Identify features and behavior of that Class.
	Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
	that would have their own features and behavior. Test all 4 classes.
	 */
	
	    public static void main(String[] args) {
	    
	    //test1
	    	
	    	TeacherA teacherA = new TeacherA();
	        teacherA.printName();
	    	
	    //test2
	    	
	    	MathTeacher mathTeacher = new MathTeacher();
	        mathTeacher.name = "Sepideh";
	        mathTeacher.teachCalculus();
	     
	    //test3
	        
	        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
	        chemistryTeacher.name = "Susan";
	        chemistryTeacher.teachOrganicChemistry();
	        
	    //test4   
	        
	        PianoTeacher pianoTeacher = new PianoTeacher();
	        pianoTeacher.name = "monica";
	        pianoTeacher.teachPiano();
	        
	         
	        
	    }
	}

	class TeacherA {
	    
		String name;
	    int age;
	    double weight;
	    
	    void printName(){
	    	
	        System.out.println(name);
	    }
	}

	class MathTeacher extends TeacherA {
		
	    boolean canTeachTrigonometry = true;
	    
	    void teachCalculus() {
	    	
	        System.out.println(name + " Teaches Calculus");
	    }
	}

	class ChemistryTeacher extends TeacherA {
		
	    boolean canTeachChemistry = true;
	    
	    void teachOrganicChemistry() {
	    	
	        System.out.println(name + " Teaches OrganicChemistry");
	        
	    }
	}

	class PianoTeacher extends TeacherA {
		
	    boolean canPlayPiano= true;
	    
	    void teachPiano(){
	    	
	        System.out.println(name + " Teaches Piano");
	    }
	}
	

	
	
	