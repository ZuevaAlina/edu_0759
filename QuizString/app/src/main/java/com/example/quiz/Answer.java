package com.example.quiz;

public class Answer {
    private int userClick;
    private boolean userResult;

    public Answer(int userClick, boolean userResult) {
        this.userClick = userClick;
        this.userResult = userResult;
    }

    public int getUserClick() {
        return userClick;
    }

    public void setUserClick(int userClick) {
        this.userClick = userClick;
    }

    public boolean isUserResult() {
        return userResult;
    }

    public void setUserResult(boolean userResult) {
        this.userResult = userResult;
    }
}
