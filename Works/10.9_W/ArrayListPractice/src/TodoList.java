import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this(new ArrayList<String>());
    }

    public TodoList(ArrayList<String> todoList) {
        this.todoList = todoList;
    }

    public boolean testIndex(int caseIndex) {
        return (caseIndex < 0) || (todoList.size() < caseIndex);
    }

    public void addCase(String userCase) {
        addCase(todoList.size(), userCase);
    }

    public ArrayList<String> getTodoList() {
        return todoList;
    }

    public void addCase(int caseIndex, String userCase) {
        if (testIndex(caseIndex)) {
            addCase(userCase);
        } else {
            System.out.println("Добавлено дело \"" + userCase + "\"");
            if (todoList.isEmpty() || todoList.size() == caseIndex) {
                todoList.add(userCase);
            } else {
                todoList.add(caseIndex, userCase);
            }
        }
    }

    public void deleteCase(int caseIndex) {
        if (testIndex(caseIndex)) {
            System.out.println("Дело с таким номером не существует");
        } else {
            System.out.println("Дело \"" + todoList.get(caseIndex) + "\" удалено");
            todoList.remove(caseIndex);
        }
    }

    public void printList() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

    public void editCase(int caseIndex, String userCase) {
        if (testIndex(caseIndex)) {
            System.out.println("Дело с таким номером не существует");
        } else {
            System.out.println("Дело \"" + todoList.get(caseIndex) + "\" было заменено на \"" + userCase + "\"");
            todoList.set(caseIndex, userCase);
        }
    }
}
