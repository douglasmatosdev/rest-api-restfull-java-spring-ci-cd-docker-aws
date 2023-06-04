package com.douglasmatosdev.mapper;

//import com.github.dozermapper.core.DozerBeanMapperBuilder;
//import com.github.dozermapper.core.Mapper;

import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class DozerMapper {
//    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();
    private static ModelMapper mapper = new ModelMapper();

    public static <Origin, Destination> Destination parseObject(Origin origin, Class<Destination> destination) {
        return mapper.map(origin, destination);
    }

    public static <Origin, Destination> List<Destination> parseListObjects(List<Origin> origin, Class<Destination> destination) {
        List<Destination> destinationObjects = new ArrayList<>();
        for (Origin o : origin) {
            destinationObjects.add(mapper.map(o, destination));
        }
        return destinationObjects;
    }
}
