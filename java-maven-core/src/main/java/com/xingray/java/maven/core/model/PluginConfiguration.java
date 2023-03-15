package com.xingray.java.maven.core.model;

public class PluginConfiguration {
    private PluginManagement pluginManagement;

    public PluginManagement getPluginManagement() {
        return pluginManagement;
    }

    public void setPluginManagement(PluginManagement pluginManagement) {
        this.pluginManagement = pluginManagement;
    }

    @Override
    public String toString() {
        return "PluginConfiguration{" +
                "pluginManagement=" + pluginManagement +
                '}';
    }
}
