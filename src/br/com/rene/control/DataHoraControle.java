/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.control;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Rene_sever
 */
public class DataHoraControle {

    private String mes;
    private String dia;
    private String ano;
    private String diaSemana;
    private String hora;
    
    SimpleDateFormat horaFormatada = new SimpleDateFormat("hh:mm:ss");
    

    public String getMes() {
        return mes;
    }

    public String getDia() {
        return dia;
    }

    public String getAno() {
        return ano;
    }

    public String getDiaSemana() {
        return diaSemana;
    }
    
     public String getHora() {
        return hora;
    }
    
    public void LeData() {
    
        Date data = new Date(0);
        dia = ""+data.getDate();
        ano = ""+(1900 + data.getYear());
       
        switch (data.getMonth()) {
            case 0: mes = "Janeiro";break;
            case 1: mes = "Fevereiro";break;
            case 2: mes = "Março";break;
            case 3: mes = "Abril";break;
            case 4: mes = "Maio";break;
            case 5: mes = "Junho";break;
            case 6: mes = "Julho";break;
            case 7: mes = "Agosto";break;
            case 8: mes = "Setembro";break;
            case 9: mes = "Outubro";break;
            case 10: mes = "Novembro";break;
            case 11: mes = "Dezembro";break;
        }
        
        switch (data.getDay()) {
            case 0: diaSemana = "Domingo";break;
            case 1: diaSemana = "Segunda-feira";break;
            case 2: diaSemana = "Terça-feira";break;
            case 3: diaSemana = "Quarta-feira";break;
            case 4: diaSemana = "Quinta-feira";break;
            case 5: diaSemana = "Sexta-feira";break;
            case 6: diaSemana = "Sábado";break;
        }
    }
    
    public void LeHora(){
        Date horaAtual = new Date(0);
        hora = horaFormatada.format(horaAtual);
    }
}
