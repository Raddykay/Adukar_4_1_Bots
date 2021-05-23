package by.adukar.telegrambot.buttons.reply;

import by.adukar.telegrambot.consts.Paths;
import by.adukar.telegrambot.service.TextService;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.IOException;
import java.util.ArrayList;



public class ReplyButtons {

    TextService textService = new TextService();

    public ReplyKeyboardMarkup keyboardMarkupForSelectStudentOrTeacher() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("Страны");
        keyboardFirstRow.add("опрос");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }

    public ReplyKeyboardMarkup keyboardMarkupForSelectCountry() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("Англия");
        keyboardFirstRow.add("Франция");
        keyboardFirstRow.add("Испания");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectАнглия() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("достопримечательностиА");
        keyboardFirstRow.add("координатыA");
        keyboardFirstRow.add("оценка");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectИспания() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("достопримечательностиS");
        keyboardFirstRow.add("координатыS");
        keyboardFirstRow.add("оценка");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectФранция() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("достопримечательностиF");
        keyboardFirstRow.add("координатыF");
        keyboardFirstRow.add("оценка");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectattractionsA() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("БукингемскийДворец");
        keyboardFirstRow.add("Стоунхендж");
        keyboardFirstRow.add("Биг-Бен");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectattractionsS() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("ХрамСвятогоСемейства");
        keyboardFirstRow.add("ЗамокКоломарес");
        keyboardFirstRow.add("СантьягоДеКомпостело");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectattractionsF() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("ЭйфелеваБашня");
        keyboardFirstRow.add("ДворецФонтенбло");
        keyboardFirstRow.add("ПарижскийДиснейлэнд");

        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectBuckinghamPalace() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыBKP");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectStonehenge() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыSTEGE");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectХрамСвятогоСемейства() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыHMS");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectBigBan() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыBGBN");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectЗамокКоломарес() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыZMK");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectСантьягоДеКомпостело() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыSDEKOM");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectЭйфелеваБашня() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыELB");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectСантьягоДворецФонтенбло() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыFNTBLO");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectПарижскийДиснейлэнд() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("назад");
        keyboardFirstRow.add("координатыPRDL");
        keyboardFirstRow.add("оценка");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectназад() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("опрос");
        keyboardFirstRow.add("Страны");


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }
    public ReplyKeyboardMarkup keyboardMarkupForSelectоценка() {

        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        keyboardMarkup.setSelective(true);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setOneTimeKeyboard(false);

        keyboardFirstRow.add("⭐");
        keyboardFirstRow.add("⭐2");
        keyboardFirstRow.add("⭐3");
        keyboardFirstRow.add("⭐4");
        keyboardFirstRow.add("⭐5");
        keyboardFirstRow.add("назад");



        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }

}
