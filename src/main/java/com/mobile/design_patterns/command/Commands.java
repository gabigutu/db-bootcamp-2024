package com.mobile.design_patterns.command;

class CommandStay implements ICommandDog {
    @Override
    public void execute(Dog dog) {
        dog.stay();

        /*
        execute(File file, User user, FileManager fileManager)
        if (user.hasDeleteRights) {
            fileManager.deleteFile(file, user);
        }
         */
    }
}

class CommandBring implements ICommandDog {
    @Override
    public void execute(Dog dog) {
        dog.bring();
    }
}

class CommandStand implements ICommandDog {
    @Override
    public void execute(Dog dog) {
        dog.stand();
    }
}