
package Provads1;

import java.time.LocalDate;
import java.time.Period;


public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco Endereco;
    protected Setor Setor;
    protected Genero Genero;
    protected double salario;
    protected EstadoCivil Estadocivil;
    protected LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco Endereco, Setor Setor, Genero Genero, double salario, EstadoCivil Estadocivil, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.Endereco = Endereco;
        this.Setor = Setor;
        this.Genero = Genero;
        this.salario = salario;
        this.Estadocivil = Estadocivil;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    public Setor getSetor() {
        return Setor;
    }

    public void setSetor(Setor Setor) {
        this.Setor = Setor;
    }

    public Genero getGenero() {
        return Genero;
    }

    public void setGenero(Genero Genero) {
        this.Genero = Genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EstadoCivil getEstadocivil() {
        return Estadocivil;
    }

    public void setEstadocivil(EstadoCivil Estadocivil) {
        this.Estadocivil = Estadocivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
   public int getIdade();
   return Period.between(dataNascimento,LocalDate.nov()).getYeats();
   
           
  
    @Override
    public String toString() {
        return  "Funcionario{" + "nome=" + nome +
                "\n cpf=" + cpf +
                "\n rg=" + rg +
                "\n Endereco=" + Endereco +
                "\n Setor=" + Setor +
                "\n Genero=" + Genero + ", salario=" + salario +
                "\n Estadocivil=" + Estadocivil + 
                "\n dataNascimento=" + dataNascimento + '}';
    }

    

   
    
   
}
