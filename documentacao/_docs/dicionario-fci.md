---
layout: doc
title: Ficha de Cadastro Individual
id: dicionario-fci
order: 1
---

# Ficha de Cadastro Individual

### \#1 condicoesDeSaude
Formulário referente as condições de saúde do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|CondicoesDeSaude |Condicional |- |- |

**Referência**: [Ver CondicoesDeSaude]()

Observação: Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#2 dadosGerais	Dados
referentes ao profissional e a data do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|HeaderCdsCadastro |Sim |- |- |

**Referência**: [Ver HeaderCdsCadastro]().

### \#3 emSituacaoDeRua
Formulário referente a informações de situação de rua (se o cidadão se encontrar nessa situação).

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|EmSituacaoDeRua |Condicional |- |- |

**Referência**: [Ver EmSituacaoDeRua]().

Observação: Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#4 fichaAtualizada
Marcador que indica se a ficha é uma atualização.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|boolean |Sim |- |- |

### \#5 identificacaoUsuarioCidadao
Dados que identificam o cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|IdentificacaoUsuarioCidadao |Condicional |- |- |

**Referência**: [Ver IdentificacaoUsuarioCidadao](#identificacaousuariocidadao)

Observação: Opcional se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#6 informacoesSocioDemograficas
Informações sócio-demográficas fornecidas pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|InformacoesSocioDemograficas |Condicional |- |- |

Observação: Não deve ser preenchido se o campo [statusTermoRecusaCadastroIndividualAtencaoBasica]() = true.

### \#7 statusTermoRecusaCadastroIndividualAtencaoBasica
Marcador que indica se o termo de recusa foi assinalado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#8 tpCdsOrigem
Tipo de origem dos dados do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Integer |Sim |1 |1 |

**Regras:** Utilizar valor 3 (sistemas terceiros).

### \#9 uuid
Código UUID para identificar a ficha na base de dados nacional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |36 |44 |

**Regras:** É recomendado concatenar o CNES na frente do UUID, de modo que os 7 digitos (CNES) + 1 de hífen somados aos 36 (32 caracteres + 4 hífen) do UUID são a limitação de 44 bytes do campo. Formato canônico.

**Referência**: Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier)

### \#10 uuidFichaOriginadora
Código UUID para identificar a ficha que deu origem ao cadastro do registro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |36 |44 |

**Regras:** Se for uma ficha de atualização, deve ser preenchido com o UUID da ficha que deu origem ao registro. Se for a ficha de cadastro, este campo deve ser igual ao campo uuid.

