package com.xingray.java.maven.core.model;

import java.util.List;
import java.util.Map;

public class Reporting {
    private String excludeDefaults;

    private String outputDirectory;

    private List<ReportPlugin> plugins;

    private Map<Object, InputLocation> locations;
}
