package com.bioinf.lordoftheflies;

import java.io.File;

import com.bioinf.lordoftheflies.algorithm.StructureGeneratorPSO;

import net.sourceforge.jswarm_pso.FitnessFunction;
import net.sourceforge.jswarm_pso.Swarm;

public class lotf {
	public static void main( String[] args ) throws Exception{	
		String paraFile = "parameters_Matrix.txt";
		if (args != null && args.length >= 1){
			paraFile = args[0];
		}
		//check if the parameter file exists in the current directory
		File file = new File(paraFile);
		if (!file.exists()){
			throw new Exception("The parameter file " + paraFile + "cannot be found in the current directory");
		}
		
		StructureGeneratorPSO generator = new StructureGeneratorPSO(paraFile);
		try {
			generator.generateStructure();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		/*// Create a swarm (using 'MyParticle' as sample particle 
		// and 'MyFitnessFunction' as finess function)
		Swarm swarm = new Swarm(Swarm.DEFAULT_NUMBER_OF_PARTICLES
				, new MyParticle()
				, new MyFitnessFunction());
		// Set position (and velocity) constraints. 
		// i.e.: where to look for solutions
		swarm.setMaxPosition(1);
		swarm.setMinPosition(0);
		// Optimize a few times
		for( int i = 0; i < 20; i++ ) swarm.evolve();
		// Print en results
		System.out.println(swarm.toStringStats());*/
	

}

