package com.qa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.model.User;
import com.qa.model.Workout;

public class WorkoutRepoDB implements WorkoutRepo{
	
	@PersistenceContext(unitName = "myPU")
	private EntityManager em;

	@Transactional(value = TxType.REQUIRED)
	public User createWorkout(Workout workout, int id) {
		User user = em.find(User.class, id);
		return user;
	}

	
	public Workout readWorkout(int id) {
		Workout workout = em.find(Workout.class, id);
		return workout;
	}

	
	public List<Workout> readAll() {
		TypedQuery<Workout> q = em.createQuery("Select work from Workout work", Workout.class);
		List<Workout> list = q.getResultList();
		return list;
	}

	@Transactional(value = TxType.REQUIRED)
	public Workout updateWorkout(int id, Workout newWorkout) {
		Workout workout = readWorkout(id);
		workout.setAll(newWorkout);
		return workout;
	}

	@Transactional(value = TxType.REQUIRED)
	public void deleteWorkout(int id) {
		em.remove(readWorkout(id));
	}
}
