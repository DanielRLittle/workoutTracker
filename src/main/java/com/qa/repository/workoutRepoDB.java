package com.qa.repository;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.Workout;

public class workoutRepoDB implements workoutRepo{

	@Transactional(value = TxType.REQUIRED)
	public Workout createWorkout(Workout workout) {
		
		return null;
	}

	
	public Workout readWorkout(int id) {
		
		return null;
	}

	
	public List<Workout> readAll() {
		
		return null;
	}

	@Transactional(value = TxType.REQUIRED)
	public Workout updateWorkout(int id, Workout newWorkout) {
		
		return null;
	}

	@Transactional(value = TxType.REQUIRED)
	public void deleteWorkout(int id) {
		
		
	}

}
