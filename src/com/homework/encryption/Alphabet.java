package com.homework.encryption;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Alphabet {
    static Map<Character, Integer> alphabet44 = Stream.of(new Object[][]{
            {'А', 1},
            {'Б', 2},
            {'В', 3},
            {'Г', 4},
            {'Д', 5},
            {'Е', 6},
            {'Ё', 7},
            {'Ж', 8},
            {'З', 9},
            {'И', 10},
            {'Й', 11},
            {'К', 12},
            {'Л', 13},
            {'М', 14},
            {'Н', 15},
            {'О', 16},
            {'П', 17},
            {'Р', 18},
            {'С', 19},
            {'Т', 20},
            {'У', 21},
            {'Ф', 22},
            {'Х', 23},
            {'Ц', 24},
            {'Ч', 25},
            {'Ш', 26},
            {'Щ', 27},
            {'Ъ', 28},
            {'Ы', 29},
            {'Ь', 30},
            {'Э', 31},
            {'Ю', 32},
            {'Я', 33},
            {' ', 34},
            {'0', 35},
            {'1', 36},
            {'2', 37},
            {'3', 38},
            {'4', 39},
            {'5', 40},
            {'6', 41},
            {'7', 42},
            {'8', 43},
            {'9', 44},
    }).collect(Collectors.toMap(data -> (Character) data[0], data -> (Integer) data[1]));

    static Map<Integer, Character> numAlphabet44 = Stream.of(new Object[][]{
            {1, 'А'},
            {2, 'Б'},
            {3, 'В'},
            {4, 'Г'},
            {5, 'Д'},
            {6, 'Е'},
            {7, 'Ё'},
            {8, 'Ж'},
            {9, 'З'},
            {10, 'И'},
            {11, 'Й'},
            {12, 'К'},
            {13, 'Л'},
            {14, 'М'},
            {15, 'Н'},
            {16, 'О'},
            {17, 'П'},
            {18, 'Р'},
            {19, 'С'},
            {20, 'Т'},
            {21, 'У'},
            {22, 'Ф'},
            {23, 'Х'},
            {24, 'Ц'},
            {25, 'Ч'},
            {26, 'Ш'},
            {27, 'Щ'},
            {28, 'Ъ'},
            {29, 'Ы'},
            {30, 'Ь'},
            {31, 'Э'},
            {32, 'Ю'},
            {33, 'Я'},
            {34, ' '},
            {35, '0'},
            {36, '1'},
            {37, '2'},
            {38, '3'},
            {39, '4'},
            {40, '5'},
            {41, '6'},
            {42, '7'},
            {43, '8'},
            {44, '9'},
    }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (Character) data[1]));
}