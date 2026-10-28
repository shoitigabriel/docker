package com.github.cida.ms.pagamentos.tests;

import com.github.cida.ms.pagamentos.entities.Pagamento;
import com.github.cida.ms.pagamentos.entities.Status;

import java.math.BigDecimal;

public class Factory {

    public static Pagamento createPagamento(){

        Pagamento pagamento = new Pagamento(
                1L,
                BigDecimal.valueOf(32.25),
                "Brienne de Tarth",
                "3654124796321469",
                "07/15",
                "354",
                Status.CRIADO,
                1L
        );

        return pagamento;
    }

    public  static Pagamento createPagamentoSemId(){

        Pagamento pagamento = createPagamento();
        pagamento.setId(null);
        return pagamento;
    }
}
