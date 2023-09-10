package com.designpatterns.creational.factorymethodspring;

import org.springframework.stereotype.Service;

@Service
public class DocumentViewer implements Viewer<Document> {

    @Override
    public ViewerType getType() {
        return ViewerType.DOCUMENT;
    }

    @Override
    public void view(Document object) {

    }
}
