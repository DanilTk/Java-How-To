package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IndexedValue<T> {
    Integer index;
    T value;
}
