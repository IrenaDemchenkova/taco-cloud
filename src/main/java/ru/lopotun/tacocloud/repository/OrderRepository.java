package ru.lopotun.tacocloud.repository;

import ru.lopotun.tacocloud.models.Taco;
import ru.lopotun.tacocloud.models.TacoOrder;

public interface OrderRepository {
   TacoOrder save (TacoOrder order);
}
