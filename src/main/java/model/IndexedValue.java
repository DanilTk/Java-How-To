package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IndexedValue<T> {
    Integer index;
    T value;
}
