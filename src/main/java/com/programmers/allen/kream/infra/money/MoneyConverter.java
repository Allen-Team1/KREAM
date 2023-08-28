package com.programmers.allen.kream.infra.money;

import com.programmers.allen.kream.common.Money;
import jakarta.persistence.AttributeConverter;

public class MoneyConverter implements AttributeConverter<Money, Long> {
    @Override
    public Long convertToDatabaseColumn(Money attribute) {
        return attribute.get().longValue();
    }

    @Override
    public Money convertToEntityAttribute(Long dbData) {
        return Money.wons(dbData);
    }
}
