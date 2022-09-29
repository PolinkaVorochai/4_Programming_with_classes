package part_4.Task_13;

import java.util.ArrayList;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на
// консоль столицу, количество областей, площадь, областные центры.
public class Runner {
    public static void main(String[] args) {
        ArrayList<Region> regionArrayList = new ArrayList<>();
        regionArrayList.add(new Region("Минск", "39 854 км. кв."));
        regionArrayList.add(new Region("Гомель", "40 372 км. кв."));
        regionArrayList.add(new Region("Витебск", "40 051 км. кв."));
        regionArrayList.add(new Region("Гродно", "25 127 км. кв."));
        regionArrayList.add(new Region("Могилев", "29 068 км. кв."));
        regionArrayList.add(new Region("Брест", "32 786 км. кв."));

        ArrayList<Area> areaArrayList = new ArrayList<>();
        areaArrayList.add(new Area("Барановичский"));
        areaArrayList.add(new Area("Белыничский"));
        areaArrayList.add(new Area("Березенский"));
        areaArrayList.add(new Area("Березовский"));
        areaArrayList.add(new Area("Берестовицкий"));
        areaArrayList.add(new Area("Бешенковчский"));
        areaArrayList.add(new Area("Бобруйский"));
        areaArrayList.add(new Area("Борисовский"));
        areaArrayList.add(new Area("Брагинский"));
        areaArrayList.add(new Area("Браславский"));
        areaArrayList.add(new Area("Бресткий"));
        areaArrayList.add(new Area("Буда-Кошелевский"));
        areaArrayList.add(new Area("Быховский"));
        areaArrayList.add(new Area("Верхнедвинский"));
        areaArrayList.add(new Area("Ветковский"));
        areaArrayList.add(new Area("Вилейский"));
        areaArrayList.add(new Area("Витебский"));
        areaArrayList.add(new Area("Волковысский"));
        areaArrayList.add(new Area("Воложинский"));
        areaArrayList.add(new Area("Вороновский"));
        areaArrayList.add(new Area("Ганцевичский"));
        areaArrayList.add(new Area("Глубокский"));
        areaArrayList.add(new Area("Глусский"));
        areaArrayList.add(new Area("Гомельский"));
        areaArrayList.add(new Area("Горецкий"));
        areaArrayList.add(new Area("Городокский"));
        areaArrayList.add(new Area("Гродненский"));
        areaArrayList.add(new Area("Джержинский"));
        areaArrayList.add(new Area("Добрушский"));
        areaArrayList.add(new Area("Докшицкий"));


        ArrayList<Town> townArrayList = new ArrayList<>();
        townArrayList.add(new Town("Барановичи"));
        townArrayList.add(new Town("Брест"));
        townArrayList.add(new Town("Пинск"));
        townArrayList.add(new Town("Витебск"));
        townArrayList.add(new Town("Новополоцк"));
        townArrayList.add(new Town("Жодино"));
        townArrayList.add(new Town("Бобруйск"));
        townArrayList.add(new Town("Жлобин"));
        townArrayList.add(new Town("Гомель"));
        townArrayList.add(new Town("Гродно"));
        townArrayList.add(new Town("Могилев"));
        townArrayList.add(new Town("Минск"));
        townArrayList.add(new Town("Витебск"));

        State belarus = new State("Минск", areaArrayList, regionArrayList, townArrayList);
        belarus.printOfTheCountry();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printOfTheCity();

    }
}
