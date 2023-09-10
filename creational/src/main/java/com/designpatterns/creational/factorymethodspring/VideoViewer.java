package com.designpatterns.creational.factorymethodspring;

import org.springframework.stereotype.Service;

@Service
public class VideoViewer implements Viewer<Video> {

    @Override
    public ViewerType getType() {
        return ViewerType.VIDEO;
    }

    @Override
    public void view(Video object) {

    }
}
