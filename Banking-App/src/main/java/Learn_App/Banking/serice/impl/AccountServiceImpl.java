package Learn_App.Banking.serice.impl;

import Learn_App.Banking.dto.AccountDto;
import Learn_App.Banking.entity.Account;
import Learn_App.Banking.mapper.AccountMapper;
import Learn_App.Banking.repository.AccountRepository;
import Learn_App.Banking.serice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {


    private  AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override

    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saveAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(saveAccount);
    }
}
