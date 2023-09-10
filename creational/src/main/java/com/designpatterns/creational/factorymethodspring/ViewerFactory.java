package com.designpatterns.creational.factorymethodspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ViewerFactory {

    private static Map<ViewerType, Viewer> viewerMap;

    @Autowired
    private ViewerFactory(List<Viewer> viewers) {
        viewerMap = viewers.stream().collect(Collectors.toUnmodifiableMap(Viewer::getType, Function.identity()));
    }

    public static <T> Viewer<T> getViewer(ViewerType viewerType) {
        return Optional.ofNullable(viewerMap.get(viewerType)).orElseThrow(IllegalArgumentException::new);
    }
}