**Referência**: Para ver a referência sobre o UUID, acesse: [UUID Wikipedia](https://en.wikipedia.org/wiki/Universally_unique_identifier)

## CondicoesDeSaude

### \#1 descricaoCausaInternacaoEm12Meses
Descrição da causa de internação do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |0 |100 |

Observação: Não deve ser preenchido se o campo [statusTeveInternadoem12Meses]() = false.

### \#2 ddescricaoOutraCondicao1
Condição de saúde informada pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#3 descricaoOutraCondicao2
Condição de saúde informada pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#4 descricaoOutraCondicao3
Condição de saúde informada pelo cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#5 descricaoPlantasMedicinaisUsadas
Descricao das plantas medicinais utilizadas.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

Observação: Não deve ser preenchido se o campo [statusUsaPlantasMedicinais]() = false.

### \#6 doencaCardiaca
Doenças cardíacas que o cidadão informou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Condicional |0 |3 |

**Referência:** [Ver DoencaCardiaca]().

Observação:
• Requerido preenchimento de pelo menos um item se o campo [statusTeveDoencaCardiaca]() = true
• Não deve ser preenchido preenchido se o campo "[statusTeveDoencaCardiaca]() = false.


### \#7 doencaRespiratoria
Doenças respiratórias que o cidadão informou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Condicional |0 |4 |

**Referência:** [Ver DoencaRespiratoria]().

Observação:
• Requerido preenchimento de pelo menos um item se o campo [statusTemDoencaRespiratorio]() = true.
•  Não deve ser preenchido o campo [statusTemDoencaRespiratorio]() = false.


### \#8 doencaRins
Doenças renais que o cidadão informou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Condicional |0 3 |

**Referência:** [Ver ConsideracaoPeso]().

Observação:
•Requerido preenchimento de pelo menos um item se o campo [statusTemTeveDoencasRins]() = true
• Nãodeve ser preenchido se o campo [statusTemTeveDoencasRins]() = false.

### \#9 maternidadeDeReferencia
Nome da maternindade de referência.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

Observação: Não pode ser preenchido se o campo [statusEhGestante]() = false.

### \#10 situacaoPeso
Situação referente ao peso corporal.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [Ver ConsideracaoPeso]().

### \#11 statusEhDependenteAlcool
Marcador se o cidadão é dependente de alcool.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#12 statusEhDependenteOutrasDrogas
Marcador se o cidadão é dependente de outras drogas.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#13 statusEhFumante
Marcador se o cidadão é fumante.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#14 statusEhGestante
Marcador se o cidadão está gestante.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

Observação: Só pode ser preenchido se o campo [sexoCidadao]() = feminino e o campo [dataNascimentoCidadao]() for anterior ou igual à 12 anos a partir da data atual.

### \#15 statusEstaAcamado
Marcador se o cidadão está acamado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#16 statusEstaDomiciliado
Marcador se o cidadão está domiciliado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#17 statusTemDiabetes
Marcador se o cidadão tem diabetes.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#18 statusTemDoencaRespiratorio
Marcador se o cidadão tem doença respiratória.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#19 statusTemHanseniase
Marcador se o cidadão tem hanseníase.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#20 statusTemHipertensaoArterial
Marcador se o cidadão tem hipertensão arterial.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#21 statusTemTeveCancer
Marcador se o cidadão tem ou teve câncer.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#22 statusTemTeveDoencasRins
Marcador se o cidadão tem ou teve doenças nos rins.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#23 statusTemTuberculose
Marcador se o cidadão tem tuberculose.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#24 statusTeveAvcDerrame
Marcador se o cidadão teve AVC.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#25 statusTeveDoencaCardiaca
Marcador se o cidadão teve doença cardíaca.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#26 statusTeveInfarto
Marcador se o cidadão teve infarto.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#27 statusTeveInternadoem12Meses
Marcador se o cidadão esteve internado nos últimos 12 meses.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#28 statusTratamentoPsiquicoOuProblemaMental
Marcador se o cidadão está em tratamento psiquico ou tem problema mental.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#29 statusUsaOutrasPraticasIntegrativasOuComplementares
Marcador se o cidadão utiliza outras práticas integrativas complementares.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#30 statusUsaPlantasMedicinais
Marcador se o cidadão utiliza plantas medicinais.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

## EmSituacaoDeRua

### \#1 grauParentescoFamiliarFrequentado
Grau de parentesco do familiar que frequenta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |0 |100 |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

Observação: Não deve ser preenchido se o campo [statusVisitaFamiliarFrequentemente]() = false.

### \#2 higienePessoalSituacaoRua
Condições de higiene que o cidadão tem acesso.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Condicional |0 |4 |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

**Referência:** [Ver AcessoHigiene]().

Observação: Requerido preenchimento de pelo menos um item se o campo [statusTemAcessoHigienePessoalSituacaoRua]() = true.

### \#3 origemAlimentoSituacaoRua
Origem da alimentação do cidadão em situação de rua.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Opcional |0 |5 |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

**Referência:** [Ver OrigemAlimentacao]().

### \#4 outraInstituicaoQueAcompanha
Nome de outra instituição que acompanha o cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

Observação: Não deve ser preenchido se o campo [statusAcompanhadoPorOutraInstituição]() = false.

### \#5 quantidadeAlimentacoesAoDiaSituacaoRua
Quantas vezes o cidadão se alimenta ao dia.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

**Referência:** [Ver QuantasVezesAlimentacao]().

### \#6 statusAcompanhadoPorOutraInstituicao
Marcador que indica se o cidadão é acompanhado por outra instituição.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

### \#7 statusPossuiReferenciaFamiliar
Marcador que indica se o cidadão possuiu alguma referência familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

### \#8 statusRecebeBeneficio
Marcador que indica se o cidadão recebe algum benefício.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

### \#9 statusSituacaoRua
Marcador que indica se o cidadão está em situação de rua.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |

### \#10 statusTemAcessoHigienePessoalSituacaoRua
Marcador que indica se o cidadão tem acesso a higiene pessoal.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

### \#11 statusVisitaFamiliarFrequentemente
Marcador que indica se o cidadão visita algum familiar frequentemente.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

### \#12 tempoSituacaoRua
Tempo que o cidadão está em situação de rua.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Não podem ser preechidos se o campo [statusSituacaoRua]() = false.

**Referência:** [Ver TempoSituacaoDeRua]().

## IdentificacaoUsuarioCidadao

### \#1 nomeSocialCidadao
Nome social do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |0 |100 |

### \#2 codigoIbgeMunicipioNascimento
Código IBGE do município.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |7 |7 |

**Referência:** [Ver Municipios]().

Observação: Requerido se o campo [nacionalidadeCidadao]() = 1L (Brasileiro) e não deve ser preenchido se for outra nacionalidade.

### \#3 dataNascimentoCidadao
Data de nascimento do cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]() e anterior a 130 anos a partir da [dataAtendimento]().

**Referência:** Para ver a referência sobre o formato epoch, acesse: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#4 dataNascimentoResponsavel
Data de nascimento do responsável pelo cidadão no formato epoch time.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Regras:** Não pode ser posterior a [dataAtendimento]() e anterior a 130 anos a partir da [dataAtendimento]().

**Referência:** Para ver a referência sobre o formato epoch, acesse: [Epoch Wikipedia](https://en.wikipedia.org/wiki/Epoch_(reference_date)).

### \#5 desconheceNomeMae
Marcador que indica que o cidadão desconhece o nome da mãe

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

### \#6 emailCidadao
Email do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |6 |100 |

**Regras:** Requerido seguir o padrão "nome@domínio.extensão".

### \#7 nacionalidadeCidadao
Marcador que indica se o cidadão é brasileiro, naturalizado ou estrangeiro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Ver Nacionalidade]().

