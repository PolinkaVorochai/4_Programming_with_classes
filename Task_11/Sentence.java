package part_4.Task_11;

import java.util.List;

/*
Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*/
public class Sentence {
    private List<Word> wordList;

    public Sentence(List<Word> wordList) {
        this.wordList = wordList;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    @Override
    public String toString() {
        String result = "";
        for (Word x : wordList) {
            result = result + " " + x;
        }
        return result.trim() + ".";
    }
}
