package com.dynamo.cr.properties;

import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IStatus;

public interface IPropertyModel<T, U extends IPropertyObjectWorld> {

    public IPropertyDesc<T, U>[] getPropertyDescs();

    ICommandFactory<T, U> getCommandFactory();

    public U getWorld();

    public Object getPropertyValue(Object id);

    public IUndoableOperation setPropertyValue(Object id, Object value);

    public boolean isPropertyEditable(Object id);

    public IStatus getPropertyStatus(Object id);

    public boolean isValid();

}
