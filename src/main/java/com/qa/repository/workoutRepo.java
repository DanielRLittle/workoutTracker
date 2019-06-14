package com.qa.repository;

import java.util.List;

import com.qa.model.Workout;

public interface workoutRepo {

	public Workout createWorkout(Workout workout);

	public Workout readWorkout(int id);

	public List<Workout> readAll();

	public Workout updateWorkout(int id, Workout newWorkout);

	public void deleteWorkout(int id);
}