### \#8 nomeCidadao
Nome completo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Sim |5 |100 |

**Regras:** Necessita espaço em branco para indicar o sobrenome.

### \#9 nomeMaeCidadao
Nome da mãe do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Condicional |5 |100 |

**Regras:** Necessita espaço em branco para indicar o sobrenome.

Observação: Não deve ser preenchido se o campo [desconheceNomeMae]() = true.

### \#10 numeroCartaoSus
CNS do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras:** Validado por algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

### \#11 numeroCartaoSusResponsavel
CNS do responsável do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |15 |15 |

**Regras:** Validado por algoritmo.

**Referência:** Para ver o algoritmo utilizado, acesse: [Cartão Net Datasus](http://cartaonet.datasus.gov.br/), em "Downloads" baixe o arquivo de rotina de validação Java.

Observação: Só pode ser preenchido se o campo [statusEhResponsavel]() = true.

### \#12 numeroCelularCidadao
Número de celular do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |10 |11 |

**Regras:** Apenas números.

### \#13 paisNacimento
País de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opcional |11 |11 |

### \#14 paisNacimento
País de nascimento do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opcional |- |- |

**Referência:** [Ver Pais]().

Observação: Só pode ser preenchido se o campo [nacionalidadeCidadao]() = 1L (Brasileiro).

### \#15 racaCorCidadao
Raça/Cor do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Ver RacaCor]().

### \#16 sexoCidadao
Sexo do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Sim |- |- |

**Referência:** [Ver Sexo]().

### \#17 statusEhResponsavel
Marcador que indica se o cidadão é responsável familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opcional |- |- |

## InformacoesSocioDemograficas

### \#1 deficienciasCidadao
Lista de deficiências que o cidadão possui.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|List<Long> |Condicional |1 |5 |

**Referência:** [Ver DeficienciaCidadao]().

Observação:
• Requerido preenchimento de pelo menos um item se o campo [statusTemAlgumaDeficiencias]() = true.  
• Não deve ser preenchido se o campo [statusTemAlgumaDeficiencia]() = false.

### \#2 grauInstrucaoCidadao
Curso mais elevado que o cidadão frequenta ou frequentou.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opicional |- |- |

**Referência:** [Ver CursoMaisElevado]().

### \#3 motivoSaidaCidadao
Motivo da saída do cidadão do cadastro.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opicional |- |- |

**Referência:** [Ver MotivoSaida]().

### \#4 ocupacaoCodigoCbo2002
Ocupaçao do cidadão.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opicional |6 |6 |

**Regras:** Deve ser um CBO válido.

**Referência:** [Ver CBO]().

Observação: Não deve ser preenchido se o campo [statusDesejaInformarOrientacaoSexual]() = false.

### \#5 orientacaoSexualCidadao
Orientação sexual informada pelo cidadão.  

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opicional |- |- |

**Referência:** [Ver OrientacaoSexual]().

### \#6 povoComunidadeTradicional
Nome da comunidade tradicional que o cidadão frequenta.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|String |Opicional |0 |100 |

Observação: Não deve ser preenchido se o campo [statusMembroPovoComunidadeTradicional]() = false.

### \#7 relacaoParentescoCidadao
Relação de parentesco com o responsável familiar.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opicional |- |- |

**Referência:** [Ver RelacaoParentesco]().

### \#8 responsavelPorCrianca
Responsável por criancas de até 9 anos.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opicional |- |- |

**Referência:** [Ver ResponsavelCrianca]().

### \#9 situacaoMercadoTrabalhoCidadao
Situação do cidadão no mercdo de trabalho.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Long |Opicional |- |- |

**Referência:** [Ver SituacaoMercadoDeTrabalho]().

### \#10 statusDesejaInformarOrientacaoSexual
Marcador que indica se o cidadão deseja informar sua orientação sexual.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opicional |- |- |

### \#11 statusFrequentaBenzedeira
Marcador que indica se o cidadão frequenta cuidador tradicional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opicional |- |- |

### \#12 statusFrequentaEscola
Marcador que indica se o cidadão frequenta escola ou creche.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |

### \#13 statusMembroPovoComunidadeTradicional
Marcador que indica se o cidadão é membro de um povo ou comunidade tradicional.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opicional |- |- |

### \#14 statusParticipaGrupoComunitario
Marcador que indica se o cidadão participa de algum grupo comunitário.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opicional |- |- |

### \#15 statusPossuiPlanoSaudePrivado
Marcador que indica se o cidadão possui plano de saúde privado.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Opicional |- |- |

### \#16 statusTemAlgumaDeficiencia
Marcador que indica se cidadão tem alguma dificiência.

| Tipo | Obrigatório | Mínimo | Máximo |
|--- |--- |--- |--- |
|Boolean |Sim |- |- |
