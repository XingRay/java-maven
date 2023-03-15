package com.xingray.java.maven.core.io;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xingray.java.maven.core.model.MavenProject;

import java.io.File;
import java.io.IOException;

public class JacksonMavenConverter {

    private final XmlMapper xmlMapper;

    public JacksonMavenConverter() {
        this(XmlMapper.builder()
                .configure(MapperFeature.USE_STD_BEAN_NAMING, true)
                .defaultUseWrapper(true)
                .configure(SerializationFeature.INDENT_OUTPUT, true)
                .serializationInclusion(JsonInclude.Include.NON_NULL)
                .build());
    }

    public JacksonMavenConverter(XmlMapper xmlMapper) {
        this.xmlMapper = xmlMapper;
    }

    public String toXmlString(MavenProject model) {
        try {
            return xmlMapper.writeValueAsString(model);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public MavenProject fromXmlString(String s) throws JsonProcessingException {
        return xmlMapper.readValue(s, MavenProject.class);
    }

    public void writeToFile(MavenProject model, File file) throws IOException {
        xmlMapper.writeValue(file, model);
    }

    public MavenProject readFromFile(File file) throws IOException {
        return xmlMapper.readValue(file, MavenProject.class);
    }
}
