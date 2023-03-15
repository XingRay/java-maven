package com.xingray.java.maven.core.model;

public class Activation {
    private boolean activeByDefault = false;

    /**
     *
     *
     *             Specifies that this profile will be activated
     * when a matching JDK is detected.
     *             For example, <code>1.4</code> only activates on
     * JDKs versioned 1.4,
     *             while <code>!1.4</code> matches any JDK that is
     * not version 1.4. Ranges are supported too:
     *             <code>[1.5,)</code> activates when the JDK is
     * 1.5 minimum.
     *
     *
     */
    private String jdk;

    /**
     * Specifies that this profile will be activated when matching
     * operating system
     *             attributes are detected.
     */
    private ActivationOS os;

    /**
     * Specifies that this profile will be activated when this
     * system property is
     *             specified.
     */
    private ActivationProperty property;

    /**
     * Specifies that this profile will be activated based on
     * existence of a file.
     */
    private ActivationFile file;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;
}
