package me.sungbin.demospring53;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @NonNull
    public String createEvent(@NonNull String name) {
        return "hello " + name;
    }
}
