package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 * Задание, направленное на изучение следующих тем:
 * 1. наследование;
 * 2. полиморфизм;
 * 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {

    /**
     * Объект, выполняющий сравнение объектов типа
     * {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    /**
     * Источник случайного набора экземпляров класса
     * {@link Citizen}.
     * <p>
     * Объектов в источнике должно быть случайное количечство
     * в диапазоне от {@code 20} до {@code 30}.
     * <p>
     * Формировать экземпляры следует с использованием данных
     * словарей, расположенных в пакете
     * {@link ru.avalon.java.ocpjp.labs.resources}.
     */
    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров {@link Citizen}
     * в консоль.
     */
    private ObjectWriter<Citizen> writer;

    public Inheritance() {
        comparator = new CitizenComparator();
        source = new CitizenSource();
        writer = new CitizenWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        List<Citizen> citizens = new ArrayList<>();

        for (Citizen citizen : source) {
            citizens.add(citizen);
        }

        Collections.sort(citizens, comparator);

        citizens.forEach((citizen) -> {
            try {
                writer.write(citizen);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        });
    }
    
}
