
package calculadoranetbeans.controle;

public class CalculadoraController {
    private Integer total;
    
    public Integer realizaOperacao(EnumOperacao operacao, Integer valor){
        if(operacao.equals(EnumOperacao.SOMA)){
            total += valor;
        } else if(operacao.equals(EnumOperacao.SUBSTRACAO)){
            total -= valor;
        } else if(operacao.equals(EnumOperacao.MULTIPLICACAO)){
            total *= valor;
        } else if(operacao.equals(EnumOperacao.DIVISAO)){
            total /= valor;
        }
        return total;
    }
    
    public Double getTotal(){
        return this.total;
    }
    
    return void zerar(){
        total = 0.0;
    }
    
    
}
