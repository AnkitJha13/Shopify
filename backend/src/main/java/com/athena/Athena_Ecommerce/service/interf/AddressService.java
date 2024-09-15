package com.athena.Athena_Ecommerce.service.interf;

import com.athena.Athena_Ecommerce.dto.AddressDto;
import com.athena.Athena_Ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
