package com.company;

import logic.Logic;
import presentation.Cli;

public class Main {

    public static void main(String[] args) {
        Cli.cli();
        Cli.mainmenu();
        Logic.resolver();

    }
}
