package net.cloudkit.ecosystem.experiment.infrastructure.support.commands;

public interface CommandHandler<C, R> {

    public R handle(C command);
}
