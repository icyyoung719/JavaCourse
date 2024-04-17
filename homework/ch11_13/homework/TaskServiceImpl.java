package homework.ch11_13.homework;

import java.util.ArrayList;

/**
 * @author icyyoung
 * @return null
 * @description TODO
 * @date 2024/4/15 16:35
 */
public class TaskServiceImpl implements TaskService {
    /**
     * 执行任务接口列表中的每个任务
     */
    ArrayList<Task> taskList = new ArrayList<>();

    @Override
    public void exeuteTasks() {
        for (Task nextTask : taskList) {
            nextTask.execute();
        }
    }

    /**
     * 添加任务
     *
     * @param t 新添加的任务
     */
    @Override
    public void addTask(Task t) {
        taskList.add(t);
    }
}
