package Learn_App.Banking.dto;

import lombok.*;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;


}
