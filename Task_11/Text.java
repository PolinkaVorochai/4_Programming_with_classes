package part_4.Task_11;
/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*/

import java.util.List;

public class Text {
    private List<Sentence> sentenceList;
    private Sentence header;

    //Конструктор:

    public Text(List<Sentence> sentenceList, Sentence header) {
        this.sentenceList = sentenceList;
        this.header = header;
    }


    //Геттеры, сеттеры


    public List<Sentence> getSentenceList() {
        return sentenceList;
    }

    public void setSentenceList(List<Sentence> sentenceList) {
        this.sentenceList = sentenceList;
    }

    public Sentence getHeader() {
        return header;
    }

    public void setHeader(Sentence header) {
        this.header = header;
    }

    //метод: вывод текста на экран
    public void printText(Text text) {
        System.out.println("Ваш текст: ");

        System.out.println(text.toString());
    }

    //метод: вывод заголовка текста на экран
    public void printNameOfTheText(Text text) {
        System.out.println("Заголовок текста: ");
        System.out.println(text.getHeader().toString());
    }


    //метод: вывести на экран дополненный текст
    public void printPlusText(Text text, Sentence plusText) {
        System.out.println("Дополненный текст: ");
        System.out.println(text.toString());
        System.out.print(plusText.toString());
    }

    @Override
    public String toString() {
        String result = "";
        for (Sentence x : sentenceList) {
            result = result + " " + x;
        }
        return getHeader().toString() + "\n" + result.trim();
    }
}

