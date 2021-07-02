package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Cоздаем переменную, которая помогает подключить виджет recyclerView
    RecyclerView recyclerView;

    // Создаем массив пользователей
    ArrayList<User> users = new ArrayList<>();

    // Создаем объект userAdapter
    UserAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // В переменную кладем виджет recyclerView (это список, у него есть элементы)
        recyclerView = findViewById(R.id.recyclerview);

        /* Необходимо воспользоваться Layout менеджером. Бывают разные Layout менеджеры.
         * Мы вибираем линейный и кладем в него активность MainActivity*/
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        /* Каждый элемент списка это отдельный single_item
        * Создаем цикл генирирующий 100 объектов в коллекцию users*/
        for (int i = 0; i < 100; i++) {

            // Создаем нового пользователя
            User user = new User();
            user.setUserName("Пользователь №"+i);
            user.setUserLastName("Фамилия №"+i);

            // Добавляем пользователя в коллекцию
            users.add(user);
        }

        // Необходимо реализовать Adapter и ViewHolder так как RecyclerView занимается только отображение элементов.

        /* Содадим Adapter чтобы передавать элементы на RecyclerView.
         * Будем создавать элементы списка, а Adapter будет передавть на RecyclerView.
         * Adapter будет знать сколько всего элементов, какие именно элементы (1-й, 23-й)*/

        // Кладем список элементов в переменную userAdapter
        userAdapter = new UserAdapter(users);

        // Адаптер отдаем RecyclerView
        recyclerView.setAdapter(userAdapter);
    }

    // Создаем ViewHolder
    private class UserHolder extends RecyclerView.ViewHolder{
        TextView itemTextView;

        // Создаем конструктор. Внутри принимаем 2 аргумента. 1-й Layout инфлятор, 2-й ViewGroup

        public UserHolder(LayoutInflater inflater, ViewGroup viewGroup) {
            super(inflater.inflate(R.layout.single_item, viewGroup, false));

            /* Раньше мы делали так
            * itemTextView = findViewById(R и так далее)
            * Но сейчас мы UserHolder наследуем от RecyclerView и берем метод itemView
            * itemView - текущий layout single_item*/
            itemTextView =itemView.findViewById(R.id.itemTextView);
        }

        // Создадим метод bind, который займется связкой параметров в классе UserHolder
          public void bind(String userString){

              // В itemTextView печатаем текст userString
              itemTextView.setText(userString);
          }
    }


    /* Adapter помещает элементы на RecyclerView. Adapter перемещает элементы на экран.
    * Наследует все что есть у RecyclerView.
    * В <> кладем класс вьюхолдера, который нужно использовать.
    * ViewHolder - генерирует элементы списка*/
    private class UserAdapter extends RecyclerView.Adapter<UserHolder>{

        // Принимаем из onCreate созданных пользователей
        ArrayList<User> users;
        public UserAdapter(ArrayList<User> users) {
            this.users = users;
        }

        // В Адаптере всегда используются 3 метода:

        /* 1-й метод родительского класса. Создает новый элемент списка
        * На вход принимает 2 аргумента. 1-й viewGroop(куда мы будем размещать наш элемент) и
        * второй getItemCount(счетчик)*/
        @Override
        public UserHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

            // Создадим инфлятор. Он будет раздувать нам макет на главной активности
            LayoutInflater inflater = LayoutInflater.from(MainActivity.this);

            // Возвращает  созданный элемент в RecyclerView пустым
            return new UserHolder(inflater, viewGroup);
        }

        /* 2-й метод родительского класса. Берет данные которые мы ему даем и кладет их в элемент списка
        * Используется для привязки
        * position - этот тот элемент списка, который будет отображаться на экране*/
        @Override
        public void onBindViewHolder(UserHolder userHolder, int position) {

            // Достанем пользователя по идентификатору и запишем в переменную user
            User user = users.get(position);

            // Обратимся к пользователю и сделаем из имени и фамилии строку
            String userString = user.getUserName()+"\n"+user.getUserLastName();

            // Вызываем метод bind у объекта userHolder чтобы отобразить это на экране
            userHolder.bind(userString);

        }

        // 3-й метод родительского класса. Возвращает кол-во данных или элементов
        @Override
        public int getItemCount() {

            // Возвращаем кол-во созданных элементов
            return users.size();
        }
    }
}
