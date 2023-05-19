# 2.3. Введение в Maven и Spring Boot
<aside>
<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fb29df97-5867-424b-80e8-1b719d4f1da6/Снимок_экрана_2022-01-20_в_15.12.50.png" alt="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fb29df97-5867-424b-80e8-1b719d4f1da6/Снимок_экрана_2022-01-20_в_15.12.50.png" width="40px" /> **Ваша задача на сегодня**: написать простую версию калькулятора. 

Следуйте инструкции ниже, чтобы справиться с заданием.

</aside>

### Шаг 1

Создать Spring Boot проект calculator.

### Шаг 2

Подключить модуль Spring Web при создании.

### Шаг 3

Написать 5 методов, которые при вызове из браузера делают следующее:

1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".

2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.

4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.

5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.

### При выполнении задания важно учесть

<aside>
<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f37631ca-3d1e-4606-a1c6-56f17f3d1ee0/Снимок_экрана_2022-01-20_в_15.12.50.png" alt="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f37631ca-3d1e-4606-a1c6-56f17f3d1ee0/Снимок_экрана_2022-01-20_в_15.12.50.png" width="40px" /> /calculator повторяется. Рекомендуется использовать @RequestMapping на уровне контроллера.

</aside>

<aside>
<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2b05e69c-55db-43e4-a861-8540b1561603/Снимок_экрана_2022-01-20_в_15.12.50.png" alt="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2b05e69c-55db-43e4-a861-8540b1561603/Снимок_экрана_2022-01-20_в_15.12.50.png" width="40px" /> Деление на 0 в Java выкидывает ошибку.

</aside>

<aside>
<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e88ef99-2227-46f2-ba2a-ad65a4726a71/Снимок_экрана_2022-01-20_в_15.12.50.png" alt="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e88ef99-2227-46f2-ba2a-ad65a4726a71/Снимок_экрана_2022-01-20_в_15.12.50.png" width="40px" /> Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.

</aside>

<aside>
<img src="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1dd53c13-af8f-43ef-8fb3-981e91591bf7/Снимок_экрана_2022-01-20_в_15.12.50.png" alt="https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1dd53c13-af8f-43ef-8fb3-981e91591bf7/Снимок_экрана_2022-01-20_в_15.12.50.png" width="40px" /> Контроллер не должен вычислять результат, а только делегировать его вычисление сервису. После получения от него результата контроллер должен сформировать строку и вернуть пользователю в браузер.

</aside>
