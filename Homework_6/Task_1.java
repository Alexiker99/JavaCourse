package JavaCourse.Homework_6;

import java.util.LinkedHashMap;

/* 
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
*/

public class Task_1 {
    public static void main(String[] args) {

        NoteBookShop shop = new NoteBookShop();
        shop.addNoteBook(new NoteBook("Xiaomi", "NotebookPro15.6", "RAM: 2048, OS: Windows11, SSD: 512, Color: Silver"));
        shop.addNoteBook(new NoteBook("Apple", "MacBookPro", "RAM: 4096, OS: MacOS, SSD: 1000, Color: Silver"));
        shop.addNoteBook(new NoteBook("Lenovo", "X300", "RAM: 4096, OS: AOS, SSD: 1000, Color: Blue"));
        shop.addNoteBook(new NoteBook("Asus", "ZenbookPro16XOled", "RAM: 1024, OS: Windows11, SSD: 512, Color: Black"));
        shop.addNoteBook(new NoteBook("MSI", "KatanaGF76", "RAM: 4096, OS: Windows11, SSD: 512, Color: Black"));
        shop.addNoteBook(new NoteBook("Huawei", "MateBookD15", "RAM: 4096, OS: Windows10, SSD: 1000, Color: White"));
        shop.addNoteBook(new NoteBook("Samsung", "NP750", "RAM: 1024, OS: Windows11, SSD: 128, Color: Black"));


        shop.userMenu();
    }
}