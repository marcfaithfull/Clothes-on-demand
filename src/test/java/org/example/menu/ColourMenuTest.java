package org.example.menu;

import org.example.colour.BlueColour;
import org.example.colour.Colour;
import org.example.colour.GreenColour;
import org.example.colour.RedColour;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class ColourMenuTest {

    private ColourMenu colourMenu;
    private ByteArrayInputStream testIn;
    private Scanner scanner;

    @BeforeEach
    void setUp() {
        colourMenu = new ColourMenu();
        scanner = new Scanner(System.in);
    }

    @AfterEach
    void tearDown() {
        colourMenu = null;
        testIn = null;
        scanner.close();
    }

    private void InputStream(String input) {
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }

    @Test
    void testRedColour() {
        InputStream("1");
        Colour colour = colourMenu.chooseColour(new Scanner(System.in));
        assertTrue(colour instanceof RedColour);
    }

    @Test
    void testGreenColour() {
        InputStream("2");
        Colour colour = colourMenu.chooseColour(new Scanner(System.in));
        assertTrue(colour instanceof GreenColour);
    }

    @Test
    void testBlueColour() {
        InputStream("3");
        Colour colour = colourMenu.chooseColour(new Scanner(System.in));
        assertTrue(colour instanceof BlueColour);
    }

    @Test
    void testInvalidStringThenValidInteger() {
        InputStream("a\n1");
        Colour colour = colourMenu.chooseColour(new Scanner(System.in));
        assertTrue(colour instanceof RedColour);
    }

    @Test
    void testInvalidIntegerThenValidInteger() {
        InputStream("9\n1");
        Colour colour = colourMenu.chooseColour(new Scanner(System.in));
        assertTrue(colour instanceof RedColour);
    }
}