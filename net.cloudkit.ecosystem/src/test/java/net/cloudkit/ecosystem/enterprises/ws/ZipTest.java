/*
 * Copyright (C) 2016. The CloudKit Open Source Project
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

package net.cloudkit.ecosystem.enterprises.ws;

import net.cloudkit.ecosystem.enterprises.infrastructure.utilities.Base64Encrypt;

/**
 * @author hongquanli <hongquanli@qq.com>
 * @version 1.0 2016/1/21 20:57
 */
public class ZipTest {

    public static void main(String[] args) {
        System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIj8+DQo8Rm9ybWF0UmVxdWVzdCB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIiB4bWxuczp4c2Q9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIiB4bWxucz0iaHR0cDovL3d3dy5jaGluYXBvcnQuZ292LmNuL1BBUyI+DQogIDxMaWNlbnNlTm8+MjMyMzQyMzQyMzQyMzQyMzQyMzQ8L0xpY2Vuc2VObz4NCjwvRm9ybWF0UmVxdWVzdD4=".getBytes())));
        System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48UmVzcG9uc2VDb250ZXh0PjxSZXNwb25zZUNvZGU+MDwvUmVzcG9uc2VDb2RlPjxSZXNwb25zZU1lc3NhZ2U+c3VjY2VzczwvUmVzcG9uc2VNZXNzYWdlPjxTZXJ2aWNlUmVzcG9uc2VDb2RlPi0xMzMwMDEyPC9TZXJ2aWNlUmVzcG9uc2VDb2RlPjxTZXJ2aWNlUmVzcG9uc2VNZXNzYWdlPua/gOa0u+eggeaXoOaViDwvU2VydmljZVJlc3BvbnNlTWVzc2FnZT48RXhjZXB0aW9uRGV0YWlsPjwvRXhjZXB0aW9uRGV0YWlsPjxHcm91cCBuYW1lPSJEYXRhUHJlc2VudGF0aW9uIj48S2V5IG5hbWU9IkNvbXByZXNzQWxnb3JpdGhtIj48L0tleT48S2V5IG5hbWU9IlNpZ25hdHVyZUFsZ29yaXRobSI+PC9LZXk+PEtleSBuYW1lPSJFbmNyeXB0QWxnb3JpdGhtIj48L0tleT48L0dyb3VwPjwvUmVzcG9uc2VDb250ZXh0Pg==".getBytes())));
    }
}
