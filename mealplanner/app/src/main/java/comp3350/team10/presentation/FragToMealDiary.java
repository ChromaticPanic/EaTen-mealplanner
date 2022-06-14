package comp3350.team10.presentation;

import comp3350.team10.objects.*;

public interface FragToMealDiary {
    public void showContextUI(int pos);
    public void selectDate();
    public void prevDate();
    public void nextDate();
    public void showGoalEntryDialog();
    public void removeItem(int pos);
    public void editItem(int pos);
    public void showExerciseEntryDialog();
    public void addEntry(int pos);
    public String getEntryQty();
    public Edible.Unit getEntryUnit();
    public void setEntryQty(Integer amount, String unit);
    public String getExerciseCalories();
    public void setExerciseCalories(Integer value);
    public String getGoalCalories();
    public void setGoalCalories(Integer value);
}
