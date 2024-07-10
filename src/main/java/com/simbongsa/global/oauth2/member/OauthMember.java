package com.simbongsa.global.oauth2.member;

import com.simbongsa.global.common.constant.OauthProvider;

public interface OauthMember {
    public String getSocialId();

    public String getEmail();

    public String getNickname();

    public OauthProvider getOauthProvider();
}
