package com.re.fintech.dto;

import com.re.fintech.validation.MultipleOfTenThousand;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class WithdrawRequestDto {

    // Lớp bảo vệ 1: Chống null
    @NotNull(message = "Số tiền rút không được để trống")
    // Lớp bảo vệ 2: Chống số âm và quy định mức tối thiểu
    @Min(value = 50000, message = "Số tiền rút tối thiểu phải từ 50.000 VNĐ trở lên")
    // Lớp bảo vệ 3: Nghiệp vụ chia tiền của ATM
    @MultipleOfTenThousand
    private Long withdrawAmount;

    public Long getWithdrawAmount() { return withdrawAmount; }
    public void setWithdrawAmount(Long withdrawAmount) { this.withdrawAmount = withdrawAmount; }
}