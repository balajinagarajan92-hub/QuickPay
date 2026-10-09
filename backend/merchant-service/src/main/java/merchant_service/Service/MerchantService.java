package merchant_service.service;

import merchant_service.entity.Merchant;
import merchant_service.repository.MerchantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MerchantService {

    private final MerchantRepository merchantRepository;

    public MerchantService(MerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public Optional<Merchant> getMerchantById(String merchantId) {
        return merchantRepository.findById(merchantId);
    }
}