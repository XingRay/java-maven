package com.xingray.java.maven.core.model;

import java.util.List;
import java.util.Map;

public class PluginContainer {
    private java.util.List<Plugin> plugins;

    private java.util.Map<Object, InputLocation> locations;

    public List<Plugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    public Map<Object, InputLocation> getLocations() {
        return locations;
    }

    public void setLocations(Map<Object, InputLocation> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "PluginContainer{" +
                "plugins=" + plugins +
                ", locations=" + locations +
                '}';
    }
}
