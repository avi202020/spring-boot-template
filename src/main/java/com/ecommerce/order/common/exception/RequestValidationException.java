package com.ecommerce.order.common.exception;

import java.util.Map;

public class RequestValidationException extends AppException {
    public RequestValidationException(Map<String, Object> data) {
        super(DefaultErrorCode.REQUEST_VALIDATION_FAILED, data);
    }
}
