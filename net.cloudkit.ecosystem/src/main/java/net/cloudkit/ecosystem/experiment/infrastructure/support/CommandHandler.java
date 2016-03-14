package net.cloudkit.ecosystem.experiment.infrastructure.support;

public interface CommandHandler<C, R> extends Handler<C> {

    public R handle(C command);
}
