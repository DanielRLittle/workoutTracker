The following documentation describes the project within this folder and how to use it effectively.

Use the following  URLs to access the website: 	35.242.137.2:8080/workoutTracker-1.0/
						or
						35.242.137.2:8080?workoutTracker:8080/frontpage

The project is currently running on a google cloud virtual machine and being automatically updated via Jenkins whenever there is a push to github.


On the homepage, there is an option to either create a user or login to a current user. The homepage is accessable from any other page within the website but it will log the user out.
If you create a user, you can go straight to the login page from there. Please note that you cannot enter blank entries in both the boxes. Login requires a first name and a last name that
are identical to a user already created.


Once in the users account, there are opportunities to observe the users data, hide it again, update the account, or even delete the account. Account deletion is not complete until confirmed
by the user. If update is selected, the user will be taken to a page similar to the create/login pages. Again, in the update page, a blank name cannot be entered. If a correct change is
made, the username will be updated and then the user will be taken back to the home page and be required to login again. A future addition to the user's account page, there will be a chance
to view workouts, adding and removing them.

The users are stored and viewed by connecting to a h2database using Java Persistence API and then displayed to the web pages using javascript, html and css.

The test coverage for this project in Eclipse measured at 82.8%. Selenium tests were prioritised with some junit testing as well. The API was checked by using postman in order to observe
the POST, GET, PUT and DELETE commands (CRUD) in action. The selenium tests show that the CRUD is working effectively on the front end of the project.

