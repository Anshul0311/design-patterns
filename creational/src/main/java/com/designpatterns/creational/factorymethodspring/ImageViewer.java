package com.designpatterns.creational.factorymethodspring;

import org.springframework.stereotype.Service;

@Service
public class ImageViewer implements Viewer<Image> {

    @Override
    public ViewerType getType() {
        return ViewerType.IMAGE;
    }

    @Override
    public void view(Image object) {

    }
}
