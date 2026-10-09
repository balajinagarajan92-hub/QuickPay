package merchant_service.controller;

import merchant_service.entity.Merchant;
import merchant_service.service.MerchantService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/merchants")
public class MerchantController {

    private final MerchantService merchantService;

    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @GetMapping("/{merchantId}")
    public ResponseEntity<Merchant> getMerchant(
            @PathVariable String merchantId) {

        return merchantService.getMerchantById(merchantId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}