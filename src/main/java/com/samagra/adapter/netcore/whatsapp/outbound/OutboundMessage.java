package com.samagra.adapter.netcore.whatsapp.outbound;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OutboundMessage {
    private SingleMessage[] message;
}
