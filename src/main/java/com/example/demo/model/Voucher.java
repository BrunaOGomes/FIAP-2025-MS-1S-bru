import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class Voucher {
    @NotBlank(message = "Codigo é requerido")
    @Pattern(regexp = "^[A-Z0-9]{4,10}$", message = "Código precisa ter entre 4 e 10 letras maiúsculas é números")
    private String code;

    @NotNull(message = "Tipo é requerido")
    private String type;
     @NotNull(message = "Valor é requetido")
    @Positive(message = "Não pode ser negativo")
    private BigDecimal value;
    @NotNull(message = "Valor é requetido")
    @Positive(message = "Precisa ser positivo")
    private LocalDateTime minimulPuchase;

     @NotNull(message = "Valor é requetido")
    @Positive(message = "Expiracao precisa ser futura")
    private BigDecimal expirationDate;

     @NotNull(message = "Limite é requetido")
    @Positive(message = "Tem que ser ao menos 1")
    private Integer usageLimit;
    private Integer usageCount = 0;

}