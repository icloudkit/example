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

package net.cloudkit.enterprises.ws;

import net.cloudkit.enterprises.infrastructure.utilities.Base64Encrypt;

/**
 * @author hongquanli <hongquanli@qq.com>
 * @version 1.0 2016/1/21 20:57
 */
public class ZipTest {

    public static void main(String[] args) {
        // System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIj8+DQo8Rm9ybWF0UmVxdWVzdCB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIiB4bWxuczp4c2Q9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIiB4bWxucz0iaHR0cDovL3d3dy5jaGluYXBvcnQuZ292LmNuL1BBUyI+DQogIDxMaWNlbnNlTm8+MjMyMzQyMzQyMzQyMzQyMzQyMzQ8L0xpY2Vuc2VObz4NCjwvRm9ybWF0UmVxdWVzdD4=".getBytes())));
        // System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48UmVzcG9uc2VDb250ZXh0PjxSZXNwb25zZUNvZGU+MDwvUmVzcG9uc2VDb2RlPjxSZXNwb25zZU1lc3NhZ2U+c3VjY2VzczwvUmVzcG9uc2VNZXNzYWdlPjxTZXJ2aWNlUmVzcG9uc2VDb2RlPi0xMzMwMDEyPC9TZXJ2aWNlUmVzcG9uc2VDb2RlPjxTZXJ2aWNlUmVzcG9uc2VNZXNzYWdlPua/gOa0u+eggeaXoOaViDwvU2VydmljZVJlc3BvbnNlTWVzc2FnZT48RXhjZXB0aW9uRGV0YWlsPjwvRXhjZXB0aW9uRGV0YWlsPjxHcm91cCBuYW1lPSJEYXRhUHJlc2VudGF0aW9uIj48S2V5IG5hbWU9IkNvbXByZXNzQWxnb3JpdGhtIj48L0tleT48S2V5IG5hbWU9IlNpZ25hdHVyZUFsZ29yaXRobSI+PC9LZXk+PEtleSBuYW1lPSJFbmNyeXB0QWxnb3JpdGhtIj48L0tleT48L0dyb3VwPjwvUmVzcG9uc2VDb250ZXh0Pg==".getBytes())));
        System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiIHN0YW5kYWxvbmU9InllcyI/PjxSZXF1ZXN0Q29udGV4dD48R3JvdXAgbmFtZT0iU3lzdGVtSW5mbyI+PEtleSBuYW1lPSJOQU1FX0ZVTEwiPua3seWcs+W4gumhuuaEj+W+l+aKpeWFs+aciemZkOWFrOWPuDwvS2V5PjxLZXkgbmFtZT0iQ2xpZW50SWQiPjUzMDAwMDAxNDU1MTU8L0tleT48S2V5IG5hbWU9IkNlcnRObyI+YjFhZWYzPC9LZXk+PEtleSBuYW1lPSJTYWljU3lzTm8iPjE5MjM3NDA0OTwvS2V5PjxLZXkgbmFtZT0iREVQX0lOX0NPREUiPjUzMDA8L0tleT48S2V5IG5hbWU9IlJFR19DT19DR0FDIj40NDAzMTgwMTM4PC9LZXk+PEtleSBuYW1lPSJFTlRfU0VRX05PIj4wMDAwMDAwMDAwMDAyMTM5NDU8L0tleT48S2V5IG5hbWU9IkljQ29kZSI+ODgwMDAwMDI0NjY2NjwvS2V5PjxLZXkgbmFtZT0iT3BlcmF0b3JOYW1lIj7prY/pnJ48L0tleT48S2V5IG5hbWU9IkRFUF9DT0RFX0NIRyI+NTMwMDwvS2V5PjxLZXkgbmFtZT0iU2Vzc2lvbklkIj4zMUQzMEQ5ODVCQUU0MTgxQ0FBQTQ2MDgxRTVFRjZCQjwvS2V5PjwvR3JvdXA+PEdyb3VwIG5hbWU9IkRhdGFQcmVzZW50YXRpb24iPjxLZXkgbmFtZT0iU2lnbmF0dXJlQWxnb3JpdGhtIiAvPjxLZXkgbmFtZT0iRW5jcnlwdEFsZ29yaXRobSIgLz48S2V5IG5hbWU9IkNvbXByZXNzQWxnb3JpdGhtIiAvPjwvR3JvdXA+PC9SZXF1ZXN0Q29udGV4dD4=".getBytes())));
        System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIj8+DQo8UXVlcnlDZGxMaXN0UmVxdWVzdCB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hLWluc3RhbmNlIiB4bWxuczp4c2Q9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZW1hIj4NCiAgPExpc3RUeXBlPjM8L0xpc3RUeXBlPg0KICA8QmlsbFNlcT5DREwxMDAwMDAwMDA3MTkwOTY8L0JpbGxTZXE+DQogIDxUeXBpc3RVbml0Q29kZT4xOTIzNzQwNDkkNDQwMzE4MDEzODwvVHlwaXN0VW5pdENvZGU+DQo8L1F1ZXJ5Q2RsTGlzdFJlcXVlc3Q+".getBytes())));

        System.out.println(new String(Base64Encrypt.decode("PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48UmVzcG9uc2VDb250ZXh0PjxSZXNwb25zZUNvZGU+MDwvUmVzcG9uc2VDb2RlPjxSZXNwb25zZU1lc3NhZ2U+c3VjY2VzczwvUmVzcG9uc2VNZXNzYWdlPjxTZXJ2aWNlUmVzcG9uc2VDb2RlPjA8L1NlcnZpY2VSZXNwb25zZUNvZGU+PFNlcnZpY2VSZXNwb25zZU1lc3NhZ2U+6LCD55So5oiQ5YqfPC9TZXJ2aWNlUmVzcG9uc2VNZXNzYWdlPjxFeGNlcHRpb25EZXRhaWw+PC9FeGNlcHRpb25EZXRhaWw+PEdyb3VwIG5hbWU9IkRhdGFQcmVzZW50YXRpb24iPjxLZXkgbmFtZT0iQ29tcHJlc3NBbGdvcml0aG0iPjwvS2V5PjxLZXkgbmFtZT0iU2lnbmF0dXJlQWxnb3JpdGhtIj48L0tleT48S2V5IG5hbWU9IkVuY3J5cHRBbGdvcml0aG0iPjwvS2V5PjwvR3JvdXA+PC9SZXNwb25zZUNvbnRleHQ+</result><responseData xsi:type=\"xsd:base64Binary\">PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/PjxRdWVyeUNkbExpc3RSZXNwb25zZT48Q2RsTGlzdHM+PENkbExpc3Q+PEJpbGxTZXE+Q0RMMTAwMDAwMDAwNzE5MDk2PC9CaWxsU2VxPjxMaXN0Tm8+NTMwNzIwMTRFMDAwMDE1MzgyPC9MaXN0Tm8+PFRyYWRlQ29kZT40NDAzOTMxODMwPC9UcmFkZUNvZGU+PFRyYWRlTmFtZT7mt7HlnLPml63kuJznsr7lt6XmnInpmZDlhazlj7g8L1RyYWRlTmFtZT48SUVQb3J0PjUzMDE8L0lFUG9ydD48TGlzdFR5cGU+MzwvTGlzdFR5cGU+PElFRGF0ZT4yMDE0LTA1LTIzIDAwOjAwOjAwLjA8L0lFRGF0ZT48RERhdGU+MjAxNC0wNS0yMyAxNjowMDoyNi4wPC9ERGF0ZT48TGlzdFN0YXQ+MTQ8L0xpc3RTdGF0PjxDdXNSZXROb3Rlcz7muIXljZXmkqTplIA8L0N1c1JldE5vdGVzPjwvQ2RsTGlzdD48L0NkbExpc3RzPjwvUXVlcnlDZGxMaXN0UmVzcG9uc2U+".getBytes())));
    }
}
