public class Todo_list {

    private String taskDescription;
    private boolean isCompleted;

    // constructor to initialise the task with the description
    public void Todo(String taskDescription) {
        this.taskDescription = taskDescription;
        this.isCompleted = false;
        // by default task is not completed when it is created
    }

    // Getter for the task description
    public String getTaskDescription() {
        return taskDescription;
    }

    // Setter for the task description
    public void settaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    // Method to mark a task as completed
    public void markCompleted() {
        this.isCompleted = true;
    }

    // Method to check if the task is completed
    public boolean isCompleted() {
        this.isCompleted = true;
        return isCompleted;
    }

    // Override the toString() method to provide a readable representation of the task
    @Override 
    public String toString() {
        String status = isCompleted ? "[X]" : "[]";
        return status + " " + taskDescription;
    }
}
