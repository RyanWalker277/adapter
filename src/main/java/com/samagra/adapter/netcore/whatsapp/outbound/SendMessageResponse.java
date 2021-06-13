package com.samagra.adapter.netcore.whatsapp.outbound;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendMessageResponse {

    @Getter
    @Setter
    public class Data {

        @JsonAlias({"id"})
        private String identifier;
    }

    private String status;
    private String message;

    private Data data;
}
