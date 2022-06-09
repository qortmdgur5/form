package hello.itemservice.domain.item;


import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  FAST: 빠른배송
 *  NORMAL: 일반 배송
 *  SLOW: 느린 배송
 */
@Data
@NoArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;

    public DeliveryCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}

