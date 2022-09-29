package part_4.Task_11;

import java.util.List;

/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*/
public class Runner {
    public static void main(String[] args) {
        Sentence sentence = new Sentence(List.of(
                new Word("Приглашаю"),
                new Word("Вас"),
                new Word("25:05"),
                new Word("на"),
                new Word("семинар")
        ));

        //"Приглашаю Вас 25.05 в 15:30 на семинар по java. Формат проведения online.");

        Sentence header = new Sentence(List.of(new Word("Объявление")));
        Text text = new Text(List.of(sentence), header);
        text.printText(text);
//        text.printNameOfTheText(text);
//        Sentence plusText = new Sentence("Внимание! Перенос даты семинара с 25.05 на 27.05. Время семинара без изменений - 15:30.");
//        text.printPlusText(text, plusText);

    }
}
