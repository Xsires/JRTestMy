package ru.sky.jrtesttask.dao;

import ru.sky.jrtesttask.model.Component;

import java.util.List;

public interface ComponentDao {
    void addComponent(Component component);
    void updateComponent(Component component);
    void deleteComponent(Component component);
    Component getComponentById(int id);
    List<Component> getComponentByName(String name);
    List<Component> getAllComponentList();
    List<Component> getFilterComponentList(boolean need);
}
