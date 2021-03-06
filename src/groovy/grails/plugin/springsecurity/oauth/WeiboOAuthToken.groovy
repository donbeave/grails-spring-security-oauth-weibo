/*
 * Copyright 2013 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grails.plugin.springsecurity.oauth

import org.scribe.model.Token

/**
 * OAuth authentication token for Weibo users. It's a standard {@link OAuthToken}
 * that returns the Weibo User ID as the principal.
 *
 * @author <a href='mailto:donbeave@gmail.com'>Alexey Zhokhov</a>
 */
class WeiboOAuthToken extends OAuthToken {

    public static final String PROVIDER_NAME = 'weibo'

    String uid

    WeiboOAuthToken(Token scribeToken, uid) {
        super(scribeToken)
        this.uid = uid
        this.principal = uid
    }

    String getSocialId() {
        return uid
    }

    String getScreenName() {
        return uid
    }

    String getProviderName() {
        return PROVIDER_NAME
    }

}
