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

        keyboardFirstRow.add("Country");
        keyboardFirstRow.add("...");


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
        keyboardFirstRow.add("attractionsA");
        keyboardFirstRow.add("coordinatesA");

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
        keyboardFirstRow.add("attractionsS");
        keyboardFirstRow.add("coordinatesS");

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
        keyboardFirstRow.add("attractionsF");
        keyboardFirstRow.add("coordinatesF");

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
        keyboardFirstRow.add("BuckinghamPalace");
        keyboardFirstRow.add("Stonehenge");
        keyboardFirstRow.add("BigBan");

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


        keyboard.add(keyboardFirstRow);
        keyboardMarkup.setKeyboard(keyboard);
        return keyboardMarkup;

    }

}
