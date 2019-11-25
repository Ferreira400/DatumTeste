#language: pt
Funcionalidade: Reservar ticket

  @ignore
  Cenario: ticket
    Dado Acessar a URL
    E Informar usuario "mecury"
    E Informar senha "mecury"
    Entao Clicar no botao
    E Selecionar "fromPort" a cidade de origem "Seattle"
    E Selecionar "toPort" a cidade de destino "Paris"
    E Selecionar mes "fromMonth"  "May" e dia "fromDay"  "10" data > que "toMonth"  "December"  "toDay"  "15" data corrente
    E Selecionar a Class "First"
    E Selecionar Passengers "passCount" "1"
    E Clicar no botao "findFlights"
    E Selecionar o voo
    E Clicar no botao voo "reserveFlights"
    E Preencher "cc_frst_name"  "joaquim" e "cc_last_name"  "aquino"
    E Preencher numero do cartao "creditnumber"  "99999999999"
    E Preencher o nome do passageiro "passFirst0"  "Joaquim" e sobrenome "passLast0"  "Aquino"
    Entao Clicar em "buyFlights"

  Cenario: reserva 
     
    Dado Acessar a URL
    E Informar usuario "mecury"
    E Informar senha "mecury"
    Entao Clicar no botao
    Entao Selecionar a opcao 
  
 
