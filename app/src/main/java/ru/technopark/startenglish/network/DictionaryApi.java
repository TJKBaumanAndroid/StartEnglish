package ru.technopark.startenglish.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface DictionaryApi {

    class WordPlain {
        public String word;
        public String pronunciation;
        public List<DefinitionPlain> definitions;
    }

    class DefinitionPlain {
        public String definition;
        public String example;
        public String type;
        public String image_url;
        public String emoji;
    }
    @GET("dictionary/{dictionary}")
    Call<WordPlain> get(@Path("dictionary") String dictionary, @Header("Authorization") String auth);
}