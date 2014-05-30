/* This file was generated by SableCC (http://www.sablecc.org/). */

package projetolft.analysis;

import projetolft.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTVirgula(TVirgula node);
    void caseTAspa(TAspa node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTPonto(TPonto node);
    void caseTParenEsq(TParenEsq node);
    void caseTParenDir(TParenDir node);
    void caseTColcheteEsq(TColcheteEsq node);
    void caseTColcheteDir(TColcheteDir node);
    void caseTMais(TMais node);
    void caseTMenos(TMenos node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivInt(TDivInt node);
    void caseTMenorQue(TMenorQue node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMaiorQue(TMaiorQue node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTFaca(TFaca node);
    void caseTAte(TAte node);
    void caseTEscreva(TEscreva node);
    void caseTLeia(TLeia node);
    void caseTEnquanto(TEnquanto node);
    void caseTConstante(TConstante node);
    void caseTPara(TPara node);
    void caseTRepita(TRepita node);
    void caseTInicio(TInicio node);
    void caseTPrograma(TPrograma node);
    void caseTReal(TReal node);
    void caseTInteiro(TInteiro node);
    void caseTCaractere(TCaractere node);
    void caseTSe(TSe node);
    void caseTDe(TDe node);
    void caseTPasso(TPasso node);
    void caseTEntao(TEntao node);
    void caseTAvalie(TAvalie node);
    void caseTSenao(TSenao node);
    void caseTCaso(TCaso node);
    void caseTFimP(TFimP node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTFimSe(TFimSe node);
    void caseTFimPara(TFimPara node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTFimRepita(TFimRepita node);
    void caseTBlanks(TBlanks node);
    void caseTNumeroInt(TNumeroInt node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTIdentificador(TIdentificador node);
    void caseTComentarioLinha(TComentarioLinha node);
    void caseTComentadoA(TComentadoA node);
    void caseTCorpo(TCorpo node);
    void caseTEstrela(TEstrela node);
    void caseTBarra(TBarra node);
    void caseTComentadoFinal(TComentadoFinal node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
