import com.example.demo.model.Voucher;

@RestController
@RequestMapping("/api/v1/vouchers")
@Tag(name = "Voucher", description = "API de vouchers e descontos")
public class VoucherController {
    @PostMapping
    @Operation(responceCode = "200", description = "Criado com sucesso")
    @Operation(responceCode = "400", description = "Dados inválidos")
    public ResponseEntity<Voucher> createVoucher(@Valid @RequestBody Voucher voucher) {
        return ResponseEntity.ok(voucher);
    }
}