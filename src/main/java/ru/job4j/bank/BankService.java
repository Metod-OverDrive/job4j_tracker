package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс производит банковские транзации, связанные с User,
 * так же позволяя переводить средства с 1-го аккаунта на другой.
 * @author @pochta.nadomne@mail.ru
 * @version 1.0
 */
public class BankService {

    public boolean deleteUser(String passport) {
        User user = findByPassport(passport);
        return users.remove(user) != null;
    }

    /**
     *  Переменная типа HashMap для для хранения Account по ключу User.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Позволяет добавить нового пользователя на учёт.
     * @param user - пользователь.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Позволяет добавить новый реквизит пользователю.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Позволяет найти пользователя по пасспортным данным.
     * @return возвращает пользователя если он был найден, иначе null.
     */
    public User findByPassport(String passport) {
        User result = null;
        for (User user: users.keySet()) {
            if (passport.equals(user.getPassport())) {
                result = user;
                break;
            }
        }
        return result;
    }

    /**
     * Позволяет найти реквизит по пасспортным данным.
     * @param passport - пасспортные данные пользователя.
     * @param requisite - реквизит пользователя.
     * @return возвращает пользователя если он был найден, иначе null.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account el: users.get(user)) {
                if (requisite.equals(el.getRequisite())) {
                    account = el;
                    break;
                }
            }
        }
        return account;
    }

    /**
     * Проводит транзакцию средств между 2-мя разными реквизитами.
     *
     * @param srcPassport - паспорт отправителя.
     * @param srcRequisite - реквизит отправителя.
     * @param destPassport - паспорт получателя.
     * @param destRequisite - реквизит получателя.
     * @param amount - сумма перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean result = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            result = true;
        }

        return result;
    }

    /**
     * позволяет получить реквизиты пользователя
     * @param user - пользователь.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}