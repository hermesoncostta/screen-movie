package com.seet.screen.movie.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}