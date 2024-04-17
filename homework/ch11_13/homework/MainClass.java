package homework.ch11_13.homework;

/**
 * @author icyyoung
 */
public class MainClass {
    public static void main(String[] args) {
        //initialize
        DrinkTask taskDrink = new DrinkTask();
        EatTask taskEat = new EatTask();
        SleepTask taskSleep = new SleepTask();
        TaskServiceImpl tasksList = new TaskServiceImpl();
        //add to list
        tasksList.addTask(taskEat);
        tasksList.addTask(taskDrink);
        tasksList.addTask(taskSleep);
        //execute
        tasksList.exeuteTasks();
    }
}
