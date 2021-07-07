package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {

    Button insertUserBtn;
    EditText editTextName;
    EditText editTextLastName;
    EditText editTextPhone;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);
        user = (User) getIntent().getSerializableExtra("user");
        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextPhone = findViewById(R.id.editTextPhone);

        // Находим кнопку на форме
        insertUserBtn = findViewById(R.id.insertUserBtn);

        if(user != null){
            // Если редактируем юзера
            editTextName.setText(user.getUserName());
            editTextLastName.setText(user.getUserLastName());
            editTextPhone.setText(user.getPhone());
        }else{
            // Если у нас нет пользователя, то мы его создаем
            user = new User();
        }



        // Навешиваем на кнопку обработчик клика
        insertUserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Добавляем остальные свойства. Читаем из текстовых полей на форме, в которые мы печатаем данные
                user.setUserName(editTextName.getText().toString());
                user.setUserLastName(editTextLastName.getText().toString());
                user.setPhone(editTextPhone.getText().toString());

                // Добавляем пользователя
                Users users = new Users(UserFormActivity.this);

                if(user != null){
                    // Редактируем
                    users.updateUser(user);
                }else{
                    // Вызываем добавление пользователя
                    users.addUser(user);
                }


                // Возвращаемся к списку пользователей. Возвращаемся на предыдущую активность
                onBackPressed();
            }
        });
    }
}
