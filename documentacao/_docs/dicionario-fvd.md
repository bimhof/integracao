---
layout: doc
title: Ficha de Visita Domiciliar
id: dicionario-fvd
order: 1
---

# Ficha de Visita Domiciliar

## FichaVisitaDomiciliarMaster

### \#1 uuidFicha
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**: Para ver a referência sobre o UUID, acesse [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier).

### \#2 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

### \#3 headerTransport
Profissional que realizou a visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|UnicaLotacaoHeader |Sim |- |- |

**Referência**: [Ver Profissional]().

### \#4 visitasDomiciliares
Pelo menos 1 item na lista, no máximo 23.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<FichaVisitaDomiciliarChild> |Sim |- |- |

**Referência**: [Ver FichaVisitaDomiciliarChild]().

## FichaVisitaDomiciliarChild

### \#1 turno
Turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Não |- |- |

**Referência**: [Ver Turno]().

### \#2 numProntuario
Número do prontuário do cidadão na UBS.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Não |0 |30 |

**Regras:** Somente letras e números.

### \#3 numCartaoSus
Número do cartão SUS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Não |15 |15 |

**Regras:** Validado pelo algoritmo.

**Referência**: Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.  

### \#4 dtNascimento
Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]() e anterior a 130 anos a partir da [dataAtendimento]().

**Referência**: Para ver a referência sobre o formato epoch, acesse: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#5 sexo
Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência**: [Ver Sexo]().

### \#6 statusVisitaCompartilhadaOutroProfissional
Marcador que indica se a visita foi compartilhada com outro profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Não |- |- |

### \#7 motivosVisita
Motivos da visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Condicional |- |- |

**Regras:** Não é Obrigatório se [Desfecho]() é AUSENTE ou VISITA_RECUSADA.

**Referência**: [Ver MotivoVisita]().

### \#8 desfecho
Resultado da ação de visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Requerido |- |- |

**Referência**: [Ver Desfecho]().
