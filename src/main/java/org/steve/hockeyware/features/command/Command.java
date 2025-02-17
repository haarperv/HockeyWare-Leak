package org.steve.hockeyware.features.command;


import org.steve.hockeyware.features.Globals;

import java.util.List;

public abstract class Command implements Globals {
    private final String name;
    private final String description;
    private final String syntax;

    public Command(String name, String description, String syntax) {
        this.name = name;
        this.description = description;
        this.syntax = syntax;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSyntax() {
        return syntax;
    }

    public abstract void runCommand(List<String> args);
}
