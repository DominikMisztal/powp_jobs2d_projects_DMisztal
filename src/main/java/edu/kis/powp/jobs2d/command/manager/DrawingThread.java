package edu.kis.powp.jobs2d.command.manager;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;

import java.util.List;

public class DrawingThread implements Runnable{
    private final List<DriverCommand> commands;
    private final Job2dDriver driver;
    public DrawingThread(List<DriverCommand> commands, Job2dDriver driver){
        this.commands = commands;
        this.driver = driver;
    }

    @Override
    public void run(){
        commands.forEach(command -> command.execute(driver));
    }
}