package com.qa.repository;

import java.util.List;

import com.qa.model.User;
import com.qa.model.Workout;

public interface WorkoutRepo {

	public User createWorkout(Workout workout, int id);

	public Workout readWorkout(int id);

	public List<Workout> readAll();

	public Workout updateWorkout(int id, Workout newWorkout);

	public void deleteWorkout(int id);
}
