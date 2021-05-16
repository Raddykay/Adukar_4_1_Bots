package by.adukar.telegrambot.buttons.inline;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineButtons {
    public InlineKeyboardMarkup keyboardMarkup() {
        List<List<InlineKeyboardButton>> listKeyboard = new ArrayList<>();
        List<InlineKeyboardButton> buttonsList = new ArrayList<>();
        InlineKeyboardButton keyboardButton = new InlineKeyboardButton();
        keyboardButton.setCallbackData("test");
        keyboardButton.setText("test");
        buttonsList.add(keyboardButton);
        listKeyboard.add(buttonsList);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(listKeyboard);
        return inlineKeyboardMarkup;
    }

}
