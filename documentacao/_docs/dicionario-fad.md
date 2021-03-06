---
layout: doc
title: Ficha de Atendimento Domiciliar
id: dicionario-fad
order: 1
---

# Ficha de Atendimento Domiciliar



## FichaAtendimentoDomiciliarMaster


### \#1	uuidFicha	Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Sim|	36|	44|

É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.	Para ver a referência sobre o UUID, acesse: https://en.wikipedia.org/wiki/Universally_unique_identifier	-

### \#2	tpCdsOrigem

Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Integer|	Sim|	1|	1|

**Observações**: Utilizar valor 3 (sistemas terceiros).

### \#3	headerTransport

Profissional que realizou a visita.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|UnicaLotacaoHeader|	Sim|	-|	-|

**Referências**	Ver Profissional

### \#4	atendimentosDomiciliares

Lista dos atendimentos realizados pelo profissional.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<FichaAtendimentoDomiciliarChild>|	Sim|	1|	13|

## FichaAtendimentoDomiciliarChild

### \#1	turno

Turno onde aconteceu o atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

**Referência**: Ver Turno

### \#2	cns

CNS do cidadão que participou da atividade.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	15|	15|

CNS valido de acordo com o algoritmo.	Para ver o algoritmo utilizado, acesse: http://cartaonet.datasus.gov.br/, em "Downloads" baixe o arquivo de rotina de validação Java.


### \#3	dataNascimento

Data de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

Não pode ser posterior a dataAtendimento e anterior a 130 anos a partir da dataAtendimento.	Para ver a referência sobre o formato epoch, acesse: https://en.wikipedia.org/wiki/Epoch_(reference_date)	-

### \#4	sexo

Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

**Referência**:	-	Ver Sexo	-

### \#5	localDeAtendimento

Local onde o atendimento foi realizado.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

**Referência** Ver LocalDeAtendimento

### \#6	atencaoDomiciliarModalidade

Modalidade AD do cidadão atendido.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

**Regras**: Apenas as opções "1L", "2L" e "3L" são aceitas.

**Referência**: Ver ModalidadeAD

7	tipoAtendimento

Tipo de atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Sim|	-|	-|

**Regras**: Apenas as opções "7L" e "8L" são aceitas.

**Referências**: Ver TipoDeAtendimento

### \#8	situacoesPresentes

Marcadores das situações presentes.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<Long>|	Opcional|	0|	24|

**Referências**: Ver SituacoesPresentes

### \#9	cid

CID registrado no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-|	-|

### \#10	ciap

CIAP registrado no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|String|	Opcional|	-	|-|

### \#11	procedimentos

Procedimentos registrados no atendimento disponíveis na ficha.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<String>|	Opcional|	0|	21|

**Referência**: Ver ProcedimentosAtençãoDomiciliar

### \#12	outrosProcedimentos

Procedimentos SIGTAP registrados no atendimento.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|List<String>|	Opcional	|0|	4|

**Regras**:

- Não podem ser iguais aos procedimentos a cima.
- Não podem conter procedimentos repetidos.

### \#13	condutaDesfecho

Desfecho do atendimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Long|	Opcional|	-|	-|

**Regras**:	Não podem conter as opções "7L" ou "8L".

**Referência**:	Ver CondutaDesfecho

### \#14	statusInicioAcompanhamentoPosObito

Marcador que indica se a família irá receber acompanhamento pós-óbito.

| Tipo | Obrigatório | Mínimo | Máximo |
|---| --- |---  | --- |
|Boolean|	Opcional|	-|	-|


## Questionário de Situações Presentes

|Nome|	Código|
|--- |---|
|Acamado	|1 L|
|Domiciliado	|2 L|
|Úlceras / Feridas (grau III ou IV)	|3 L|
|Acompanhamento nutricional	|4 L|
|Uso de sonda naso-gástrica - SNG	|5 L|
|Uso de sonda naso-enteral - SNE	|6 L|
|Uso de gastrostomia	|7 L|
|Uso de colostomia	|8 L|
|Uso de cistostomia	|9 L|
|Uso de sonda vesical de demora - SVD	|10 L|
|Acompanhamento pré-operatório	|11 L|
|Acompanhamento pós-operatório	|12 L|
|Adaptação ao uso de órtese / prótese	|13 L|
|Reabilitação domiciliar	|14 L|
|Cuidados paliativos oncológico	|15 L|
|Cuidados paliativos não-oncológico	|16 L|
|Oxigenoterapia domiciliar	|17 L|
|Uso de traqueostomia	|18 L|
|Uso de aspirador de vias aéreas para higiene brônquica	|19 L|
|Suporte ventilatório não invasivo - CPAP	|20 L|
|Suporte ventilatório não invasivo - BiPAP	|21 L|
|Diálise peritonial |	22 L |
|Paracentese | 23 L |
|Medicação  parenteral	|24 L |

## Procedimentos da AtençãoDomiciliar

|Nome			|Código|
|--- |---|
|Acompanhamento de paciente em reabilitação em comunicação alternativa			|0301070024|
|Antibioticoterapia parenteral			|0301050082|
|Atendimento / acompanhamento de paciente em reabilitação do desenvolvimento neuropsicomotor			|0301070075|
|Atendimento fisioterapêutico paciente com transtorno respiratório sem complicações sistêmicas			|0302040021|
|Atendimento médico com finalidade de atestar óbito			|0301050090|
|Atendimento / acompanhamento em reabilitação nas múltiplas deficiências			|0301070067|
|Cateterismo vesical de alívio			|0301100047|
|Cateterismo vesical de demora			|0301100055|
|Coleta de material para exame laboratorial			|0201020041|
|Cuidados com estomas			|0301100063|
|Cuidados com traqueostomia			|0301100071|
|Enema			|0301100098|
|Oxigenoterapia			|0301100144|
|Retirada de pontos de cirurgias básicas (por paciente)			|0301100152|
|Sondagem gástrica			|0301100179|
|Terapia de reidratação oral			|0301100187|
|Terapia de reidratação parenteral			|0301050120|
|Terapia fonoaudiológica individual			|0301070113|
|Tratamento de traumatismos de localização especificada / não especificada			|0308010019|
|Tratamento em reabilitação			|0303190019|
|Visita domiciliar pós-óbito			|0301050104|
