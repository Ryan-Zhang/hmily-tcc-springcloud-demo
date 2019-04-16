
package com.zhangjianbing.story.service;


import com.zhangjianbing.story.dto.AccountDTO;
import com.zhangjianbing.story.entity.AccountDO;
import org.dromara.hmily.annotation.Hmily;

public interface AccountService {

    /**
     * 扣款支付.
     *
     * @param accountDTO 参数dto
     * @return true
     */
    @Hmily
    boolean payment(AccountDTO accountDTO);

    /**
     * 获取用户账户信息.
     *
     * @param userId 用户id
     * @return AccountDO
     */
    AccountDO findByUserId(String userId);
}
