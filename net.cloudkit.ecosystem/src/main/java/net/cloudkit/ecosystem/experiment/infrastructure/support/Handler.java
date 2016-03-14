package net.cloudkit.ecosystem.experiment.infrastructure.support;

public interface Handler<T> {

    Object handle(CommandMessage<T> commandMessage, UnitOfWork unitOfWork);
}
