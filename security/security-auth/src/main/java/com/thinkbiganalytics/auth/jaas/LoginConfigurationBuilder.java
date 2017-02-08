/**
 *
 */
package com.thinkbiganalytics.auth.jaas;

/*-
 * #%L
 * thinkbig-security-auth
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Map;

import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;
import javax.security.auth.spi.LoginModule;

/**
 *
 */
public interface LoginConfigurationBuilder {

    ModuleBuilder loginModule(String appName);

    LoginConfiguration build();


    interface ModuleBuilder {

        ModuleBuilder moduleClass(Class<? extends LoginModule> moduleClass);

        ModuleBuilder controlFlag(String flag);

        ModuleBuilder controlFlag(LoginModuleControlFlag flag);

        ModuleBuilder option(String name, Object value);

        ModuleBuilder options(Map<String, Object> options);

        LoginConfigurationBuilder add();
    }
}
