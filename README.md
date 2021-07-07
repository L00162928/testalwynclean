# cleanercode

Table of Contents
	
	Preamble
        Product Owner
        Team members
	Roles & responsibilities
        Project Deadline
        Project Specification
        Considerations
        Useful Links
        Risk Register
        Tenants of Design
        Social Contract

Preamble

DevOps Placement Letterkenny Institute of Technology (lyit.ie) June 2021

Define the buisness Requirements - CleanerCode is a very large company with many divisions. We understand the need to move forward from Waterfall and spreadsheets for project management. This project automates creation of pipelines for development work. The customer in this project is internal. The objectives for this project are:
	- Migrate to modern project Management Techniques.
	- Automatic creation of pipelines for development work.
	- Utilise Github for the pipeline.
	- Pipeline is reusable for all projects.

Our product will be delivered using an Agile methodology that embraces the DevOps culture. Please note that our culture embraces change and these documents are treated as living, breathing artefacts that will be continuously updated.

Product Owner
Ruth G. Lennon

Team Members
Peter McNamara
Stephen Mailey
Alwyn Benny
Emil Olizarowicz
Vinu Appukuttan
Sai Sankar


Roles & Responsibilities

Scrum master Rotation - Conduct Standup meetings 

Week 1 (15/06/2021) - Peter McNamara
Week 2 (22/06/2021) - Vinu Appukuttan
week 3 (29/06/2021) - Sai Sankar
week 4 (06/07/2021) - Emil Olizarowicz
Week 5 (13/07/2021) - Stephen Mailey
Week 6 (20/07/2021) - Alwyn Benny

Project Deadline
27-July-2021 23:59 UTC/GMT 

Project Specification

High level tasks
Task 1: Create a pipeline in GitHub actions. (Issue #18)	
Task 2: Prototype what is needed.
Task 3: Write script(s) to automate pipelines for any future projects the company may work on.
Task 4: Use the prototype pipeline to manage your scripts to help demonstrate the value of pipelines to the internal customers at CleanerCode.

Useful Links
    Slack: https://app.slack.com/client/T84LE6L6R/C0230K860DQ/details/
    GitHub: https://github.com/rlennon/cleanercode
    Project close out presentation: 

Risk register
	Risk review will be conducted every Tuesday. Issue #8 will be used as the Risk register.

Tenants of Design
   	- Performance Management Tool(s): 
		Github insights? Check with Ruth in Slack (Issue #23)
	- Create code 
		Eclipse for code development. Use simple Java program (Issue #4)
	- Quality assurance
		Sonarqube for code quality check (Issue #14)
	- Unit Testing: 
		JUnit (Issue #24) 
	- Issue & Risk management: 
		GitHub Issues (by default) (Issue #8 will be used as the Risk register)
	- Security Tools:
		Fortify, Zap, Greenlight or similar (Issue #16) 
	- Staging/Production Environments:
		The three branches created in this project will be used as
			Dev - Development area for code development and unit testing (Dev branch created)
			Test - Stage environment where unit tested code will be moved for UAT (Test brach created)
			Main - Production environment (Main branch created)
	- Repository:
		GitHub will be used as code and documentation repository.
			Documentation - Readme, Minutes of meetings
	- Automated documentation
		Use Maven(Javadoc) to create automated documentation.
	- Pipeline in GitHub
		GitHub Actions


Social Contract

Meetings

    Sprint plannings/Stand-ups will occur on Tuesdays via BB Collaborate and Fridays via Slack at 7 PM GMT.
    The order that people give their updates will be based on alphabetical order of those present at the meeting.
    Updates will be in the form: What Did you complete? What do you commit to complete?, When do you think you will be done with that?, Any impediments in your way?
    Sprint retro will occur every other week on Tuesdays and Fridays.
    The order that people present their sprint retro updates will be based on alphabetical order of those present at the meeting.
    Points raised in the sprint retro will be noted and posted on the slack channel by the Scrum Master.
    Backlog refinement?
    Task estimation will be done using T-shirt sizing. 
    Come prepared to meetings.
    Be on time for Stand Ups and meetings.
    Mobile phones on silent.
    Everyone has equal voice and valuable contribution.
    Keep your language and tone professional at all times.
    Be honest.

Communication

    Slack is the preferred method of communication.
    If a demonstration is required use BB collaborate.
    Expect responses for slack communications only between 7:00 PM and 10:00 PM.
    Raise a problem as soon as you see it.
    Respect each other and understand differences in knowledge.
    All team documents are to be created using Markdown language and shared on GitHub.
    There are no silly questions, if you don’t understand, ask.
    Share success stories.
    Focus on the positives.
    Don’t make assumptions.
    Don’t interrupt and cut another person off while they are talking.
    Listen when someone is talking, don’t interject.
    Zero tolerance for bullying.
    Communication in this order: Slack, Email
    Agile way of working.
    If are assigned a job, take ownership of it and keep it up to date.
    Stick to your agreed working patterns. Let the team know when you are late or going early.
    Update the Scrum Board as you progress the story i.e. don’t update at standup.
    Don't be afraid to ask for help.
    Don't be afraid to give constructive critism, as long as it is constructive.
    Solve roadblocks within the team. If the impediment can’t be solved within the team then give it to the Scrum Master.

Other
Sprints will start every Tuesday.
The Scrum Master role rotates each week, the schedule is available on the on the process section
Github issues will be used for task management and planning.
Each member of the team will work <4 hours> per week, unless they are on vacation. 

Estimating Story Points Within GitHub
The teams team's velocity is calculated by <fill in>
 	 Initial velocity (can be calculated as): Team projection (total backlog/weeks).
 	 Actual Velocity: Backlog items complete per sprint/total sprint days
	 
The teams current story point velocity is "<Choose the number!>".
	The days or hours available could be calculated as follows
	expert-days = 7 days * 6 weeks * 6 team  members = max capacity 252 team days
 	expert hours = 6 weeks * 6 team members * committed hours (4) = 144 hours
	Minimum velocity is backlog items/total hours = 0. As we do not have backlog items yet we could substitute total weeks as an analog for backlog and then (1/x) = 0 therefore, Initial Velocity to achieve total is 24.
