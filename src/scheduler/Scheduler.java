package scheduler;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */

public class Scheduler {
	public enum Weekday {

		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	}

	Weekday weekday;

	public static void main(String[] args) {

		boolean exited = false;
		Scanner scanner = new Scanner(System.in);
		LinkedList[] events = new LinkedList[7];

		for (int i = 0; i < 7; i++) {
			events[i] = new LinkedList<Events>();
		}
		LinkedList<Events> list = events[0];

		Weekday x = Weekday.MONDAY;
		switch (x) {
		case MONDAY:
			list = events[0];
			break;
		case TUESDAY:
			list = events[1];
			break;
		case WEDNESDAY:
			list = events[2];
			break;
		case THURSDAY:
			list = events[3];
			break;
		case FRIDAY:
			list = events[4];
			break;
		case SATURDAY:
			list = events[5];
			break;
		case SUNDAY:
			list = events[6];
			break;
		}

		do {
			System.out.println("What do you want to do? Add/Remove/View/Exit");
			String doWhat = scanner.nextLine();
			

			if (doWhat.equals("Add") | doWhat.equals("add")) {

				System.out.println("Type in what EVENT you want to add");
				String addEvent = scanner.nextLine();
				System.out.println("Type in what TIME the event is on");
				String addTime = scanner.nextLine();
				System.out.println("Type in which DAY OF THE WEEK you would want to add this event");
				String weekday = scanner.nextLine();

				Weekday y = Weekday.MONDAY;
				if (weekday.equals("Monday")) {
					y = Weekday.MONDAY;
				} else if (weekday.equals("Tuesday")) {
					y = Weekday.TUESDAY;
				} else if (weekday.equals("Wednesday")) {
					y = Weekday.WEDNESDAY;
				} else if (weekday.equals("Thursday")) {
					y = Weekday.THURSDAY;
				} else if (weekday.equals("Friday")) {
					y = Weekday.FRIDAY;
				} else if (weekday.equals("Saturday")) {
					y = Weekday.SATURDAY;
				} else if (weekday.equals("Sunday")) {
					y = Weekday.SUNDAY;
				}

				switch (y) {
				case MONDAY:
					list = events[0];
					break;
				case TUESDAY:
					list = events[1];
					break;
				case WEDNESDAY:
					list = events[2];
					break;
				case THURSDAY:
					list = events[3];
					break;
				case FRIDAY:
					list = events[4];
					break;
				case SATURDAY:
					list = events[5];
					break;
				case SUNDAY:
					list = events[6];
					break;
				}
				Events eventToAdd = new Events(addTime, addEvent);
				list.add(eventToAdd);

				
				
				
			} else if (doWhat.equals("Remove") || doWhat.equals("remove")) {

				System.out.println("Type in which DAY OF THE WEEK you would want to remove this event on");
				String weekday = scanner.nextLine();

				Weekday y = Weekday.MONDAY;
				if (weekday.equals("Monday")) {
					y = Weekday.MONDAY;
				} else if (weekday.equals("Tuesday")) {
					y = Weekday.TUESDAY;
				} else if (weekday.equals("Wednesday")) {
					y = Weekday.WEDNESDAY;
				} else if (weekday.equals("Thursday")) {
					y = Weekday.THURSDAY;
				} else if (weekday.equals("Friday")) {
					y = Weekday.FRIDAY;
				} else if (weekday.equals("Saturday")) {
					y = Weekday.SATURDAY;
				} else if (weekday.equals("Sunday")) {
					y = Weekday.SUNDAY;
				}

				switch (y) {
				case MONDAY:
					list = events[0];
					break;
				case TUESDAY:
					list = events[1];
					break;
				case WEDNESDAY:
					list = events[2];
					break;
				case THURSDAY:
					list = events[3];
					break;
				case FRIDAY:
					list = events[4];
					break;
				case SATURDAY:
					list = events[5];
					break;
				case SUNDAY:
					list = events[6];
					break;
				}

				Node<Events> listHead = list.getHead();
				for (int i = 0; i < list.size(); i++) {
					int number = i + 1;
					System.out.println("This is event number " + number + " " + listHead.getValue().getEvent() + " " + listHead.getValue().getTime());
					listHead = listHead.getNext();
				}
				System.out.println("Which number event would you like to remove?");
				String removeNumber = scanner.nextLine();
				for (int i = 0; i < list.size(); i++) {
					if (Integer.parseInt(removeNumber) == i) {
						list.remove(i);
					}
				}

				
				
				
			} else if (doWhat.equals("view") || doWhat.equals("View")) {

				System.out.println("Which day would you like to view the event on?");
				String weekday = scanner.nextLine();
				Weekday y = Weekday.MONDAY;
				if (weekday.equals("Monday")) {
					y = Weekday.MONDAY;
				} else if (weekday.equals("Tuesday")) {
					y = Weekday.TUESDAY;
				} else if (weekday.equals("Wednesday")) {
					y = Weekday.WEDNESDAY;
				} else if (weekday.equals("Thursday")) {
					y = Weekday.THURSDAY;
				} else if (weekday.equals("Friday")) {
					y = Weekday.FRIDAY;
				} else if (weekday.equals("Saturday")) {
					y = Weekday.SATURDAY;
				} else if (weekday.equals("Sunday")) {
					y = Weekday.SUNDAY;
				}

				switch (y) {
				case MONDAY:
					list = events[0];
					break;
				case TUESDAY:
					list = events[1];
					break;
				case WEDNESDAY:
					list = events[2];
					break;
				case THURSDAY:
					list = events[3];
					break;
				case FRIDAY:
					list = events[4];
					break;
				case SATURDAY:
					list = events[5];
					break;
				case SUNDAY:
					list = events[6];
					break;
				}
				
				Node<Events> listEvent = list.getHead();
				
				for(int i = 0; i < list.size(); i++) {
					System.out.println(listEvent.getValue().getEvent() + " " + listEvent.getValue().getTime());
					listEvent = listEvent.getNext();
				}
				
				
				
				
			} else if (doWhat.equals("exit")|| doWhat.equals("Exit")){
				
				System.exit(0);
				
				
			} else {
				System.out.println("Type again");
			}

			
			
		} while (!exited);

	}
}
