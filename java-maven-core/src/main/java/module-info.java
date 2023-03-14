module com.xingray.java.maven.core {
    requires com.fasterxml.jackson.dataformat.xml;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;

    exports com.xingray.java.maven.core.model;
    opens com.xingray.java.maven.core.model;
}