package net.javaguides.banking_app.service.impl;



import net.javaguides.banking_app.dto.AccountDto;
import net.javaguides.banking_app.entity.Account;
import net.javaguides.banking_app.repository.AccountRepository;
import net.javaguides.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRespository;

    public AccountServiceImpl(AccountRepository accountRespository) {
        this.accountRespository = accountRespository;
    }


    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setBalance(accountDto.getBalance());
        account.setAccountHolderName(accountDto.getAccountHolderName());
        accountRespository.save(account);

        account.setBalance(account.getBalance());
        accountDto.setAccountHolderName(account.getAccountHolderName());
        return accountDto;
    }

    @Override
    public AccountDto getAccountById(Long id) {

        Account account = accountRespository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));
        AccountDto accountDto = new AccountDto();
        accountDto.setAccountHolderName(account.getAccountHolderName());
        accountDto.setBalance(account.getBalance());
        accountDto.setId(account.getId());
        return accountDto;
    }

    @Override
    public AccountDto deposit(Long id, double amount) {

        Account account = accountRespository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));

        double total = account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount = accountRespository.save(account);
        AccountDto accountDto = new AccountDto();
        account.setBalance(savedAccount.getBalance());
        accountDto.setAccountHolderName(savedAccount.getAccountHolderName());
        return accountDto;
    }

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account = accountRespository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient amount");

        }
        double total = account.getBalance() - amount;
        account.setBalance(total);
        Account savedAccount = accountRespository.save(account);

        AccountDto accountDto = new AccountDto();
        account.setBalance(savedAccount.getBalance());
        accountDto.setAccountHolderName(savedAccount.getAccountHolderName());
        return accountDto;
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRespository.findAll();
        return accounts.stream().map(accountDto -> new AccountDto()).collect(Collectors.toList());
    }

    @Override
    public void deleteAccount(Long id) {
        accountRespository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account does not exists"));
        accountRespository.deleteById(id);

    }
}









