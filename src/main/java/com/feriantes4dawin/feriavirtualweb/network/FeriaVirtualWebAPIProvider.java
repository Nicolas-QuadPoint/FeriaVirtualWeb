package com.feriantes4dawin.feriavirtualweb.network;

import org.springframework.web.reactive.function.client.WebClient;

public interface FeriaVirtualWebAPIProvider {
    <T> T getSimpleObject(WebClient.Builder b,Class<T> obj);
}
