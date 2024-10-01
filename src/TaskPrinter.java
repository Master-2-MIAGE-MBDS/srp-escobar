class TaskPrinter {
    private TaskManager taskManager;

    public TaskPrinter(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    // Générer un rapport des tâches terminées
    public void printCompletedTasks() {
        System.out.println("Taches terminées :");
        for (Task task : taskManager.getTasks()) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks() {
        System.out.println("Taches non terminées :");
        for (Task task : taskManager.getTasks()) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
