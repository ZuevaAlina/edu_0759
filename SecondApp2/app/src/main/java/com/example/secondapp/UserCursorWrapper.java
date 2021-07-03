package com.example.secondapp;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.secondapp.database.UserDbSchema;

import java.util.UUID;

public class UserCursorWrapper extends CursorWrapper {
    public UserCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    /* Метод который возвращает пользователя. Вычитывает одного пользователя и возвращает,
    * пока пользователя не кончатся */
    public User getUser(){

        /* Переменные, в котрых будут храниться данные, которые необходимы для формирования пользователя
        * Обратное сопоставление. Исходя из данных, которые есть в таблице нам нужно собрать объект */
        String uuidString = getString(getColumnIndex(UserDbSchema.Cols.UUID));
        String userName = getString(getColumnIndex(UserDbSchema.Cols.USERNAME));
        String userLastName = getString(getColumnIndex(UserDbSchema.Cols.USERLASTNAME));
        String phone = getString(getColumnIndex(UserDbSchema.Cols.PHONE));

        /* Создаем пользователя.
        * В UUID есть специальный метод fromString, который извлекает из строки UUID */
        User user = new User(UUID.fromString(uuidString));
        user.setUserName(userName);
        user.setUserLastName(userLastName);
        user.setPhone(phone);
        return user;
    }
}
